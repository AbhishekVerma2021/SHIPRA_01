import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question_11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Email");
        String str= sc.nextLine();
        Pattern pattern = Pattern.compile("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$");
        Matcher match=pattern.matcher(str);
        if(match.matches())
        {
            System.out.println("Valid Email!!!");
        }
        else {
            System.out.println("Invalid Email!!!");
        }
    }
}
