package basicsofjava;

public class MethodLoadingEx {

    public static void main(String[] args) {

        MethodLoadingEx m = new MethodLoadingEx();
        m.m1(14,15);
    }

    public void m1(int a){
        System.out.println(a);
    }

    public void m1(String a){

    }

    public void m1(int b,int c){

    }
    public void m1(int b , int c , int d){

    }

}
