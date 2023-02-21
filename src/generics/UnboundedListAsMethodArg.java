import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class UnboundedListAsMethodArg {
    
        private static void printList (List < ? > list){
            System.out.println(list);
        }

        public static void main (String[]args){
            // ... create lists as before ...
            List<String> strings = new ArrayList<>();
            strings.add("Hello");
            strings.add("World");

            List<Integer> ints = new ArrayList<>();
            ints.add(3);
            ints.add(1);
            ints.add(4);
            ints.add(1);
            ints.add(9);
            ints.add(2);

            List<?> stuff = new ArrayList<>();
//            stuff.add("abc");
//            stuff.add(new Object());
//            stuff.add(3);

            printList(ints);
            printList(strings);
            printList(stuff);
        }
    
}