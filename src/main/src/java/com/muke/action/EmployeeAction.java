package com.muke.action;

import com.muke.domain.Employee;
import com.muke.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {
    private Employee employee = new Employee();

    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public String login(){
        System.out.println("执行了登录..");
        Employee employeeExitst = employeeService.login(employee);
        if(null == employeeExitst){
            this.addActionError("用户名或密码错误");
            return INPUT;
        }else{
            ActionContext.getContext().getSession().put("employeeExitst",employeeExitst);
            return SUCCESS;
        }
    }

    public Employee getModel() {
        return employee;
    }
}
