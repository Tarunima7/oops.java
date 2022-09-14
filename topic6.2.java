// abstract method -> declaring / defining/ calling


class A{                            // normal class 
    void display();                // normal function 

}

abstract class B{                            // abstract class 
    void display();                  // abstract function declair here  not define 

}

//class c ectends abstract class B here we will define the function which is declair in abstract class B
class C extends B{
    void display()
    {
        System.out.println("defination of display method ");
    }        
     
// if i create again define the abstract method in  class C then it will no longer remain normal class it will be created as abstract class 

// such as 

abstract class C extends B{
    void display()
    {
        System.out.println("defination of display method ");
    }   
    abstract void show();     // defining the abstract method

}

//now for defining the show method we have to create the normal class .

class D extends C{   // because class D define the method of show() which was declared in class c 
    void show()
    {
        S.o.pln("defining the function here...");
    }
}


//now creating main function 
class abstract{
    public static void main( String args[]) {

        // creating the object of Class D because class D has extends of class A,B,C through inheritence 

        D obj=new D();
        D.show();
        D.display();

        //last 2 lines (51,52) can also be written as 

        S.o.pln(" calling show method: " + D.show);
        S.o.pln(" calling display method: " + D.display);
    }
        
    
}
  
  //completed 
