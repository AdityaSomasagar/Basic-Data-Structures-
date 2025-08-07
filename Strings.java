import java.util.*;

public class Strings {
    public static void main(String[] args) {
        String input = "aditya#$%^&";
        System.out.println("Print the String: " + input);

//        Length of the String

        System.out.println("length: " + input.length());

//        Convert string to char

        char[] ch = input.toCharArray();
        System.out.println("Using the loop");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();

//        change the string into uppercase and lowercase

        System.out.println(input.toLowerCase());
        System.out.println(input.toUpperCase());
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch1 = input.charAt(i);
            if (ch1 >= 'a' && ch1 <= 'z') {
                lowerCount++;
            } else if (ch1 >= 'A' && ch1 <= 'Z') {
                upperCount++;
            }
        }
        System.out.println("Lower: " + upperCount);
        System.out.println("Upper: " + lowerCount);

//         remove all the special characters in the string
        String abc = "Aditya!#@$#";
        String output = "";
        for (int i = 0; i < abc.length(); i++) {
            char ch3 = abc.charAt(i);
            if ((ch3 >= 'a' && ch3 <= 'z') || (ch3 >= 'A' && ch3 <= 'Z') || (ch3 >= '0' && ch3 <= '9')) {
                output += ch3;
                System.out.println(output);
            }
        }
        System.out.println(output);

//        remove vowels

//        String Arya = "Arya Deep Gowda";
//        for (int i = 0; i < Arya.length(); i++) {
//            char ch4 = Arya.charAt(i);



//        REverse a string

        String reverse = "";
        for(int i=input.length()-1; i>=0; i--){
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);

//        reverse using StringBuilder\

        String str = "Arya";
        StringBuilder obj = new StringBuilder(str);
        obj.reverse();
        System.out.println(obj.toString());

        // find all the substring

        String strr = "Aditya";
        String substr = "";


    }
}




