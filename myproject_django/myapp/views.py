# myapp/views.py

from rest_framework.views import APIView
from rest_framework.response import Response
from rest_framework import generics
from .models import Employee
from .serializers import EmployeeSerializer
import requests

class MyAPIView(APIView):
    def get(self, request):
        data = {'message': 'Hello from Django Rest Framework!'}
        return Response(data)
    
class EmployeeList(generics.ListCreateAPIView):
    queryset = Employee.objects.all()
    serializer_class = EmployeeSerializer

    def get(self, request, *args, **kwargs):
        # Replace 'http://java_backend_url/api/employees/' with the actual URL of your Java backend API
        response = requests.get('http://java_backend_url/api/employees/')
        if response.status_code == 200:
            employees_data = response.json()
            serializer = EmployeeSerializer(data=employees_data, many=True)
            serializer.is_valid()
            return Response(serializer.data)
        else:
            return Response(status=response.status_code)