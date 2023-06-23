package grap;
import java.util.Scanner;
interface Area1
{
void get1();
void show1();
}
public class Square implements Area1
{
int a;
public void get1()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the side:");
a=input.nextInt();
}
public void show1()
{
int area=a*a;
System.out.println("Area of the square is :"+area);
}
}
