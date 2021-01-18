public class Area2{

int length;
int breadth;

 int Area(int length, int breadth){
this.length = length;
this.breadth= length;
}
public void getArea(){
int area = length * breadth;
System.out.println("Area: "+ area);
}
}

class Main{
public static void main(String[] args){

Area rectangle = new Area(5,6);
rectangle.getArea();
}
}

