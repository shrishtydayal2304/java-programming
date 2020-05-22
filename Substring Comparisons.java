import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
       // SortedSet<String> s1= new TreeSet<String>();
        for(int i=0;i<s.length()-k+1;i++)
        {
           String s1= s.substring(i,i+k);

        if(i==0)
        {
            smallest =s1;
        }
        if(s1.compareTo(largest)>0)
        {
            largest =s1;
        }
        else if(s1.compareTo(smallest)<0)
        smallest=s1;
        }
        
        
       
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
