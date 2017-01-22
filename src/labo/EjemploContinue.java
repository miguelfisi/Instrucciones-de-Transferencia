package labo;

/**
 *
 * @author miguel
 * repetitiva condicional y de trasnferencia
 */

public class EjemploContinue {

    public static void main(String[] args) {

        int x = 9;
            while(x<=99){
            ++x;
            //dejando pasar a los multiplos de 7
            if((x%7)!=0){
                continue;
            }
                System.out.println(x);
            }
    }
}
