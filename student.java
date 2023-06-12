import java.util.Scanner;
class MCA
{
int strength;
String department,hod;
void getdetails()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the department name:");
dpt=input.next();
System.out.println("Enter hod name:");
hod=input.next();
System.out.println("Enter total strength:");
int strength=input.nextInt();
}
void displaydetails()
{
System.out.println("Department:" +dpt);
System.out.println("Hod:" +hod);
System.out.println("Strength:" +strength);
}
}
class S1 extends MCA
{
String stdname,address;
int rollno;
void readStudents()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter name:");
stdname=input.next();
System.out.println("Enter Roll No.:");
int rollno=input.nextInt();
System.pot.println("Enter Address:");
address=input.next();
}
void displayAlldetails()
{
displaydetails();
System.out.println("Student details:");
System.out.println("name:" +stdname+ "rollno:" +rollno+ "address:" +address);
}
}
          