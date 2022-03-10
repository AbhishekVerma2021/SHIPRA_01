import java.util.Scanner;

public class Question_07
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String strarr[]=str.split(" ");
        for(String str1:strarr)
        {
            reverse(str1);
        }
    }
    public static void reverse(String str)
    {
      if((str==null)||(str.length()<=1))
      {
          System.out.print(str+" ");
          return;
      }
      char ch = str.charAt(str.length() - 1);
      System.out.print(ch);
      reverse(str.substring(0, str.length() - 1));
    }
}
