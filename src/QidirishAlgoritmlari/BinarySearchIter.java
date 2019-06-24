package QidirishAlgoritmlari;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Ikkilik qidirish algoritmini iterativ usulda implementatsiyasi
 */

public class BinarySearchIter {
    public static void main(String[] args) {
        new BinarySearchIter().solve();
    }

    private void solve() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = new int[20];
        int number;

        for (int i = 0; i < 20; i++) {
            number = ThreadLocalRandom.current().nextInt(1, 101);
            array[i] = number;
            arrayList.add(number);
        }

        Arrays.sort(array);
        Collections.sort(arrayList);

        int key = 23;
        int resultIndex = Arrays.binarySearch(array, key);
        int result = Collections.binarySearch(arrayList, key);

        for (int i = 0; i < 20; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + resultIndex + " " + result);
    }

    /**
     * Iterativ ikkilik qidirish algoritmi funksiyasi
     * @param array -
     * @param key -
     * @return
     */
    private int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
