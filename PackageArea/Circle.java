package grap;
import java.util.Scanner;
interface Area3
{
void get3();
void show3();
}
public class Circle implements Area3
{
int r;
double pi=3.14;
public void get3()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter radius:");
r=input.nextInt();
}
public void show3()
{
double area=pi*r*r;
System.out.println("Area of the rectangle is :"+area);
}
}
