import java.util.Scanner;

class nnum
{
   public static void main(String args[])
   {
   	int n,i = 1, count, c,sum=0;

   	Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the value of n:");
      n = scanner.nextInt();

      if(n >= 1)
      	{
         System.out.println("First "+n+" prime numbers are:");
        }

        for(count = 2; count <= n; i++)  
    {
        for(c = 2; c < i; c++)
        {
            if(i%c == 0)
                break;
        }

        if(c == i)  
        {
            System.out.println(i);
            sum+=i;
            count++;    
        }

   }
     System.out.println("SUM : "+sum);
}
}   