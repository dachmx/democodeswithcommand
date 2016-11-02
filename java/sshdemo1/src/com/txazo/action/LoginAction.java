package com.txazo.action;

import com.txazo.domain.User;
import com.txazo.service.UserService;

/**
 * author ye
 * email: dachmx@163.com
 * date 2015年10月10日
 * time 上午12:03:19
 */

public class LoginAction extends ActionBase {  
    
    private static final long serialVersionUID = 1L;  
  
    private String username;  
    private String password;  
  
    private UserService userService;  
  
    public void setUserService(UserService userService) {  
        this.userService = userService;  
        System.out.println("sssssssssssss"+userService);
    }  
  
    public String login() throws Exception {  
        User user = new User(username, password);
        System.out.println(username+"——"+password+" sss "+userService);
        User login = userService.login(user);  
        if (login != null) {  
            session.put("user", login);  
            return SUCCESS;  
        }  
        return INPUT;  
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
  
}
