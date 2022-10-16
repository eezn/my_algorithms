package sort;

import sort.basic.Insertion;

public class Merge {

    final static int THRESHOLD = 3;
    static int[] buf;

    private static void merge(int[] data, int front, int pivot, int rear) {

        int p = 0;
        int i = front;
        while (i <= pivot) {
            buf[p++] = data[i++];
        }

        int j = 0;
        int k = front;
        while (i <= rear && j < p) {
            data[k++] = (buf[j] <= data[i]) ? buf[j++] : data[i++];
        }
        while (j < p) {
            data[k++] = buf[j++];
        }
    }

    private static void mergeSort(int[] data, int front, int rear) {

        int len = rear - front;
        if (len < THRESHOLD) {
            Insertion.sort(data, 0, data.length - 1);
            return;
        }

        int pivot = front + len / 2;

        mergeSort(data, front, pivot);
        mergeSort(data, pivot + 1, rear);
        merge(data, front, pivot, rear);
    }

    public static void sort(int[] data) {

        buf = new int[data.length];
        mergeSort(data, 0 , data.length - 1);
    }
}
