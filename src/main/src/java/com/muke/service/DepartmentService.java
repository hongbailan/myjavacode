package com.muke.service;

import com.muke.domain.Department;
import com.muke.domain.PageBean;

public interface DepartmentService {
    PageBean<Department> findByPage(Integer curentPage);

}
