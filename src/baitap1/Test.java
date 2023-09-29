package baitap1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        System.out.println(list.isEmpty());
        list.add("Hùng");
        list.add("Nam");
        list.add(0,"Đưc");
        list.add("Khánh");
        list.add("Hùng");
        list.set(3,"Khánh sky");

        System.out.println(list.lastIndexOf("Hùng"));;
        System.out.println(list.isEmpty());
        System.out.println("==================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
