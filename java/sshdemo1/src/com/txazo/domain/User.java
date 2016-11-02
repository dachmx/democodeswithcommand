package com.txazo.domain;

/**
 * author ye
 * email: dachmx@163.com
 * date 2015年10月9日
 * time 下午9:31:29
 */

public class User {
    private int id;
    private String username;
    private String password;
    private String realname;
    private int age;
    private String sex;
    private String address;
    
    public User(){
    }
    
    public User(String uname, String pword){
        this.username=uname;
        this.password=pword;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getRealname() {
        return realname;
    }
    public void setRealname(String realname) {
        this.realname = realname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
