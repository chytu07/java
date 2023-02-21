import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class ListObject{
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add("Hello");
        objects.add(LocalDate.now());
        objects.add(3);
        System.out.println(objects);
// prints [Hello, 2016-09-26, 3]
    }
}