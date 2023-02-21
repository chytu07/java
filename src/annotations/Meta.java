import java.lang.annotation.*;
import java.lang.reflect.*;
// An annotation type declaration.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}
class Meta {
    // Annotate a method.
    @MyAnno(str = "Annotation Example", val = 100)
//    public static void myMeth() {  // method with no parameters - case 1
    public static void myMeth(String str, int i){ // method with  parameters - case 2
        Meta ob = new Meta();
// Obtain the annotation for this method
// and display the values of the members.
        try {
            // First, get a Class object that represents
// this class.
            Class<?> c = ob.getClass();
// Now, get a Method object that represents
// this method.
//            Method m = c.getMethod("myMeth"); // case 1
            // Here, the parameter types are specified.
            Method m = c.getMethod("myMeth", String.class, int.class);// case 2
// Next, get the annotation for this class.
            MyAnno anno = m.getAnnotation(MyAnno.class);
// Finally, display the values.
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
    public static void main(String args[]) {
//        myMeth(); // case 1
        myMeth("test", 10); // case 2
    }

}