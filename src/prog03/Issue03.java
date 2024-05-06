package prog03;

public class Issue03 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = 0;
        while (i < data.length) {
            if (data[i] % 2 == 0) {
                System.out.println(data[i]);
            }
            i++;
        }
    }
}
