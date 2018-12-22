/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author karim
 */
public class Signup {
    public User user=new User();
    public Signup(){}
    void setdata() throws IOException{
    SWE.users.add(user);
    String str ="";
    for(User i:SWE.users)
    {
        str+=i.getname();
        str+="|";
        str+=i.getemail();
        str+="|";
        str+=i.getpass();
        str+="|";
        str+=Integer.toString(i.getphone());
        str+="\n";
    }
    BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt"));
    writer.write(str);
     
    writer.close();
    
    
    }
    public boolean checkvalid(){
        for(User i:SWE.users)
        {
            if((i.getemail().equals(user.getemail()))||i.getphone()==user.getphone())
                return false;
        }
        return true;
    }
}
