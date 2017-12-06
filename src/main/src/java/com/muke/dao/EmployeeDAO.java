package com.muke.dao;

import com.muke.domain.Employee;

public interface EmployeeDAO {
    Employee findByUserNameAndPassword(Employee employee);
}
