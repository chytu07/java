class GCD{
    public static int gcd(int p, int q){
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
}
public static void main(String args[]){
    System.out.println("GCD of 6,7 is: "+ gcd(6,7));
}
}