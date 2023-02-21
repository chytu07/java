import java.util.ArrayList;
import java.util.List;

class PrimitivesInGenericCollections{
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3); ints.add(1); ints.add(4);
        ints.add(1); ints.add(9); ints.add(2);
        System.out.println(ints);

        for (int i : ints) {
            System.out.println(i);
        }
    }
}