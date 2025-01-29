public class Main {

    public static void main(String[] args) {
        /* konzol rajzolgató
         Négyzet és félpiramis rajzoló
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *

         *
         * *
         * * *
         * * * *
         * * * * *

         * * * * *
         * * * *
         * * *
         * *
         *
        */

        // spagetti kódban megvalósítva

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}