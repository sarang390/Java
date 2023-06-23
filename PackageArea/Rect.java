package grap;
import java.util.Scanner;
interface Area2
{
void get2();
void show2();
}
public class Rect implements Area2
{
int l,b;
public void get2()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the length:");
l=input.nextInt();
System.out.println("Enter the breadth:");
b=input.nextInt();
}
public void show2()
{
int area=l*b;
System.out.println("Area of the rectangle is :"+area);
}
}
