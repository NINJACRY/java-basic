import java.io.*;

class exceptionex{

public static void findmyfile() throws IOException{

File newFile = new File("sleepthread.j");
FileInputStream stream = new FileInputStream(newFile);

}

public static void main(String[] args){

try {

findmyfile();
System.out.println("Found");
}

catch(IOException e){
System.out.println(e);
}
}

}


