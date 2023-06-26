package programCollection;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={3,5,2,4,7,4,3,67,3,2,445,4};
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
