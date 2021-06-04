class exceptionexample{
public static void main(String[] args){

try{

int dividebyzero = 5 / 0;
System.out.println("Rest");
}

catch(ArithmeticException e) {
System.out.println("Arithmetic" + e.getMessage());
}
}
}

