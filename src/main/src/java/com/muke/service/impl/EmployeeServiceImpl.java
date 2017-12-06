package com.muke.service.impl;

import com.muke.dao.EmployeeDAO;
import com.muke.domain.Employee;
import com.muke.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public Employee login(Employee employee) {
        Employee exitexEmployee = employeeDAO.findByUserNameAndPassword(employee);

        return exitexEmployee;
    }
}
