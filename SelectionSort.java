import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int[] a = {12, 24, 4, 35, 4, 67, 76, 8};
        System.out.println(Arrays.toString(a));
        int len = a.length;
        int min;
        for (int i = 0; i < len - 1; i++) {
            min = i;
            for(int j = i+1; j<len; j++){
                if(a[j] < a[min]){
                    min = j; // just saving the index of the min bcoz there might a lesser ele in the arr further.
                }
            }
            if(min!=i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
