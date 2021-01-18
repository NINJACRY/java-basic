import java.util.Scanner;
public class cal{
public static void main(String[] args){

char operator;
Double n1, n2, result;

Scanner input = new Scanner(System.in);
System.out.println("Enter the operator +,-,*,/");
operator = input.next().charAt(0);

System.out.println("Enter 1st number");
 n1 = input.nextDouble();

System.out.println("Enter 2nd number");
 n2 = input.nextDouble();

switch(operator){
case'+':
result = n1 + n2;
System.out.println("Result:"+ result);
break;

case'-':
result = n1 - n2;
System.out.println("Result"+ result);
break;

case'*':
result = n1*n2;
System.out.println("Result"+ result);
break;

case'/':
result = n1/n2;
System.out.println("Result"+ result);
break;

default:
System.out.println("Invalid");
}
}
}


