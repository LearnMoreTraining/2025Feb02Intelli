package basicsofjava;

public class ArrayExample {

    public static void main(String[] args) {

        int [] a = {12,56,89,90};//0,1,2,3 length - 4

        for(int u:a){
            System.out.println(u);
        }
        String [] b = {"lmti","learn","more"}; //0,1,2 length - 3

        System.out.println(a[2]);
        System.out.println(b[2]);
        System.out.println(a.length);
        System.out.println(b.length);

        for(int f=0; f < a.length ; f++){
            System.out.println(a[f]);
        }

        for(int d =0 ; d < b.length ; d++){
            System.out.println(b[d]);
        }

    }
}
