


    class x{
    public x(){
        super(); //this means call the constructor of the main method

        System.out.println("in a");
    }

    public x(int n){

    }
    }

    class B extends A{
    public B(){
        super();
        System.out.println("in B");

    }

    }

    public class ThisSuper{

    public static void main(String []Args ){
        B obj = new B();

    }
}