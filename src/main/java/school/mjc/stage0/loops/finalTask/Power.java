package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int temp;
        int result = 1;
        for (int i = 1; i <= power; i++) {
            temp = result * numberToPrint;
            result = temp;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
