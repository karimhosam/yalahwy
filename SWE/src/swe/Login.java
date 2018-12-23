/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author karim
 */
public class Login {
    public String email;
    public String password; 
    boolean checkvalid(){
        for(User i:SWE.users)
        {
            if((i.getemail().equals(this.email))&&i.getpass().equals(this.password))
            {
                for (int j=0;j<SWE.blocked.size();j++){
                    if (this.email.equals(SWE.blocked.get(j))){
                        JOptionPane.showMessageDialog(null, "This Account Was Blocked", "Error",JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                }
                SWE.logedin=i;
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "wrong username or password", "Error",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
}
