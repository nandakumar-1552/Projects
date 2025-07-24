import java.util.Scanner;
class Nanda
{
public static void main(String args[])
{
int n,i,j;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number");
n=sc.nextInt(); 
for(i=0;i<n;i++)
{
for(j=0;j>=i;j++)
{
System.out.print("*\n");
} 
}
}
}