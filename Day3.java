public class Day3 {
    public int  fact(int f) {
        int fact = 0;
            if (f == 0) {
                return 1;
            }else{
                fact = f * fact(f - 1);
            }
        return fact;
    }
    public static void main(String[] args) {
        Day3 obj = new Day3();
        System.out.println(obj.fact(5));
    }
}
