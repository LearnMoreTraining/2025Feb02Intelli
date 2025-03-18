package basicsofjava;

public class ExceptionHandling {

    public static void main(String[] args) {

        String a = "123";
       final double pie = 2.14 ;
        try {
            int h = Integer.parseInt(a);
            System.out.println(h * 2);
            System.out.println(pie);
        }
        catch(NumberFormatException e){
           String f = a.substring(1);
            int h = Integer.parseInt(f);
            System.out.println(h * 2);
        }
        finally {
            System.out.println("aa");
        }
    }
}
