public class Lesson3 {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        // int[] x = new int [4];
        int[] x = {10, 20, 30, 40};
        System.out.println(sum2(x));

        System.out.println(factorial(4));
        System.out.println(alg(7));

        int a[] = {2, 6, 8, 4};
        //System.out.println(Arrays.toString(sort(a));

    }

    private static int alg(int i) {
        // TODO
        // Kui i on paaris arv tagasta i/2
        // Kui i on paaritu arv tagasta i*3+1
        if (i % 2 == 0) { // 9 % 3
            return i / 2;
        } else {
            return i * 3 + 1;
        }
    }


    public static int sum(int x, int y) {
        // TODO liida kokku ja tagasta x ja y väärtus
        int a = Integer.sum(x, y);

        return a;
    }

    public static int sum2(int[] x) {
        // Todo liida kokku kõik numbrid massivis x
        int b = 0;
        for (int i = 0; i < x.length; i++) {
            b += x[i];
        }
        return b;


    }

    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 4*3*2*1 = 24
        int pikkus = 4;
        int c = 1;  //faktor pikkus
        for (int i = 1; i <= pikkus; i++)

            c = c * i;

        return c;
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}
        int a[] = new int[a.length]
                int temp;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;


        return a;
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";

                String a = "Test";
                for(int i=a.length()-1;i>=0;i--) {

                }


        return "";
    }

    public static boolean isPrime(int h) {
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        if (h % 2 == 0) return true;
        for (int i = 3; i * i < h; i += 2)
            if (h % i == 0) return true;
        return false;


        //return false;

    }

}
