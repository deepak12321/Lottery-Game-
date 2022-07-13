import java.util.*;
import java.lang.Math;
public class Lottery {
    void check(int num1,int num2)
    {
        double arr[] = new double[2];
        double a = Math.random()*10;
        double b = Math.random()*10;
        arr[0]=Math.round(a);
        arr[1]=Math.round(b);
        System.out.println("Entered Number : "+num1+" "+num2);
        System.out.printf("Lottery Number : %d %d\n",(int)arr[0],(int)arr[1]);
        if((num1==arr[0]&&num2==arr[1]))
            System.out.println("Perfect Match\n Winning Amount = $60,000,000");
        else if(num1==arr[1] && num2==arr[0])
            System.out.println("Same Digit\n Winning Amount = $60,000");
        else if((arr[0]==num1)||(arr[0]==num2)||(arr[1]==num1)||(arr[1]==num2))
            System.out.println("Single Digit Matched\n Winning Amount = $600");
        else
            System.out .println("Number Mismatched ! \n Better Luck Next Time");
    }
    public static void main(String []  args)
    {
        Lottery obj = new Lottery();//Object
        Scanner scan = new Scanner (System.in);//Scanner object
        int a,b,c=1,d=0;
        System.out.println("\t\tWelcome to Deepak Lottery \n\t\t$60 chargable for each chance\n************************************************************************** ");
        System.out.println("Rules : You Have to Enter Two Numbers Seperately (number a and number b)\n\tif a single or both digits are same as the lottery number generated then \n\tthere is "
                + "wining prize accordngly\n\tNote :Numbers Should be between 0-9 otherwise you will loose \n\n\t\t Best Of Luck");
        while(c !=0)
        {
        System.out.println("Enter Number a :");
        a= scan.nextInt();
        System.out.println("Enter Number b :");
        b=scan.nextInt();
        obj.check(a, b);   
        d=d+60;
            System.out.println("\n Try Again (Press 1 and Enter \n\t($60 Chargeble)\n\nCheckout(press 0 and Enter)");
            c=scan.nextInt();
        }
        System.out.println("Thank You for Using our service \n please pay $"+d+" to Deepak For The Game");
    }
}
