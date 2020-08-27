import java.math.BigDecimal;

public class Lesson2 {

    public static void main(String[] args) {
        //  exercise1();
        //  exercise2(4);
        // exercise3(3, 3);
        fibonacci(5);
        exercise5();
    }
/*
    public static void exercise1() {
        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta 10 täisarvu");
        for (int i = 1; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 9; i > 0; i--) {
            System.out.println(a[i]);
        }
    }
    // TODO loo 10 elemendile täisarvude massiv
    // TODO loe sisse konsoolist 10 täisarvu
    // TODO trüki arvud välja vastupidises järiekorras


    public static void exercise2(int x) {
        // TODO prindi välja x esimest paaris arvu
        // Näide:
        // Sisend 5
        // Väljund 2 4 6 8 10

        for( int i = 2; i <= x * 2 ; i += 2) {
            System.out.println(i + " ");
        }
        (int i = 2; i <= x i++) {
        System.out.print(2* i + " ");
        }

    }


    public static void exercise3(int x, int y) {
        // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
        // TODO näiteks x = 3 y = 3
        // TODO väljund
        // print ei tee reavahetust, println vahetab rida


        for (int i = 1; i <= x; i++) {
            // 1 2 3
            // 2 4 6
            // 3 6 9

            System.out.println("");
            {
                for (int j = 1; j <= y; j++) {
                    System.out.print(i * j + " ");
                }
            }
        }
    }
*/
    public static int fibonacci(int n) {
        // TODO
        // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
        // 0, 1, 1, 2, 3, 5, 8, 13, 21
        // Tagasta fibonacci jada n element
        int f1 = 0;
        int f2 = 1;
        int f3;
        int fib0=0;
        if (n ==0) {
            System.out.println("Ei saa panna");
            //else if(n == 1) {
                
            //}
        }
        System.out.print(f1 + " " + f2);;
        //int f3;
        for(int i=2; i<n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        return 0;
    }

    public static void exercise5() {
        // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
    }

    public static void exercise6() {
        /*
            Kirjutada Java programm, mis loeb failist visits.txt sisse looduspargi külastajad erinevatel jaanuari päevadel ning
            a) sorteerib külastuspäevad külastajate arvu järgi kasvavalt ning prindib tulemuse konsoolile;
            b) prindib konsoolile päeva, mil külastajaid oli kõige rohkem.
            Faili asukoht tuleb programmile ette anda käsurea parameetrina.

            //päriselt raske
         */
    }

    public static void exercise7() {
        // TODO arvuta kasutades BigDecimali 1.89 * ((394486820340 / 15 ) - 4 )
        BigDecimal a = new BigDecimal(1.89);
        BigDecimal b = new BigDecimal("394486820345");
        BigDecimal c = new BigDecimal("15");
        BigDecimal d = new BigDecimal("4");
    }

    public static void exercise8() {
        /*
        Failis nums.txt on üksteise all 150 60-kohalist numbrit.

        Kirjuta programm, mis loeks antud numbrid failist sisse ja liidaks need arvud kokku ning kuvaks ekraanil summa.
        Faili nimi tuleb programmile ette anda käsurea parameetrina.

        VASTUS:
        Õige summa: 77378062799264987173249634924670947389130820063105651135266574
         */
        //päriselt raske
    }

    public static void exercise9() {
        /* TODO
        Sama mis eelmises ülesandes aga ära kasuta BigInt ega BigDecimal klassi
         */

        //päriselt raske
    }

}
