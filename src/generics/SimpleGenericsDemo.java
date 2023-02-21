import java.util.ArrayList;
import java.util.List;

class SimpleGenericsDemo{
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
// strings.add(new Date()); // won't compile
// Integer i = strings.get(0); // won't compile

// for-each loop knows the contained data type is String
        for (String s : strings) {
            System.out.printf("%s has length %d%n", s, s.length());
        }
    }
}