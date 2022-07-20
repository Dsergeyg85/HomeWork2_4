public class Main {
    public static void main(String[] args) {
        String a = "011101";
        String b = "0101101";
        BinOps bins = new BinOps();
        System.out.println(bins.sum(a, b));
        System.out.println(bins.mult(a, b));
    }
}