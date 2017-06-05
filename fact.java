import java.util.*;
import java.util.Scanner;
class fact
public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         int fac=1;
        int a=s.nextInt();
        if(a<0)
            System.out.println("enter non neg no only");
        else
        {
            for(int i=1;i<=a;i++)
            {
               fac=fac*i;
               
            }
            System.out.println(fac);
          
        }
    }
    
}
