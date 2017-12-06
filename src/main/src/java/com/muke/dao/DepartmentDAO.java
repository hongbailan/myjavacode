package com.muke.dao;

import com.muke.domain.Department;

import java.util.List;

public interface DepartmentDAO {
    List<Department> findByPage(int begin,int pageSize);

    int findCount();
}
