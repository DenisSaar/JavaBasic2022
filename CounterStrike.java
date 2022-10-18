public class CounterStrike {

    public static void main(String[]args) {
        String s ="Динамо!";
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int v = (a + b + c + d + e)/5;
        System.out.println(v);
        String z = "Спартак!";
        int a1 = 4;
        int b2 = 1;
        int c3 = 2;
        int d4 = 1;
        int e5 = 2;
        int v1 = (a1 + b2 + c3 + d4 + e5)/5;
        System.out.println(v1);
        boolean v3 = v > v1;
        System.out.println(v3);
        if ( v> v1)
        {
            System.out.println("Победила команда " + "Динамо!" + " набравшая " + v + " очков");
        }
        else {
            System.out.println("Победила команда " + "Спартак!" + " набравшая " + v + " очков");
        }




    }
}
