package prog03;

public class Issue02 {
    public static void main(String[] args){
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int datum : data) {
            if (datum % 2 == 0) System.out.println(datum);
        }
    }
}
