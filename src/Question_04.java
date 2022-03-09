import java.util.Scanner;

public class Question_04
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Grade=sc.nextLine();
        if (Grade.equals("A"))
        {
            System.out.println("Excellent!!!");
        }
        else if(Grade.equals("B"))
        {
            System.out.println("Very Good");
        }
        else if (Grade.equals("C"))
        {
            System.out.println("Good");
        }
        else if(Grade.equals("E")||Grade.equals("D"))
        {
            System.out.println("Poor");
        }
        else
        {
            System.out.println("Invalid Grade Entered");
        }

    }
}
