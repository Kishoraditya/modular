package com.example.myproject.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOnboardingDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        // Implement your business logic here
        // This method will be executed as a service task in the BPMN process
        // You can access process variables, form data, etc., using the execution object
    }
}
