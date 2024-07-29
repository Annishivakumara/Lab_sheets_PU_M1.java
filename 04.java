import java.util.Scanner;
class Project1
{
public static void main(String[] args)
{
int option;
while(true)
{
Scanner sc=new Scanner(System.in);
System.out.println("\t\t1.Square");
System.out.println("\t\t2.Rectangle");
System.out.println("\t\t3.Circle");
System.out.println("\t\t4.Exit");
System.out.println("Enter the option:");
option=sc.nextInt();
switch(option)
{
case 1:
  System.out.println("Enter length of the side:");
  int s=sc.nextInt();
  System.out.println("Area:"+(s*s));
  System.out.println("Perimeter:"+(4*s));
  break;
case 2:
  System.out.println("Enter length and breadth:");
  int l=sc.nextInt();
  int b=sc.nextInt();
  System.out.println("Area:"+(l*b));
  System.out.println("Perimeter:"+(2*(l+b)));
  break;
case 3:
  System.out.println("Enter the radius:");
  int r=sc.nextInt(); 
  System.out.println("Area:"+(3.14*r*r));
  System.out.println("Perimeter:"+(2*3.14*r));
  break;
case 4:
  System.exit(0);
 break;
default:
  System.out.println("Invalid option");
  break;
}
}

}
}
