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
public class Post {
    int post_id;
    public Item post_details= new Item();
    void setid(){
        ArrayList<Post>posts=new ArrayList<>();
        post_id =posts.size();
    }
    int getid(){return post_id;}
    
}
