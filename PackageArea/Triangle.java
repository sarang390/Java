package grap;
import java.util.Scanner;
interface Area4
{
void get4();
void show4();
}
public class Triangle implements Area4
{
int h,b;
public void get4()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the height:");
h=input.nextInt();
System.out.println("Enter the breadth:");
b=input.nextInt();
}
public void show4()
{
double area=(0.5*h*b);
System.out.println("Area of the triangle is :"+area);
}
}
