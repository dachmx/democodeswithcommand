package com.struts2.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.service.LoginService;

/**
 * author ye
 * email: dachmx@163.com
 * date 2015年10月9日
 * time 下午8:35:41
 */

public class LoginAction extends ActionSupport implements Action{
    private static final long serialVersionUID  =   1L ;
    private String username;
    private String password;
    
    private LoginService loginService;
    
    @Override
    public void validate()
    {
        
    }
    
    
    public String execute() throws Exception
    {
        boolean result=this.loginService.validate(username, password);
        if(result){
            return this.SUCCESS;
        }else{
            return this.ERROR ;
        }
        
        
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
    
    
    
}