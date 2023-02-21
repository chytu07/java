// Demonstrate assert.
class AssertDemo {
    static int val = 3;
    // Return an integer.
    static int getnum() {
        return val--;
    }
    public static void main(String args[])
    {
        int n;
        for(int i=0; i < 10; i++) {
            n = getnum();
//            assert n > 0:"n is negative!"; // will fail when n is 0
            assert (n = getnum()) > 0; // This is not a good idea
            System.out.println("n is " + n);
        }
    }
}