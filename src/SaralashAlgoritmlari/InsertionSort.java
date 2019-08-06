package SaralashAlgoritmlari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class InsertionSort {
    public static void main(String[] args) {
        new InsertionSort().solve();
    }

    private void solve() {
        List<Integer> array = new ArrayList<>();

//        for (int i = 0; i < 20; i++) {
//            array.add(ThreadLocalRandom.current().nextInt(1, 100));
//        }
        array.add(2);
        array.add(4);
        array.add(5);
        array.add(7);
        array.add(10);
        array.add(3);

        System.out.println("Saralanmagan holatda:");
        for (int num: array) {
            System.out.print(num + " ");
        }

        insertionSort(array);

        System.out.println("\nSaralangan holatda:");
        for (int num: array) {
            System.out.print(num + " ");
        }
    }

    private void insertionSort(List<Integer> array) {
        for (int i = 1; i < array.size(); i++) {
            int x = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j) > x) {
                array.set(j + 1, array.get(j));
                j--;
            }
            array.set(j + 1, x);
        }
    }
}
