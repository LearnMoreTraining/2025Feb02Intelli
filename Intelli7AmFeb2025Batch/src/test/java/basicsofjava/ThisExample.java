package basicsofjava;

public class ThisExample {

    int a = 500;

    public static void main(String[] args) {
        ThisExample t = new ThisExample();
        t.m1();
        t.m2();
    }

    public void m1(){
        int a = 100 ; // local variable
        System.out.println(a);
        System.out.println(this.a);
    }

    public void m2(){
        System.out.println(a);
    }
}
