/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author karim
 */
public class Item {
    String name;
    String category;
    String photo;
    Date date;
    public ArrayList<Question> detalis= new ArrayList<>();
    void setname(String n){name=n;}
    void setcategory (String e){category=e;}
    void setphoto(String p){photo=p;}
    void setdate(Date p){date=p;}
    String getname(){return name;}
    String getcategory (){return category;}
    String getphoto(){return photo;}
    Date getdate(){return date;}
}
