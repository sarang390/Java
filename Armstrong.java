class Armstrong
{
public static void main(String args[])
{
int num=153;
int k=num;
int rem=0;
int sum=0;
while(num>0)
{
rem=num%10;
sum=sum+rem*rem*rem;
num=num/10;
}
if(k==sum)
{
System.out.println("Number is Armstrong");
}
else
{
System.out.println("Number is not Armstrong");
}
}
}
