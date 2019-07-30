package SaralashAlgoritmlari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionSort {
    public static void main(String[] args) {
        new SelectionSort().solve();
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

        selectionSort(array);

        System.out.println("\nSaralangan holatda:");
        for (int num: array) {
            System.out.print(num + " ");
        }
    }

    private void selectionSort(List<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j) < array.get(minInd)) {
                    minInd = j;
                }
            }

            Collections.swap(array, i, minInd);
        }
    }
}
