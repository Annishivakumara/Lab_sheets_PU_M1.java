import java.util.Scanner;
class Project1
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the sides");
    int s1=sc.nextInt();
    int s2=sc.nextInt();
    int s3=sc.nextInt();
    if ((s1>s2) && (s1>s3))
    {
        if ((s1*s1)==(s2*s2+s3*s3))
            System.out.println("Pythagorean Triplets");
        else
            System.out.println("Not a Pythagorean Triplets");
    }
    else if ((s2>s1) && (s2>s3))
    {
        if ((s2*s2)==(s1*s1+s3*s3))
            System.out.println("Pythagorean Triplets");
        else
            System.out.println("Not a Pythagorean Triplets");
    }
    else
    {
        if ((s3*s3)==(s1*s1+s2*s2))
            System.out.println("Pythagorean Triplets");
        else
            System.out.println("Not a Pythagorean Triplets");
    }
}
}




