package com.muke.dao.impl;

import com.muke.dao.EmployeeDAO;
import com.muke.domain.Employee;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

public class EmployeeDAOImpl extends HibernateDaoSupport implements EmployeeDAO {

    public Employee findByUserNameAndPassword(Employee employee) {
        String hql = "from Employee where username = ? and password= ?";
        List<?> list =  this.getHibernateTemplate().find(hql,employee.getUsername(),employee.getPassword());
        if(list.size()>0){
            return (Employee) list.get(0);
        }else {
            return null;
        }
    }

}
