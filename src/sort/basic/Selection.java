package sort.basic;

public class Selection {

    public static void sort(int[] data) {
        for (int i = 0; i < data.length; ++i) {
            int min = i;
            for (int j = i + 1; j < data.length; ++j) {
                if (data[min] > data[j]) {
                    min = j;
                }
            }
            Utils.swap(data, i, min);
        }
    }

    public static void sort(int[] data, int front, int rear) {
        for (int i = front; i <= rear; ++i) {
            int min = i;
            for (int j = i + 1; j <= rear; ++j) {
                if (data[min] > data[j])
                    min = j;
            }
            Utils.swap(data, i, min);
        }
    }
}
