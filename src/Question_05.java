import java.util.Scanner;

public class Question_05
{
    public static void main(String[] args) {
        int arr[]=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Size="+arr.length);
        for(int a: arr)
        {
            System.out.print(a+" ");
        }
    }
}
