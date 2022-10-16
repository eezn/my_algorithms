package sort.basic;

public class Insertion {

    public static void sort(int[] data) {
        int i = 0;
        while (++i < data.length) {
            int temp = data[i];
            int j = i;
            while (--j >= 0 && temp < data[j]) {
                data[j + 1] = data[j];
            }
            data[j + 1] = temp;
        }
    }

    public static void sort(int[] data, int front, int rear) {
        int i = front;
        while (++i <= rear) {
            int temp = data[i];
            int j = i;
            while (--j >= front && temp < data[j]) {
                data[j + 1] = data[j];
            }
            data[j + 1] = temp;
        }
    }
}
