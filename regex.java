public class regex{
public static void main(String[] args){

String regex = "^a...s$";
System.out.println("aaas".matches(regex));
System.out.println("a123s".matches(regex));
System.out.println("a...s".matches(regex));
System.out.println("aaasS".matches(regex));

}
} 
