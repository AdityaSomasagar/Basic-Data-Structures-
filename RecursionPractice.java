public class RecursionPractice {
    public static void HelloWorld(int n) {
        if (n == 0) return;
        System.out.println("Hello dear ");
        HelloWorld(n - 1);
    }

    public static void numbersnto1(int n) {
        if (n == 0) return;
        System.out.println(n);
        numbersnto1(n - 1);
    }

    public static void numbers1ton(int n) {
        if (n == 0) return;
        numbers1ton(n - 1); //stack type storing of elements and later LIFO.
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static int sumOfnNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfnNaturalNumbers(n - 1);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);//ex: 567=7+s(56)=7+6+s(5)=7+6+5.
    }

    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);//c(133)= 1+c(13)=1+1+c(1)=1+1+1.
    }

    public static void EvenNum(int n) {
        if (n <= 1) return;
        EvenNum(n - 1);
        if (n % 2 == 0) System.out.println(n);
    }

    public static void reverseNumber(int n) {
        if (n == 0) return;
        System.out.print(n % 10);
        reverseNumber(n / 10);
    }

    public static int productNatural(int n) {
        if (n <= 1) return 1;
        return n * productNatural(n - 1);
    }

    public static int sumOfArray(int[] a, int i) {
        if (i == a.length - 1) return 0;
        return a[i] + sumOfArray(a, i + 1);
    }

    public static int printAllEle(int[] a, int i) {
        if (i == a.length) return 0;
        System.out.println(a[i]);
        return printAllEle(a, i + 1);
    }

    public static int printSumOfSquares(int n) {
        if (n == 0) return 0;
        return (n * n) + printSumOfSquares(n - 1);
    }

    public static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static boolean palindrome(int num) {
        int reversed = reverse(num, 0);
        return num == reversed;
    }

    public static void main(String[] args) {
        HelloWorld(5);
        System.out.println();

        numbersnto1(5);
        System.out.println();

        numbers1ton(5);
        System.out.println();

        System.out.println("Factorial: " + factorial(5));
        System.out.println("Fibonacci: " + Fibonacci(5));
        System.out.println(sumOfnNaturalNumbers(5));
        System.out.println("Sum of digits: " + sumOfDigits(679) + "\n");
        System.out.println("Count of digits: " + countDigits(6898) + "\n");
        EvenNum(+5);
        reverseNumber(12345678);
        System.out.println(productNatural(5));
        int[] arr = {12, 12, 34, 45, 56, 45};
        System.out.println(sumOfArray(arr, 0));
        System.out.println(printAllEle(arr, 0));
        System.out.println("Print sum of squares: " + printSumOfSquares(3));
        if (palindrome(12344321)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
