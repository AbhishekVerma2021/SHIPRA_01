import java.util.Scanner;

public class Question_08
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        try {
            int x=Integer.parseInt(str);
            System.out.println(x);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.fillInStackTrace());
        }
    }
}
