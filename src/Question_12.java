import java.util.Scanner;

public class Question_12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        String str=String.valueOf(f);
        int in=str.indexOf('.');
        System.out.println(str.substring(in+1).length());
    }
}
