/*example of class and object

use of this keyword
calling a function with the help of object 

*/

class Pen{
    String color;
    String type;

    public void write()
    {
        System.out.println("select colour for pen");
    }

    public void printcolor()
    {
               System.out.println( this.color);
    }

    
}


public class demo{
    public static void main(String args[])
    {   
        Pen pen1=new Pen();      //object created
        pen1.color = "black";     //declaring the property of pen 
        pen1.type = "gel";

        Pen pen2= new Pen();
        pen2.color = "blue";
        pen2.type = "ball";

        pen1.write();               //fun" calling through object 
        pen1.printcolor();          // pen1 will go the fun: printcolor then it will go toh the property of pen then it will print the colour 
        pen2.printcolor();
    }
}
