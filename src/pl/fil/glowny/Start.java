package pl.fil.glowny;

import java.util.Objects;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        //wyswielWhile();
        //wyswietlDoWhile();
        //testLiczb();
        testWhile();
        testDoWhile();
    }

    private static void testDoWhile() {
        int i = 240;
        do {
            i++;
            System.out.println("Wykonuję coś dla i równego : " + i);
        } while (i < 10);
    }

    private static void testWhile() {
        int i = 1240;
        while (i < 10) {
            i++;
            System.out.println("Wykonuję coś dla i równego : " + i);
        }
    }

    private static void testLiczb() {

        int zero = 0;

        int a = 100;
        float af = 10;
        Float df = 10F;

        short b = Short.MAX_VALUE;
        short c = (short) (a + b);

        int d = a + b;

        System.out.println("Suma " + a + " i " + b + " wynosi: " + c);
        System.out.println("Suma " + a + " i " + b + " wynosi: " + d);

        df = af / zero;
        System.out.println("" + af + " podzielić przez  " + zero + " wynosi: " + df);

        if (df.isInfinite()) {
            System.out.println("" + af + " podzielić przez  " + zero + " daje liczbę nieskończoną");
        }

        if (df.isNaN()) {
            System.out.println("" + af + " podzielić przez  " + zero + " nie jest liczbą");
        } else {
            System.out.println("" + af + " podzielić przez  " + zero + " nie jest NaN");
        }


        d = a / zero;
        System.out.println("" + a + " podzielić przez  " + zero + " wynosi: " + d);

        Float fi = Float.NaN;
    }


    private static void wyswietlDoWhile() {

        System.out.println("Wpisz coś, zakończ przez '/q'");

        Scanner in = new Scanner(System.in);

        String daneWejsciowe = "";
        String cos = "";

        do {
            cos = in.next();
            daneWejsciowe = daneWejsciowe + " " + cos;

            System.out.println("daneWejsciowe: " + daneWejsciowe);
            System.out.println("coś: " + cos);

            if (Objects.equals(cos, "/q")) {
                return;
            }

            System.out.println("Wpisz coś kolejnego, zakończ przez '/q'");
        } while (in.hasNext());
    }

    private static void wyswietlWhile() {
        System.out.println("Wpisz coś, zakończ przez '/q'");

        Scanner in = new Scanner(System.in);

        String daneWejsciowe = "";
        String cos = "";

        while (in.hasNext()) {
            cos = in.next();
            daneWejsciowe = daneWejsciowe + " " + cos;

            System.out.println("daneWejsciowe: " + daneWejsciowe);
            System.out.println("coś: " + cos);

            if (Objects.equals(cos, "/q")) {
                return;
            }

            System.out.println("Wpisz coś kolejnego, zakończ przez '/q'");
        }


    }
}
