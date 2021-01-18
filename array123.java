import java.util.ArrayList;
import java.util.Arrays;
public class array123{
public static void main(String[] args){

ArrayList <Integer> numbers = new ArrayList<>();

numbers.add(7);
numbers.add(6);
numbers.add(3);
numbers.add(4);

System.out.println("Array :" +numbers);

int m1 = numbers.get(2);
int m2 = numbers.remove(3);

numbers.set(3, 10);

System.out.println(numbers);

int numbers.sort(Comparator.naturalOrder());
System.out.println(numbers);
}
}
