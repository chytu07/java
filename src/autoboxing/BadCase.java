// A bad use of autoboxing/unboxing!
class BadCase{
    public static void main(String[] args) {
        Double a, b, c;
        a = 10.0;
        b = 4.0;
        c = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenuse is " + c);
    }
}
