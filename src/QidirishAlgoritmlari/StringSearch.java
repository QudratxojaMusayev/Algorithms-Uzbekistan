package QidirishAlgoritmlari;

import java.util.ArrayList;
import java.util.List;

public class StringSearch {
    public static void main(String[] args) {
        new StringSearch().solve();
    }

    private void solve() {
        String mainString = "ali vali bali"; // n = 13
        String subString = "ali"; // m = 3

        System.out.println("Asosiy satr: " + mainString);
        System.out.println("Qism satr: " + subString);
        System.out.println("Natija: " + findSubString(mainString, subString));

        // Ikkinchi qism
        List<Integer> indexes = subStringIndexes(mainString, subString);

        if (indexes.size() != 0) {
            for (int index: indexes) {
                System.out.print(index + " ");
            }
        } else {
            System.out.println("Topilmadi");
        }
    }

    private int findSubString(String mainString, String subString) {
        int counter = 0;
        int n = mainString.length();
        int m = subString.length();
        int k;

        for (int i = 0; i <= n - m; i++) {
            boolean matched = true;
            k = i;
            for (int j = 0; j < m; j++, k++) {
                if (subString.charAt(j) != mainString.charAt(k)) {
                    matched = false;
                    break;
                }
            }

            if (matched) {
                counter++;
            }
        }
        return counter;
    }

    private List<Integer> subStringIndexes(String mainString, String subString) {
        List<Integer> indexes = new ArrayList<>();
        int k = 0;

        while (k < mainString.length()) {
            int index = mainString.indexOf(subString, k);
            if (index > -1) {
                indexes.add(index);
                k += index + 1;
            } else {
                break;
            }
        }

        return indexes;
    }
}
