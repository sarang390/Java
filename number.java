import java.util.Scanner;
class Number
{
public static void main(String args[])
{
int sum=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter first number:");
int a=input.nextInt();
System.out.println("Enter second number:");
int b=input.nextInt();
System.out.println("Enter third number:");
int c=input.nextInt();
System.out.println("Enter fourth number:");
int d=input.nextInt();
System.out.println("Enter fifth number:");
int e=input.nextInt();
System.out.println("Sum is:");
sum=a+b+c+d+e;
System.out.println(sum);
System.out.println("Numbers are:");
System.out.println(+a);
System.out.println(+b);
System.out.println(+c);
System.out.println(+d);
System.out.println(+e);
}
}
