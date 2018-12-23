package swe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class SWE {
    public static ArrayList<User> users=new ArrayList<>();
    public static ArrayList<Post> posts=new ArrayList<>();
    public static ArrayList<String> blocked=new ArrayList<>();
    public static User logedin=new User();
    public static ArrayList<String> read(String file) throws IOException
    {
      BufferedReader br = new BufferedReader(new FileReader(new File(file))); 

      String st;
      ArrayList<String> b=new ArrayList<>();
      while ((st = br.readLine()) != null) 
        b.add(st); 
      return b;
    }
    public static void writeblocked() throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("blocked.txt"));
        for(String i:blocked)
        {
             writer.write(i);
             writer.newLine();
        }  
        writer.close();
    }

    public static void main(String[] args) throws IOException, ParseException {
        ArrayList<String>p= read("posts.txt");
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date;
        for(String i:p)
        {
            Post po=new Post();
            String[] parts=i.split("\\|");
            po.setid();
            po.post_details.setname(parts[0]);
            po.post_details.setcategory(parts[1]);
            po.post_details.setphoto(parts[2]);
            date=format.parse(parts[3]);
            po.post_details.setdate(date);
            po.founder=parts[4];
            for(int x=5;x<parts.length;x+=4)
            {
                Question q=new Question();
                q.question=parts[x];
                String[]a=new String[3];
                a[0]=parts[x+1];
                a[1]=parts[x+2];
                a[2]=parts[x+3];
                q.setans(a);
                po.post_details.detalis.add(q);
            }
            posts.add(po);
        }
        p=read("user.txt");
        for(String i:p)
        {
            User po=new User();
            String[] parts=i.split("\\|");
            po.setname(parts[0]);
            po.setemail(parts[1]);
            po.setpass(parts[2]);
            po.setphone(Integer.parseInt(parts[3]));
            users.add(po);
        }
        blocked = read("blocked.txt");
        mainfram.main(args);
        
    }
    
    
}
