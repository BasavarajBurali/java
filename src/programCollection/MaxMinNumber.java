package programCollection;

public class MaxMinNumber {
    public static void main(String[] args) {
        int [] a={1,3,2,4,65,44,54553};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<=a.length-1;i++){
            while (max<a[i]){
                max=a[i];
            }

        }
        System.out.println(max);
    }
}
