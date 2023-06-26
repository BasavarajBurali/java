package programCollection;

public class RemoveDuplicateElementFromArray {
    public static void main(String[] args) {
        int[] a={1,1,2,3,3,4};
        int[] temp=new int[a.length-1];
        int j=0;
        for (int i=0;i<a.length-1;i++){
            if (a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];

        for (int c:temp) {
            System.out.println(c);

        }
    }
}
