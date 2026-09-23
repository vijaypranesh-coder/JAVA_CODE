import java.util.Scanner;
public class Admission_manage{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Enter Student ID: ");
 int studentId = sc.nextInt();
 
 System.out.print("Enter Student Name: ");
 String studentName = sc.next();
 
 System.out.print("Enter Department: ");
 String department = sc.next();
 
 System.out.print("Enter Age: ");
 int age = sc.nextInt();
 
 System.out.print("Enter Percentage: ");
 double percentage = sc.nextDouble();
 
 System.out.println("\n--- Student Admission Details ---");
 System.out.println("Student ID   : " + studentId);
 System.out.println("Student Name : " + studentName);
 System.out.println("Department   : " + department);
 System.out.println("Age          : " + age);
 System.out.println("Percentage   : " + percentage);

 sc.close();
    }
}