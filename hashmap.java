import java.util.WeakHashMap;
import java.util.HashMap;

public class hashmap{
public static void main(String[] args){

WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

numbers.put("Hello", 1);
numbers.put("Bye", 2);

System.out.println(numbers);

HashMap<String, Integer> numbers2 = new HashMap<>();

numbers2.put("Hello", 1);
numbers2.put("Bye", 2);

System.out.println(numbers2);

if(boolean numbers == numbers2)
boolean result;
System.out.println(result);


}
}
