import java.util.HashMap;
import java.util.TreeMap;

public class maps{
public static void main(String[] args){

TreeMap<String,Integer> numbers = new TreeMap<>();
numbers.put("One",1);
numbers.put("Two",2);
numbers.put("Three",3);

System.out.println(numbers);

HashMap<String, Integer> numbers2 = new HashMap<>(numbers);
System.out.println(numbers2);
}
}

