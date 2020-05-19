import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {



    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int d,q,x,y;
        ArrayList[] set= new ArrayList[n];
        for(int i=0;i<n;i++)
        {
        d=sc.nextInt();
        set[i]=new ArrayList();
        for(int j=0;j<d;j++)
        {
        set[i].add(sc.nextInt());
    }
        }
q=sc.nextInt();
for(int i=0;i<q;i++)
{
 x=sc.nextInt();
 y=sc.nextInt();
try
{
    System.out.println(set[x-1].get(y-1));
    } catch(Exception e){
            System.out.println("ERROR!");
        }
    }
}

}
        


