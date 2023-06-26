package SortngAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int [] a={2,34,4,56,33,22,55};
        for (int i=0;i<a.length-1;i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int s:a) {
            System.out.println(s);

        }
    }
}
