import java.util.Scanner;
public class EvenOdd
{
public static void main(String[] args){
Scanner scan= new Scanner(System.in);
System.out.println("enter the number");
int num=scan.nextln();
findevenodd(num);
}

public static void findevenodd(int sum)
{
if(num%2==0)
System.out.println(num+"is even");
else
System.out.println(num+"is odd");
}
}
