package com.muke.service.impl;

import com.muke.dao.DepartmentDAO;
import com.muke.domain.Department;
import com.muke.domain.PageBean;
import com.muke.service.DepartmentService;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentDAO departmentDAO;

    public void setDepartmentDAO(DepartmentDAO departmentDAO) {
        this.departmentDAO = departmentDAO;
    }

    public PageBean<Department> findByPage(Integer curentPage) {
        PageBean<Department> pageBean = new PageBean<Department>();
        pageBean.setCurrPage(curentPage);
        int pageSize = 3;
        pageBean.setPageSize(pageSize);
        int totalCount= departmentDAO.findCount();
        pageBean.setTotalCount(totalCount);
        double tc = totalCount;
        int totalPage = (int) Math.ceil(tc/pageSize);
        pageBean.setTotalPage(totalPage);
        int begin = (curentPage - 1)*pageSize;
        List<Department> departmentList = departmentDAO.findByPage(begin,pageSize);
        System.out.println("aaaa"+ curentPage);
        pageBean.setList(departmentList);
        return pageBean;
    }
}
