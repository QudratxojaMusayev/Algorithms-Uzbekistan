package Rekursiya;

public class PrintNumbers {
    public static void main(String[] args) {
        new PrintNumbers().solve();
    }

    public void solve() {
        printNumbers(10);
    }

    public void printNumbers(int n) {
        if (n <= 0) {
            return;
        } 

        System.out.println(n);

        printNumbers(n - 1);
    }    
}