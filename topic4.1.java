//MethodOverridingDemo 

//Base class
class Shape
{
  void draw()
  {
    System.out.println("Inside the method of Parent class ");
    System.out.println("Drawing Shapes");
  }
}

//Derived class
class Circle extends Shape
{
  //Overriding method of base class with different implementation
  @Override
  void draw()
  {
    System.out.println("Inside the overridden method of the child class ");
    System.out.println("Drawing Circle");
  }
}

//Driver class
public class MethodOverridingDemo
{
  public static void main(String args[])
  {
    //creating object of Base class ---> Shape
    // If a Parent type reference refers to a Parent object, then Parent's draw() method is called

    Shape obj = new Shape();
    obj.draw();

    // If a Parent type reference refers to a Child object Child's draw() method is called.
    //This is called RUN TIME POLYMORPHISM.

    Shape obj1=new Circle();
    obj1.draw();
  }
}

output :
/*
Inside the method of Parent class 
Drawing Shapes
Inside the overridden method of the child class 
Drawing Circle
*/
---------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------
