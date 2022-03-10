import java.util.Scanner;

public class Question_06
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        int max=0,min=1;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
            if(i==0)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}
