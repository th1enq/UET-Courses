public class Week4 {
    /**
     * Find the minimum value of an array.
     *
     * @param a
     * @param b
     * @return
     */
    public static int max2Int(int a, int b) {
        return a > b ? a : b;
    }

    /**
     * Find the minimum value of an array.
     *
     * @param arr
     * @return
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Calculate the BMI of a person.
     *
     * @param weight
     * @param height
     * @return
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = Math.round(weight / (height * height) * 10) / 10.0;
        if (bmi >= 25) {
            return "Béo phì";
        } else if (bmi >= 23) {
            return "Thừa cân";
        } else if (bmi >= 18.5) {
            return "Bình thường";
        } else {
            return "Thiếu cân";
        }
    }
}
