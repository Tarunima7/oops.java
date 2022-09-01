/* over riding */


//Base class
class Parent {
    public void printinfo() {
        System.out.println("Displays the name of parent ");
    }
} 

//Derived class
class Child extends Parent{
    public void printinfo() {
        System.out.println("Displays the name of child ");
    }
}

//Driver class
public class overriding {
    public static void main(String args[]){

        //Parent parent = new Parent();         //calling parent fun" through parent obj    #illegal
      
      // If a Parent type reference refers to a Child object Child's draw() method is called.
      //This is called RUN TIME POLYMORPHISM.
        Parent parent = new Child();            //calling child fun" through parent obj
        
        parent.area();

        /*
        simple explaination - parent is not a child. Inheritance is IS-A relationship.
        Parent object cannot be casted to child object unless it was a child object originally
        parent p = new child();
        child c = (child)p; // p originally holds a reference to child

        parent p = new parent();
        child c = (child)p; // p is a parent object hence this is illegal
        */

      // If a Parent type reference refers to a Child object Child's draw() method is called.
    //This is called RUN TIME POLYMORPHISM.
      
        Child child = new Child();            //calling child fun" through child obj
        // Parent child = new Parent();          //calling parent fun" through child obj #illegal

        child.printinfo();
    } 
}

