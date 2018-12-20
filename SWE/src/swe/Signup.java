/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;

import java.util.ArrayList;

/**
 *
 * @author karim
 */
public class Signup {
    public static User user=new User();
    public Signup(){}
    void setdata(ArrayList<User> S){S.add(user);};
    public boolean checkvalid(ArrayList<User> s){
        for(User i:s)
        {
            if((i.getemail().equals(user.getemail()))||i.getphone()==user.getphone())
                return false;
        }
        return true;
    }
}
