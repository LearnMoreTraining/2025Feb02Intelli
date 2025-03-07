package basicsofjava;

public class Variable {

   static int h = 600;// Global variable
   static int num ;

    public static void main(String[] args) {
        int a = 10 ;
        System.out.println(h);
        System.out.println(num);
    }

    public void m1(){
        int b = 400; // local variable
        System.out.println(b);
        System.out.println(h);
        num = 900 ;
    }

    public void m2(){

        System.out.println(h);
        System.out.println(num);
    }
    public static void m3(){

        System.out.println(h);
    }
}
