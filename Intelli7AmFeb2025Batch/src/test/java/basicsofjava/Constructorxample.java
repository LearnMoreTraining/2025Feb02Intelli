package basicsofjava;

public class Constructorxample {

    static int a ;
    static int b ;


    }

    public Constructorxample(int a, int b){
     this.a = a ;
     this.b = b;
    }


    public static void main(String[] args) {
       Constructorxample c = new Constructorxample(12);
        System.out.println(a);
        System.out.println(b);
    }
}
