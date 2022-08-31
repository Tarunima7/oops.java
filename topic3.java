//method overloading: creating same namefunction  but different arguments.

class Student                       //class with object 
{
    String name;
    int age;

    public void printinfo(String name)            //creating method overloading ----1
    {
        System.out.println(name);
    }

    public void printinfo(int age)                 //creating method overloading ----2
    {
        System.out.println(age);
    }
    public void println(String name, int age)       //creating method overloading ----3 same name but different function 
    {
        System.out.println(name + " " + age);
    }

    
}


public class overloading{

    public static void main(String agrs[])
    {
    Student s1 = new Student();              //obj. created 
     s1.name = "TARU";                  //property define for obj
     s1.age = 24;                                   

   
     s1.printinfo(s1.name);             //calling function overloading 
     s1.printinfo(s1.age);
     //s1.printinfo(s1.name, s1.age);

    }
}
