package com.struts2.service;

/**
 * author ye
 * email: dachmx@163.com
 * date 2015年10月9日
 * time 下午8:37:07
 */

public class LoginService {
    public boolean validate(String username,String password) throws Exception{
        boolean flag=false;
        if(username.equals("tom")&&password.equals("111111")){
            System.out.println("this is in service");
            flag=true;
        }
        return flag;
    }
}
