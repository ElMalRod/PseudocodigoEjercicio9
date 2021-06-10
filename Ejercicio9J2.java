import java.util.Scanner;

public class Ejercicio9J2 {

    public static void main(String[] args) {
        // variables a utilizar
        Scanner sc = new Scanner(System.in);

        int Promedio1 = 0;
        int Promedio2 = 0;
        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;
        boolean ciclo = true;
        do {

            int T1;
            int T2;
            System.out.println("Ingrese el par de temperaturas 1");
            T1 = sc.nextInt();
            System.out.println("Ingrese el par de temperaturas 2");
            T2 = sc.nextInt();

            contador += T1;
            contador2 += T2;

            contador3++;

            if (T1 == 0) {

                ciclo = false;

            }

        } while (ciclo != false);

        Promedio1 = contador / contador3;
        Promedio2 = contador2 / contador3;

        System.out.println("El promedio de T1 es: " + Promedio1);
        System.out.println("El promedio de T2 es: " + Promedio2);

    }
}