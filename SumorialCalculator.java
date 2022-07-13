package ryan.sumorialcalculator;

public class SumorialCalculator {

    public int calculateValueTheSlowWay(int number) {
        int value = 0;
        for (int i = 1; i <= number; i++) {
            value += i;
        }
        return value;
    }

    public int calculateValueTheFastWay(int number) {
        int value = 0;
        for (int i = 1; i <= number; i++) {
            value += i;
        }
        return (number * (number + 1)) / 2;
    }

    public static void main(String[] arguments) {
        SumorialCalculator sumorial = new SumorialCalculator();
        int number = 36;
        int numValue = sumorial.calculateValueTheFastWay(number);
        System.out.println(number + "? = " + numValue);
    }

}