import java.util.Scanner;

class EmployeeIDCard
{
    String OrganizationName,EmployeeName,EmployeeID,BloodGroup;
    EmployeeIDCard(String OrganizationName,String EmployeeName,String EmployeeID,String BloodGroup)
    {
        this.OrganizationName=OrganizationName;
        this.EmployeeID=EmployeeID;
        this.BloodGroup=BloodGroup;
        this.EmployeeName=EmployeeName;
    }
    public void display()
    {
        System.out.println("OrganizationName : " + OrganizationName);
        System.out.println("Employee ID : " + EmployeeID);
        System.out.println("Blood Group : " + BloodGroup);
        System.out.println("Employee Name : " + EmployeeName);
    }
}
public class Question_02
{
    public static void main(String[] args) {
        System.out.println("Enter Orgnization Name : ");
        Scanner sc=new Scanner(System.in);
        String OrganizationName= sc.nextLine();
        System.out.println("Enter Employee Name : ");
        String EmployeeName=sc.nextLine();
        System.out.println("Enter Employee ID :");
        String EmployeeID=sc.nextLine();
        System.out.println("Enter Blood group : ");
        String BloodGroup= sc.nextLine();
        EmployeeIDCard obj=new EmployeeIDCard(OrganizationName,EmployeeName,EmployeeID,BloodGroup);
        obj.display();
    }
}
