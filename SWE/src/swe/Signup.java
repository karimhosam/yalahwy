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
public class Signup {
    public static User user=new User();
    public Signup(){}
    void setdata(){SWE.users.add(user);};
    public boolean checkvalid(){
        for(User i:SWE.users)
        {
            if((i.getemail().equals(user.getemail()))||i.getphone()==user.getphone())
                return false;
        }
        return true;
    }
}
