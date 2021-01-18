class lamp{

boolean isOn;

void turnOn(){
isOn=true;
System.out.println("ON?" +isOn);
}

void turnOff(){
isOn=false;
System.out.println("ON?"+isOn);
}
}
public class classexample{
public static void main(String[] args){

lamp led = new lamp();
lamp halogen = new lamp();

led.turnOn();
halogen.turnOff();
}
}

