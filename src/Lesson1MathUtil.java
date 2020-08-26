import java.util.Scanner;

public class Lesson1MathUtil {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Sisesta funktsioon abs, min, max");
        String rida = scanner.nextLine();


        if (rida.equals("min")) {
            System.out.println("Sisesta 2 nr");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(" väikseim = " + min(a, b));
        } else if (rida.equals("max")) {
            System.out.println("Sisesta 2 nr");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Suurim = " + max(a, b));//String võrdlus
        } else if (rida.equals("abs")) {
            System.out.println("Sisesta 2 nr");
            int a = scanner.nextInt();
            System.out.println("Absoluutväärtus " + abs(a));
        } else if (rida.equals("isEven")) {
            int a = scanner.nextInt();
            if (isEven(a)) {
                System.out.println(a + " On paarisarv");
            } else {
                System.out.println(a + "Ei ole paarisarv");
            }
        }
    }




    public static int min(int a, int b) {
        // TODO tagasta a ja b väikseim väärtus
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b) {
        // TODO tagasta a ja b suurim väärtus
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int abs(int a) {
        // TODO tagasta a absoluut arv
        if (a > 0) {
            return a;
        }
        return a * (-1);
    }

    public static boolean isEven(int a) {
        // TODO tagasta true, kui a on paaris arv
        if (a % 2 == 0) ;
        // tagasta false kui a on paaritu arv
        return false;
    }

    public static int min(int a, int b, int c) {
        // TODO tagasta a, b ja c väikseim väärtus
        if (a <= b && a <= c) {

            return a;
        } else if (b <= a && b <= c) {
            return b;
        }
        return c;
    }

    public static int max(int a, int b, int c) {
        // TODO tagasta a, b ja c suurim väärtus
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        }
        return c;
    }
}
