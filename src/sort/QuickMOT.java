package sort;

import sort.basic.Utils;

/**
 * Nearly in-place, Median Of Three
 */
public class QuickMOT {

    // THRESHOLD = 3 고정 (threeSort 기준)
    // 변경 시 threeSort 부분 포함 코드 수정 필요
    final static int THRESHOLD = 3;

    private static void threeSort(int []data, int front, int mid, int rear) {

        if (data[front] > data[mid]) Utils.swap(data, front, mid);
        if (data[mid] > data[rear]) Utils.swap(data, mid, rear);
        if (data[front] > data[mid]) Utils.swap(data, front, mid);
    }

    private static void quickSort(int[] data, int front, int rear) {

        int lPointer, rPointer, pivot;
        int mid = front + (rear - front) / 2;

        threeSort(data, front, mid, rear);

        if (rear - front + 1 > THRESHOLD) {

            pivot = data[mid];

            Utils.swap(data, mid, rear - 1);

            lPointer = front;
            rPointer = rear - 1;

            while (true) {
                while (data[++lPointer] < pivot && lPointer < rear);
                while (data[--rPointer] > pivot && front < rPointer);
                if (lPointer >= rPointer) break;
                Utils.swap(data, lPointer, rPointer);
            }
            Utils.swap(data, lPointer, rear - 1);

            quickSort(data, front, lPointer - 1);
            quickSort(data, lPointer + 1, rear);
        }
    }

    public static void sort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }
}
