import java.util.Scanner;
public class calender{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

String name_of_the_month = " ";
int daysinthemonth = 0;

System.out.println("enter the number");
int month = input.nextInt();

System.out.println("enter the year");
int year = input.nextInt();

switch(month){

 case 1:
 	name_of_the_month= "January";
 	daysinthemonth = 31;
 	break;
 
 case 2:
 	name_of_the_month= "February";
 	if(year%4==0 || year%400==0 && year%100!=0) {
 	daysinthemonth = 29;
 	} else{
 	daysinthemonth = 28;
 	}
 	break;
 
 case 3:
 	name_of_the_month = "March";
 	daysinthemonth = 31;
 	break;
 
 case 4:
 	name_of_the_month = "April";
 	daysinthemonth = 30;
 	break;
 
 case 5:
 	name_of_the_month = "May";
 	daysinthemonth = 31;
 	break;
 
 case 6:
 	name_of_the_month = "June";
 	daysinthemonth = 30;
 	break;
 
 case 7:
 	name_of_the_month = "July";
 	daysinthemonth = 31;
 	break;
 
 case 8:
 	name_of_the_month = "August";
 	daysinthemonth = 31;
 	break;
 
 case 9:
 	name_of_the_month = "September";
 	daysinthemonth = 30;
 	break;
 
 case 10:
 	name_of_the_month = "October";
 	daysinthemonth = 31;
 	break;
 
 case 11:
 	name_of_the_month = "November";
 	daysinthemonth = 30;
 	break;
 
 case 12:
 	name_of_the_month = "December";
 	daysinthemonth = 31;
 	break;
 
 }
 System.out.println("Name of the month: " + name_of_the_month + "\nDays in the month: " + daysinthemonth);
 }
 }
 
 
