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
public class Post {
    int post_id;
    public Item post_details=new Item();
    User founder=new User();
    void setid(){        
        
        post_id =SWE.posts.size();
    }
    int getid(){return post_id;}
    
}
