package sort.basic;

public class Bubble {

    public static void sort(int[] data) {
        for (int i = 1; i < data.length; ++i)
            for (int j = 0; j < data.length - i; ++j)
                if (data[j] > data[j + 1])
                    Utils.swap(data, j, j + 1);
    }

    public static void sort(int[] data, int front, int rear) {
        for (int i = 1; i < rear - front + 1; ++i)
            for (int j = front; j < rear; ++j)
                if (data[j] > data[j + 1])
                    Utils.swap(data, j, j + 1);
    }
}
