package com.txazo.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.txazo.dao.BaseDao;

/**
 * author ye
 * email: dachmx@163.com
 * date 2015年10月9日
 * time 下午9:24:54
 */

public class BaseDaoImpl implements BaseDao {  
    
    private SessionFactory sessionFactory;  
  
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }  
  
    public Session getSession() {  
        return sessionFactory.getCurrentSession();  
    }  
  
    @Override  
    public <T> void save(T t) {  
        getSession().save(t);  
    }  
  
    @Override  
    public <T> void delete(T t) {  
        getSession().delete(t);  
    }  
  
    @Override  
    public <T> void delete(Class<T> entityClass, Integer id) {  
        getSession().delete(get(entityClass, id));  
    }  
  
    @Override  
    public <T> void update(T t) {  
        getSession().update(t);  
    }  
  
    @Override  
    public <T> T get(Class<T> entityClass, Integer id) {  
        return (T) getSession().get(entityClass, id);  
    }  
  
    @Override  
    public <T> List<T> findAll(String hql, Class<T> entityClass) {  
        return findAll(hql, entityClass, new Object[] {});  
    }  
  
    @Override  
    public <T> List<T> findAll(String hql, Class<T> entityClass, Object param) {  
        return findAll(hql, entityClass, new Object[] { param });  
    }  
  
    @Override  
    public <T> List<T> findAll(String hql, Class<T> entityClass,   
            Object[] params) {  
        Query query = getSession().createQuery(hql);  
        for (int i = 0; i < params.length; i++) {  
            query.setParameter(i, params[i]);  
        }  
        return (List<T>) query.list();  
    }  
  
    @Override  
    public <T> List<T> findByPage(final String hql, Class<T> entityClass,  
            final int firstResult, final int maxResult) {  
        return findByPage(hql, entityClass, new Object[] {}, firstResult,  
                maxResult);  
    }  
  
    @Override  
    public <T> List<T> findByPage(final String hql, Class<T> entityClass,  
            final Object param, final int firstResult, final int maxResult) {  
        return findByPage(hql, entityClass, new Object[] { param },  
                firstResult, maxResult);  
    }  
  
    @Override  
    public <T> List<T> findByPage(final String hql, Class<T>     
            entityClass, final Object[] params, final int firstResult,   
            final int maxResult) {  
        Query query = getSession().createQuery(hql);  
        for (int i = 0; i < params.length; i++) {  
            query.setParameter(i, params[i]);  
        }  
        query.setFirstResult(firstResult);  
        query.setMaxResults(maxResult);  
        return (List<T>) query.list();  
    }  
  
}