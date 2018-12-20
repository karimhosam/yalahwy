/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;
public class Question {
    public String question;
    String []answer=new String[3];
    void setans(String a[]){
        answer[0]=a[0];
        answer[1]=a[1];
        answer[2]=a[2];
    }
    String getans(int i){return answer[i];}
    
    
}
