import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hùng");
        list.add("Nam");
        list.add("Hưng");
        list.add(null);
        list.add("Sơn");
        list.add("Châu");
//        for (String s: list){
//            System.out.println(s);
//        }
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        // List
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,20);
        arrayList.add(1,20);
        arrayList.add(0,22);
        arrayList.add(0,23);
        arrayList.add(0,24);
        arrayList.add(0,25);
        arrayList.add(0,26);
        System.out.println(arrayList);
        arrayList.set(2,100);
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        int deleteElement = arrayList.remove(4);
        System.out.println(deleteElement);
        System.out.println(arrayList);

        System.out.println(arrayList.indexOf(100));

        List<Integer> subList = arrayList.subList(2,4);
        System.out.println(subList);
        // ListIterator<Integer> listIterator = arrayList.listIterator();

        System.out.println("--------------------");
        System.out.println(arrayList);

        List<Integer> listAddAll = new ArrayList<>();
        listAddAll.add(26);
        listAddAll.add(25);
        listAddAll.remove(3);
        listAddAll.addAll(1,subList);
        System.out.println(listAddAll);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("hùng");
        linkedList.addFirst("nam");
        linkedList.addFirst("phúc");
        linkedList.addFirst("phát");
        linkedList.addLast("Đức");
        System.out.println(linkedList);

        // tính tổng
        int total = arrayList.stream().reduce(0,Integer::sum);
        Integer.sum(2,3);
        System.out.println(total);

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(12);
        set.add(11);
        set.add(12);
        set.add(100);
        set.add(12);
        System.out.println(set);

        Set<Student> students = new HashSet<>();
        Student st1 = new Student(18);
        Student st2 = st1;
        students.add(st1);
        students.add(st2);
        System.out.println(students);


        Set<String> strings = new TreeSet<>();
        strings.add("Hùng");
        strings.add("Nam");
        strings.add("Đức");
        strings.add("Khánh");
        strings.add("Anh");
        strings.add("Việt");
        strings.add("Dũng");
        System.out.println(strings);

        int[] arr ={1,2,3,4};
        int[] arrCopy = Arrays.copyOf(arr,2);
        System.out.println(Arrays.toString(arrCopy));
        System.out.println(Arrays.toString(arr));
    }
}