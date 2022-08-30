/*
creating constructor 


*/


class Student                       //class with object 
{
    String name;
    int age;

    public void printinfo()            //function for printing name & age
    {
        System.out.println(this.name);
        System.out.println(this.age);

    }
}


public class OOPS{
    
    public static void main(String agrs[])
    {
    Student s1 = new Student();              //obj. created 
     s1.name = "TARUNIMA";                  //property define for obj
     s1.age = 24;                                   

     s1.printinfo();
    }
}

____________________________________________________________

//EXAMPLE OF Non-Parameterized constructor


class Student                       //class with object 
{
    String name;
    int age;

    public void printinfo()            //function for printing name & age
    {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student()                     //function for constructure call alaso know as  ("Non-Parameterized constructor")
    {
        System.out.println("constructor called");
    }

}


public class OOPS{
    
    public static void main(String agrs[])
    {
    Student s1 = new Student();              //student() = constructor
     s1.name = "TARUNIMA";                  //property define for obj
     s1.age = 24;                                   

     s1.printinfo();
    }
}

-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------
//Parameterized constructor

class Student                       //class with object 
{
    String name;
    int age;

    public void printinfo()            //function for printing name & age
    {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student(String name, int age)                     //function for constructure call alaso know as  ("Parameterized constructor")
    {
       // System.out.println(this.name);              //this will give error
      //System.out.println(this.age);

      this.name=name;                                 
      this.age=age;
    }

}


public class OOPS{
    
    public static void main(String agrs[])
    {
    Student s1 = new Student("tarunima", 24);              //student() = constructor
    // s1.name = "TARUNIMA";                  //property define for obj
     //s1.age = 24;                                   

     s1.printinfo();
    }
}

--------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------
//copy constructor 


class Student                       //class with object 
{
    String name;
    int age;

    public void printinfo()            //function for printing name & age
    {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student(Student s2)                     //function for constructure call alaso know as  ("copy constructor")
    {
        this.name=s2.name;
        this.age=s2.age;
    }

    Student()
    {
        //defining empty constructor for student() in line no 31
        //because we have created constructoe for s2 so the constructor of student() can not be created bydefault,
    }
}


public class OOPS{
    
    public static void main(String agrs[])
    {
    Student s1 = new Student();              //student() = constructor
     s1.name = "TARUNIMA";                  //property define for obj
     s1.age = 24;                                   

     Student s2 = new Student(s1);              //copy constructoe s1 into s2

     //s2.name = "lalit";                  //we dont have to define property for s2 coz this is copy constructor we have copied properties from s1
     //s2.age = 27;

     s2.printinfo();            //printing the information of s2
    }
}
