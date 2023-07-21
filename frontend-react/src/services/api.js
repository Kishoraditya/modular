// src/services/api.js

import axios from 'axios';

const API_BASE_URL = 'http://example.com/api/'; // Replace with your Django backend API base URL

const api = axios.create({
  baseURL: API_BASE_URL,
  headers: {
    'Content-Type': 'application/json',
  },
});

export const getEmployees = () => {
  return api.get('employees/');
};

// Add more API services as needed for other endpoints
