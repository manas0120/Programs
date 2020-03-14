import java.util.*;

public class objargsone
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int h,m,se;

    System.out.println("Enter Hours - ");
    h=s.nextInt();

    System.out.println("Enter minutes - ");
    m=s.nextInt();

    System.out.println("Enter Seconds - ");
    se=s.nextInt();

    time obj=new time(h,m,se);

    //--------------------------------------------------------------------------

    System.out.println("Enter Hours - ");
    h=s.nextInt();

    System.out.println("Enter minutes - ");
    m=s.nextInt();

    System.out.println("Enter Seconds - ");
    se=s.nextInt();

    time obj1=new time(h,m,se);

    obj=obj.add(obj1);

    obj.show();
  }
}


class time
{
int hrs,min,sec;
int hh,mm;

time(){}

  time(int h,int m,int se)
  {
    hrs=h;
    min=m;
    sec=se;
  }

  time add(time t)
  {
    time tt=new time();

    tt.sec=sec+t.sec;
    if(tt.sec>59)
    {
      mm=tt.sec/60;
      tt.sec=tt.sec%60;
    }

    tt.min=min+t.min;
    tt.min+=mm;
    if(tt.min>59)
    {
      hh=tt.min/60;
      tt.min=tt.min%60;
    }

    tt.hrs=hrs+t.hrs;
    tt.hrs+=hh;

    return tt;
  }



  void show()
  {
    System.out.println("------------------- ANSWER !!!! ------------------------");
System.out.println("HOURS : MINUTES : SECONDS --> "+hrs+" : "+min+" : "+sec);
    System.out.println("---------------------------------");
  }
}
