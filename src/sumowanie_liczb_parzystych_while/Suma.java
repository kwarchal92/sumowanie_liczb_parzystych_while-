package sumowanie_liczb_parzystych_while;

public class Suma {

    public static void main(String[] args)
    {
        int i = 1, suma = 0;

        System.out.print("Program sumuje liczby parzyste 1 do 100.");

        while(i <= 100)
        {
            if(i % 2 == 0) suma += i;
            i++;
        }

        System.out.println("\tWynikiem jest liczba:\t" + suma);
    }
}
