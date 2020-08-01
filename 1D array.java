import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       
        int a []= new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i]=scan.nextInt();
        }

         
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}


![image](https://user-images.githubusercontent.com/60177793/89106023-04b42180-d444-11ea-8f38-3cc47722e104.png)
	 
