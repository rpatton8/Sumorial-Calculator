package ryan.sumorialcalculator;

public class SumorialCalculator {

    public int calculateValue(int number) {
        int value = 0;
        for (int i = 1; i <= number; i++) {
            value += i;
        }
        return value;
    }

    public static void main(String[] arguments) {
        SumorialCalculator sumorial = new SumorialCalculator();
        int number = 252;
        int numValue = sumorial.calculateValue(number);
        System.out.println(number + "? = " + numValue);
    }

}