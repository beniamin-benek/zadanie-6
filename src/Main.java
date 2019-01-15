public class Main {

    public static void main(String[] args) {

        Calc calc1 = new Calc();
        int number1 = 16;
        int number2 = 7;
        double radius1 = 1.3;
        double radius2 = 3;
        int number3 = 6;
        int number4 = 11;

        //test mtody isEven
        System.out.println("Liczba " + number1 + " jest parzysta: " + calc1.isEven(number1) + ".");
        System.out.println("Liczba " + number2 + " jest parzysta: " + calc1.isEven(number2) + ".\n");

        //test mtody isOdd
        System.out.println("Liczba " + number1 + " jest nieparzysta: " + calc1.isOdd(number1) + ".");
        System.out.println("Liczba " + number2 + " jest nieparzysta: " + calc1.isOdd(number2) + ".\n");

        //test metody circleField
        System.out.println("Pole koła o promieniu równym " + radius1 + " to około " + calc1.circleField(radius1) + ".");
        System.out.println("Pole koła o promieniu równym " + radius2 + " to około " + calc1.circleField(radius2) + ".\n");

        //test metody power
        System.out.println("Liczba " + number3 + " podniesiona do kwadratu to " + calc1.power(number3) + ".");
        System.out.println("Liczba " + number4 + " podniesiona do kwadratu to " + calc1.power(number4) + ".\n");

    }

}
