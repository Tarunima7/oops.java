//multiple inheritance

interface A{
        void Display();
}

interface B{
    void Show();
}

class AB implements A,B         //implements means you are using the elements of a Java Interface in your class.
{

    public void Display()
    {
        System.out.println("DISPLAY FUNCTION IS HERE" );
    }

    public void Show()
    {
        System.out.println(" SHOW FUNCTION IS HERE" );
    }
}

//class interface AB
public class MultipleInheritance
{
    public static void main(String args[])
    {
        AB obj=new AB();
        obj.Display();
        obj.Show();
    }
}
