package com.txazo.service.impl;

import java.util.List;

import com.txazo.dao.BaseDao;
import com.txazo.domain.User;
import com.txazo.service.UserService;

/**
 * author ye
 * email: dachmx@163.com
 * date 2015年10月9日
 * time 下午11:18:37
 */

public class UserServiceImpl implements UserService {  
    
    private BaseDao baseDao;  
  
    public void setBaseDao(BaseDao baseDao) {  
        this.baseDao = baseDao;  
    }  
  
    @Override  
    public User login(User user) {  
        List<User> list = baseDao.findAll(  
                "from User where username = ? and password = ?", User.class,  
                new Object[] { user.getUsername(), user.getPassword() });  
        if (list.size() == 1) {  
            return list.get(0);  
        }  
        return null;  
    }  
  
}
