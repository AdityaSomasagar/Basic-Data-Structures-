public class DynamicProgramming {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int n = 10;
//        0 1 1 2 3 5 8..
//        System.out.print("0 1 ");
        for(int i=0; i<n; i++){
            int result = first + second;
            System.out.print(result+" ");
            first = second;
            second = result;
        }
    }
}
