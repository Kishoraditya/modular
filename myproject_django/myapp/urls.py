# myapp/urls.py

from django.urls import path
from .views import MyAPIView
from .views import EmployeeList


urlpatterns = [
    path('myapi/', MyAPIView.as_view(), name='myapi'),
    path('employees/', EmployeeList.as_view(), name='employee-list'),
]
