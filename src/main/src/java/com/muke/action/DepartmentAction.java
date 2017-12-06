package com.muke.action;

import com.muke.domain.Department;
import com.muke.domain.PageBean;
import com.muke.service.DepartmentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DepartmentAction extends ActionSupport implements ModelDriven<Department> {
    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    private DepartmentService departmentService;
    private Department department = new Department();

    public Department getModel() {
        return department;
    }

    private Integer currPage = 1;

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public String findAll(){
        PageBean<Department> pageBean = departmentService.findByPage(currPage);
        ActionContext.getContext().getValueStack().push(pageBean);
        return "findAll";
    }
}
