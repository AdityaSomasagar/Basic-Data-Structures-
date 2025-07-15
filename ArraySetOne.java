import java.util.Arrays;

public class ArraySetOne {
    public double sumOfElements(double[] a) {
        double sum = 0;
        for (double i : a) {
            sum = sum + i;
        }
        return sum;
    }

    public double average(double[] a) {
        return sumOfElements(a) / a.length;
    }

    public double max(double[] a) {
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public double min(double[] a) {
        double min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public int CountEvenOdd(int n, int m) {
        int count = 0;
        for (int k = n; k <= m; k++) {
            if (k % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public void printEvenIndices(int[] a) {
        for (int i = 0; i <= a.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println("index: " + i + " value: " + a[i]);
            }
        }
    }

    public void printOddIndices(int[] a) {
        for (int i = 0; i <= a.length - 1; i++) {
            if (i % 2 != 0) {
                System.out.println("index: " + i + " value: " + a[i]);
            }
        }
    }

    public void countPosNeg(int[] a) {
        int pos = 0;
        int neg = 0;
        for (int i : a) {
            if (i > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        System.out.println("Positive: " + pos + "\nNegative: " + neg);
    }

    public int[] replace(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < 0) {
                a[i] = 0;
            }
        }
        return a;
    }

    public void linearSearch(int s, int[] a){
        int lb = a[0];
        int ub = a[a.length-1];
        for(int i=lb; i<ub; i++){
            if(a[i] == s){
                System.out.println("Element "+a[i]+" found at index "+i+" using linear search");
                break;
            }
        }
    }

    public void copyArray(int[] a){
        System.out.println("Arr a: "+Arrays.toString(a));
        int[] b = new int [a.length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if (i == j) {
                    b[j] = a[i];
                }
            }
        }
        System.out.println("Array b: "+Arrays.toString(b));
    }

    public void reverse(int[] a){
        System.out.println("Reverse an array: ");
        int i = 0;
        int j = a.length-1;
        int temp;
        while(i<j){ //when they both meet together in middle, this makes sure they do not cross
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++; j--;
        }
        System.out.println(Arrays.toString(a));
    }

    public void reverseOrder(int[] ahh){
        System.out.println("Print an array in reverse order: ");
        for(int i=ahh.length-1; i>=0; i--){
            System.out.print(ahh[i]+" ");
        }
        System.out.println();
    }
    public void swapEle(int[] a){
        System.out.println("Swap first and last ele");
        int temp = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = temp;
        System.out.println(Arrays.toString(a));
    }
    public void freqCount(int target , int[] a){
        int count = 0;
        for (int j : a) {
            if (j == target) {
                count++;
            }
        }
        System.out.println("Frequency of "+target+" is: "+count);
    }
    public void indexOfSpecificEle(int[] a, int target){
        for(int i=0; i<a.length; i++){
            if(a[i] == target){
                System.out.println("Index of "+target+" is: "+i);
            }
        }
    }
public void replaceEven(int[] a){
    System.out.println("Replace even numbers with -1");
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                a[i] = -1;
            }
    }
    System.out.println(Arrays.toString(a));
}

public void multiplyAllEle(int[] a){
    System.out.println("Product of all elements in the array.");
        long prod=1;
    for (int i : a) {
        prod *= i;
    }
    System.out.println(prod);
}

    public static void main(String[] args) {
        double[] array = {4, 7, 5, 0, 8, 38, 9};
        int[] a = {3, 6, 7, 2, 9, 9, 9, 8};
        int[] a1 = {3, -6, 7, -2, 9, -9, 8};
        ArraySetOne arr = new ArraySetOne();
        System.out.println((int) arr.sumOfElements(array));
        System.out.println((int) arr.average(array));
        System.out.println((int) arr.max(array));
        System.out.println((int) arr.min(array));
        System.out.println(arr.CountEvenOdd(1, 6));
        System.out.println("Print Even indices.");
        arr.printEvenIndices(a);
        System.out.println("Print Odd indices.");
        arr.printOddIndices(a);
        arr.countPosNeg(a1);
        System.out.println(Arrays.toString(arr.replace(a1)));
//        arr.linearSearch(8, a);
//        arr.copyArray(a);
//        arr.reverse(a);
//        arr.reverseOrder(a);
//        arr.swapEle(a);
//        arr.freqCount(9, a);
          arr.indexOfSpecificEle(a, 7);
//          arr.replaceEven(a);
          arr.multiplyAllEle(a);
    }
}
