import java.util.Scanner;

public class Question_03
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number = ");
        int a= sc.nextInt();
        if(a>0)
        {
            System.out.println("Numper is Positive!!!");
        }
        else if (a<0)
        {
            System.out.println("Number is Negative!!!");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
}
