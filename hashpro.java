public class hashpro{
public static void main(String[] args){

String str1 = "abcd";
String str2 = "efgh";

int str3 = str1.hashCode();
int str4 = str2.hashCode();

System.out.println(str1);
System.out.println(str2);
System.out.println(str3);
System.out.println(str4);
System.out.println(str3.equals(str4));
}
}
