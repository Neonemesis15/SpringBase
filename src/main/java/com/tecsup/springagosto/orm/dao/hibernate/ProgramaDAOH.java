package com.tecsup.springagosto.orm.dao.hibernate;


import com.tecsup.springagosto.orm.dao.BaseHibernateDAO;
import com.tecsup.springagosto.orm.dao.ProgramaDAO;
import com.tecsup.springagosto.orm.model.Programa;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("programaDAO")
@Transactional
public class ProgramaDAOH extends BaseHibernateDAO implements ProgramaDAO{

    public List<Programa> all() {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        return criteria.list();

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Programa find(Long id) {
        Criteria criteria= this.getSession().createCriteria(Programa.class);
        criteria.add(Restrictions.eq("id", id));
        return (Programa) criteria.uniqueResult();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void save(Programa t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.getSession().save(t);
    }

    public void update(Programa t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.getSession().update(t);
    }

    public void delete(Programa t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.getSession().delete(t);
    }

}
