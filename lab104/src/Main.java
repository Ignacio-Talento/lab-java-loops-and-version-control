//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.println(maxMinDifference(array));

        int[] array2 = {5, 2, 10, 4, 9};
        findTwoSmallest(array2);

        double x = 2.0;
        double y = 3.0;
        System.out.println(calculateExpression(x, y));

    }
    public static int maxMinDifference(int[] array) {

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min;
    }
    public static void findTwoSmallest(int[] array) {

        int smallest1, smallest2;

        if (array[0] < array[1]) {
            smallest1 = array[0];
            smallest2 = array[1];
        } else {
            smallest1 = array[1];
            smallest2 = array[0];
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] < smallest1) {
                smallest2 = smallest1;
                smallest1 = array[i];
            } else if (array[i] < smallest2 && array[i] != smallest1) {
                smallest2 = array[i];
            }
        }

        System.out.println("Smallest 1: " + smallest1);
        System.out.println("Smallest 2: " + smallest2);




    }
    public static double calculateExpression(double x, double y) {
        double firsTerm = Math.pow(x, 2);

        double innerExpression = (4 * y / 5) - x;
        double secondTerm = Math.pow(innerExpression, 2);

        return firsTerm + secondTerm;
    }
}