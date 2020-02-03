import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         String rev="";
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        for(int i=A.length()-1;i>=0;i--)
        {
            rev=rev+A.charAt(i);
        }
        if(A.equals(rev))
        {
            System.out.println("Yes");

        }
        else
        {
            System.out.println("No");

        }
       
       
        
    }
}


