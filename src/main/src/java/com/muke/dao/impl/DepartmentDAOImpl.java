package com.muke.dao.impl;

import com.muke.dao.DepartmentDAO;
import com.muke.domain.Department;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

public class DepartmentDAOImpl extends HibernateDaoSupport implements DepartmentDAO {

    public List<Department> findByPage(int begin,int pageSize) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Department.class);
        List<Department>  list = (List<Department>) this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);

        return list;
    }

    public int findCount() {
        String hql = "select count(*) from Department";
        List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
        if(list.size() > 0){
            return list.get(0).intValue();
        }
        return 0;
    }
}
