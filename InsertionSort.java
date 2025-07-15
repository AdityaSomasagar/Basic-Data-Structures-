import java.util.Arrays;

public class InsertionSort {
    public void insert(int [] arr){
      for(int i =1; i<arr.length;i++){
          int j = i-1;
          int temp = arr[i];
          while (j>=0 && arr[j]>temp){
              arr[j+1] = arr[j];
              j--;
          }
          arr[j+1] = temp;
      }
    }
    public static void main(String[] args) {
        int [] sankit ={7,1,3,0,5,8};
        InsertionSort sort = new InsertionSort();
        sort.insert(sankit);
        System.out.println(Arrays.toString(sankit));
    }
}
