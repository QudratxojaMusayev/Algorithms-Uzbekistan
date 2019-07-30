package SaralashAlgoritmlari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BubbleSort {
    public static void main(String[] args) {
        new BubbleSort().solve();
    }

    private void solve() {
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            array.add(ThreadLocalRandom.current().nextInt(1, 100));
        }

        System.out.println("Saralanmagan holatda:");
        for (int num: array) {
            System.out.print(num + " ");
        }

        bubbleSort(array);

        System.out.println("\nSaralangan holatda:");
        for (int num: array) {
            System.out.print(num + " ");
        }
    }

    private void bubbleSort(List<Integer> array) {
        int n = array.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    Collections.swap(array, j, j + 1);
                }
            }
        }
    }
}
