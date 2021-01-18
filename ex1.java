public class ex1{
public static void main(String[] args){

int ar[] = {1,2,3,4,5,6,7,8,9,10};
int sum = 0;

for(int num: ar ){
sum = sum + num;
}
int average = sum / ar.length;
System.out.println(average);
}
}

