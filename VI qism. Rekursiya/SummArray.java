import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * SummArray
 */
public class SummArray {

    public static void main(String[] args) {
        new SummArray().solve();
    }

    public void solve() {
        List<Integer> array = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            array.add(ThreadLocalRandom.current().nextInt(1, 11));
        }

        array.forEach(num -> System.out.print(num + " "));
        
        int summ = calculateSumm(array);
        System.out.println("\n" + summ);
    }

    public int calculateSumm(List<Integer> array) {
        if (array.size() == 1) {
            return array.get(0);
        }

        return array.get(0) + calculateSumm(array.subList(1, array.size()));
    }
}