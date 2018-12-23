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
public class Login {
    public String email;
    public String password;
    ArrayList<User> s= new ArrayList<>(); 
    boolean checkvalid(){
        for(User i:s)
        {
            if((i.getemail().equals(email))&&i.getpass().equals(password))
            {
                for (int j=0;j<SWE.blocked.size();j++){
                    if (i.getemail().equals(SWE.blocked.get(j))){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
}
