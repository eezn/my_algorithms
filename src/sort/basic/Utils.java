package sort.basic;

public class Utils {
    public static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    public static boolean isSorted(int[] data) {
        for (int i = 0; i < data.length - 1; ++i) {
            if (data[i] > data[i + 1])
                return false;
        }
        return true;
    }
}
