
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {25, 10, 30, 34, 5};

        for (int k : a) {
            System.out.print(k + " ");
        }
        for(int i = 0; i<a.length-1;i++){
            for(int j = 0; j < a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println();
        for (int j : a) {
            System.out.print(j + " ");
        }

    }
}