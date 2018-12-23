/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;

/**
 *
 * @author karim
 */
public class User {
    String name;
    String email;
    String password;
    int phone_num;
    int count=0;
    public User(){}
    public void setname(String n){name=n;}
    public void setemail (String e){email=e;}
    public void setpass(String p){password=p;}
    public void setphone(int p){phone_num=p;}
    public String getname(){return name;}
    public String getemail (){return email;}
    public String getpass(){return password;}
    public int getphone(){return phone_num;}
    
}
