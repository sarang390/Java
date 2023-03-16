import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
int r=0,s=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter an interger:");
int a=input.nextInt();
System.out.println("Reverse of the number is:");
while(a>0)
{
r=a%10;
s=s*10+r;
a=a/10;
}
System.out.println(s);
}
}
