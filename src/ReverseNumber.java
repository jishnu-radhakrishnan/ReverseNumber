import java.util.Scanner;
public class ReverseNumber {
    //Method to reverse a number
    public int Reverse()
    {
        int reverse=0;
        int reminder=0;
        Scanner Usernumber=new Scanner(System.in);
        System.out.println("Enter the number =");
        int num=Usernumber.nextInt();                //To get a number from user
        while(num>0)                                 //To check whether entered value is more than 0 to be reversed
        {
            reminder=num%10;                         //To  get reminder
            reverse=reverse*10+reminder;             //To reverse number
            num=num/10;
        }
        return reverse;                             //To return value to main method
    }

    public static void main(String[] args) {
        ReverseNumber reverseNumber=new ReverseNumber();
        int number= reverseNumber.Reverse();
        System.out.println("The number in reversed form ="+ number);
    }
}
