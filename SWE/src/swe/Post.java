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
public class Post {
    int post_id;
    public Item post_details=new Item();
    public String founder="";
    public void setid(){        
        post_id =SWE.posts.size();
    }
    public int getid(){return post_id;}
    
    public void setdata() throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("posts.txt"));
        String str ="";
        for(Post i:SWE.posts)
        {   
            System.out.println(i.post_details.getname());
            str+=i.post_details.getname();
            str+="|";
            str+=i.post_details.getcategory();
            str+="|";
            str+=i.post_details.getphoto();
            str+="|";
            str+=i.post_details.getdate().getDate();
            str+="/";
            str+=i.post_details.getdate().getMonth()+1;
            str+=i.post_details.getdate().getYear()+1900;
            str+="|";
            str+=i.founder;
            str+="|";
            for (int j=0;j<i.post_details.detalis.size();j++){
                str+=i.post_details.detalis.get(j).question;
                str+="|";
                str+=i.post_details.detalis.get(j).getans(0);
                str+="|";
                str+=i.post_details.detalis.get(j).getans(1);
                str+="|";
                str+=i.post_details.detalis.get(j).getans(2);
                str+="|";
            }
            writer.write(str);
            writer.newLine();
            str="";
    }

    
    writer.close();
    }
    
}
