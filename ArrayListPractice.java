import Everything.Quest;

import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
//        Zomato question
        LinkedList <String> list = new LinkedList<>();
//     1. Add 7 new orders
//     2. A priority queue comes in and must be served before all the orders

        list.add("Paav bhaji");
        list.add("Pizza");
        list.add("Burger");
        list.add("pani puri");
        list.add("Masala puri");
        list.add("bhel puri");
        list.add("dhahi puri");
//        Display all current orders
        System.out.println("List of new 7 orders\n"+list);
//        cancel the 5th order
        list.remove(4);
        System.out.println(list);
//        serve the firs 2 orders
        System.out.println(list.get(1));
        System.out.println(list.get(2));



    }
}
