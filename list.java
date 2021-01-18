import java.util.List;
import java.util.ArrayList;

public class list{
public static void main(String[] args){
List<Integer> numbers = new ArrayList<>();

numbers.add(4);
numbers.add(5);
numbers.add(6);

System.out.println("List :" +numbers);

int n1 = numbers.get(1);
System.out.println("Accessed :" + n1);

int n2 = numbers.remove(2);
System.out.println("Removed :" + n2);

System.out.println(numbers);

}
}
