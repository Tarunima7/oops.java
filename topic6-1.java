//multiple inheritance use of interface with implements and extend

//base interface1
interface Mother
{
        void Mothersfeatures();         //function declaration
}

//base interface2
interface Father
{
        void Fathersfeatures();
}

//child interface inheriting two base interfaces

interface Son extends Mother,Father          //extends means that you are creating a subclass of the base class you are extending.
{
    void Displayfeature();
}
class Person implements Son                //Implements means you are using the elements of a Java Interface in your class.

{

    @Override                       //child extend parent 
    public void Mothersfeatures()           //function defination
    {
        System.out.println("hi, i'am mother");
        
    }

    public void Fathersfeatures()
    {
        System.out.println("hi, i'am father");
        
    }

    public void Displayfeature()
    {
        System.out.println("hi, i'am from both mather and father");
        
    }
}

public class Demo
{
    
    public static void main(String args[])
  {
    //Child child =new Child();             //generate error 
    Person person = new Person();

    person.Mothersfeatures();
    person.Fathersfeatures();
    person.Displayfeature();

  }

}





   
