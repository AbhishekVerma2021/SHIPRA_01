import java.util.Scanner;

public class Question_01
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st No.: ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd No.: ");
        int b=sc.nextInt();
        System.out.println("Sum : " + (a+b));
        System.out.println("Differenc : " + (a-b));
        System.out.println("Average : "+ ((float)(a+b)/2));
        System.out.println("Product : "+ (a*b));
        if(a-b>0)
        {
            System.out.println("Max integer : " + a);
        }
        else {
            System.out.println("Max integer : "+b);
        }
    }
}
