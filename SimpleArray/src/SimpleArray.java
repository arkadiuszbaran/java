//zad. 31
//ćw. 1
public class SimpleArray {
    public static void main(String[] args) {
        double[][] array = new double[3][];
        double[] a0 = {1.0, 1.5, 2.0};
        double[] a1 = {1.5, 2.0, 2.5};
        double[] a2 = {2.0, 2.5, 3.0};

        array[0] = a0;
        array[1] = a1;
        array[2] = a2;

        double sum1 = (array[0][0] * array[1][1] * array[2][2]) + (array[0][2] * array[1][1] * array[2][0]);
        double sum2 = array[0][1] + array[1][0] + array[1][1] + array[1][2] + array[2][1];
        double sum3 = array[0][0] + array[0][1] + array[0][2] + array[1][0] + array[1][2] + array[2][0] + array[2][1]
                + array[2][2];

        System.out.println("1: " + sum1);
        System.out.println("2: " + sum2);
        System.out.println("3: " + sum3);
    }
}
