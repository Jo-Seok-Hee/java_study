package staticQuiz;

public class MathArrayUtils {

    public static int sum(int[] array) {

        int sum = 0;
        for (int p : array) {

            sum = sum + p;
        }
        return sum;
    }

    public static double average(int[] array) {

        double average;
        int sum = 0;
        for (int p : array) {

            sum = sum + p;
        }
        average = (double)sum / array.length;

        return average;
    }

    public static int min(int[] array) {

        int min = array[0];
        for (int p : array) {

            if (p < min) {
                min = p;
            }
        }

        return min;
    }

    public static int max(int[] array) {

        int max = array[0];
        for (int p : array) {

            if (p > max) {
                max = p;
            }
        }

        return max;

    }

}
