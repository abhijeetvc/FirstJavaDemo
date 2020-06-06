//Variables in Java a) Instance Variables b) Class Variables c) Local Variables d) Parameters

//Primitive Data Types in Java : a)int b)double c)float d)char e)short f)byte g)boolean h)long
// i)String
public class HelloWorld {
     int a=20;   //Instance Variable
     int a1;
     double salary=50000.55;
    int speed; //valid
    int _speed; //valid but bad variable name
    int $speed;  //valid but bad variable name
    int speed1;  //valid
  //  int spe ed;  //Not valid
  //  int spe"ed; //Not valid

    {
        System.out.println("Hellloooooooo");
    }
    public static void main(String[] args){
        int i=10;   //variable declaration and i is a local variable
        int a=30;
        a=40;
        System.out.println("First Java Program----- ");
        System.out.println("Value of i :"+i);
       // HelloWorld hw=new HelloWorld();
        System.out.println("Value of a : "+a);
    }
}
