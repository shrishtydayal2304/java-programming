import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        try{
            int x,y,r;
            Scanner sc=new Scanner(System.in);
            x=sc.nextInt();
            y=sc.nextInt();
            r=x/y;
            //we have to show what happens if exceptions occurs then let y=0
            if(y==0)
                throw new ArithmeticException("/ by zero");
             else
                 System.out.println(x/y);
        }
            catch(InputMismatchException e)
            {
                System.out.println("java.util.InputMismatchException");
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }


            }

        }


