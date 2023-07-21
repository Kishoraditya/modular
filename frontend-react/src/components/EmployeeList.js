// src/components/EmployeeList.js

import React, { useState, useEffect } from 'react';
import { getEmployees } from '../services/api';

const EmployeeList = () => {
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    // Fetch employee data from the Django backend API when the component mounts
    fetchEmployees();
  }, []);

  const fetchEmployees = async () => {
    try {
      const response = await getEmployees();
      setEmployees(response.data);
    } catch (error) {
      console.error('Error fetching employees:', error);
    }
  };

  return (
    <div>
      <h2>Employee List</h2>
      <ul>
        {employees.map((employee) => (
          <li key={employee.id}>
            {employee.name} - {employee.department} - {employee.designation} - {employee.salary}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default EmployeeList;
