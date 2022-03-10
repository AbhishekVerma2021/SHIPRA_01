import java.util.Scanner;

public class Question_12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        String str=String.valueOf(f);
        int i=str.indexOf('.');
        System.out.println(str.substring(i+1).length());
    }
}
