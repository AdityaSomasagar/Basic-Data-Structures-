public class Recursion {
    public static int factorial(int n){
        if(n==0){
            return 1;
        } else if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int Fibonacci(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static int sumOfnNaturalNumbers(int n){
        if(n==0){
            return 0;
        }
        return n + sumOfnNaturalNumbers(n-1);
    }
    public static int sumOfnEvenNumbers(int n){
        if(n==1){
            return 2;
        }
        return 2 * n + sumOfnEvenNumbers(n-1);
    }
    public static int prodOfnEvenNumbers(int n){
        if(n==1){
            return 2;
        }
        return 2 * n * prodOfnEvenNumbers(n-1);
    }

    public static int printSum(int [] arr){
        int sum = 0;
        for (int j : arr) {
            if (j > 0) {
                sum = sum + j;
            }

        }
        return sum;
    }

    static class Palindrome{
    public static int reverse(int n, int rev) {
            if(n == 0){
                return rev;
            }
            return reverse(n/10, rev*10+n%10);
    }
    public static boolean palindrome(int num){
        int reversed = reverse(num, 0);
       return num == reversed;
    }
}

    public static void main(String[] args) {
        System.out.println("Factorial: "+factorial(5));
        System.out.println("Fibonacci: "+Fibonacci(5));
        System.out.println("Sum of n Natural numbers: "+ sumOfnNaturalNumbers(5));
        System.out.println("SUm of N even numbers:"+sumOfnEvenNumbers(10));
        System.out.println("Product of n even numbers: "+prodOfnEvenNumbers(10));
        int [] arr = {1,2,3,4,5};
        System.out.println("Sum of numbers in an array: "+printSum(arr));

        if(Palindrome.palindrome(12344321)){  //if the static classes are there we can access them by className.methodName
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }


    }
}
