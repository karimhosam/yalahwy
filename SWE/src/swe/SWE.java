package swe;

import java.util.ArrayList;

public class SWE {
    public static ArrayList<User> users=new ArrayList<>();
    public static ArrayList<Post> posts=new ArrayList<>();
    public static void main(String[] args) {
        ISignup I = new ISignup();
        I.show();
    }
    
}
