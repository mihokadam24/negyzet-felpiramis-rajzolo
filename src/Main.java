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
        drawSeparator();
        drawSquare();
        drawSeparator();
        drawPyramidOne();
        drawSeparator();
        drawPyramidTwo();
        drawSeparator();
    }

    public static void drawSeparator() {
        System.out.println("----------");
    }

    // kiszervezve funkciókba
    public static void drawSquare() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawPyramidOne() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawPyramidTwo() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}