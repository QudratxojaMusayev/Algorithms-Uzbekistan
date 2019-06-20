package QidirishAlgoritmlari;

import java.util.concurrent.ThreadLocalRandom;

public class LinearSearch {
    public static void main(String[] args) {
        new LinearSearch().solve();
    }

    private void solve() {
        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 11);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int key = 3;

        System.out.println(linearSearch(array, key));
    }

    private int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }

        return -1;
    }
}
