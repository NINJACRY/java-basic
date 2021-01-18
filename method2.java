class Main{

public int addnumbers(int a , int b){
int sum = a + b;

return sum;
}


public class method2{
public static void main(String[] args){

int n1 = 25;
int n2 = 30;

Main obj = new Main();
int result = obj.addnumbers(n1, n2);
System.out.println("sum is" +result);
}
}
}
