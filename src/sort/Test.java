package sort;

import sort.basic.Bubble;

import java.util.Arrays;

public class Test {

    static final int[] STATIC_DATA = {
            13, 77, 49, 35, 61, 48, 73, 23, 95, 3, 89, 37, 57, 99, 17, 32, 94, 28, 15, 55, 7, 51, 88, 97, 62
    };

    static final int DYNAMIC_DATA_START = 5;
    static final int DYNAMIC_DATA_SIZE = 20;

    private static int[] createRandomData(int start, int size) {

        int[] data = new int[size];
        boolean[] check = new boolean[size];

        for (int i = 0; i < size; ++i) {

            while (true) {
                int rand = (int) (Math.random() * size + start);
                if (!check[rand - start]) {
                    check[rand - start] = true;
                    data[i] = rand;
                    break;
                }
            }
        }

        return data;
    }

    public static void main(String[] args) {

        int[] originalData;

//        originalData = STATIC_DATA;
        originalData = createRandomData(DYNAMIC_DATA_START, DYNAMIC_DATA_SIZE);

        int[] copy = originalData.clone();

        Bubble.sort(copy);
//        Bubble.sort(copy, 0, 10);

        StringBuilder sb = new StringBuilder();
        Arrays.stream(copy).forEach(elem -> sb.append(elem).append(" "));
        System.out.println("len: " + copy.length);
        System.out.println(sb);
    }
}