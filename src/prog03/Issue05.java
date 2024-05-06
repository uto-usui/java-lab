package prog03;

public class Issue05 {
    public static void main(String[] args) {
        int[] data = {-10, 8, 6, -3, -1, 0, 5};
        double average = 0.0;
        for (int d : data) {
            average += d;
        }
        average = average / data.length;
        System.out.println("データの平均は" + average);
    }
}
