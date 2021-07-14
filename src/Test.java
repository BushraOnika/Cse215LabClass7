public class Test {
    public static void main(String[] args) {
        Account ac = new Account(1234, 2342);
        Account ac2 = new Account(213546);
        System.out.println(ac2);
        ac2.credit(2000);
        System.out.println(ac2);
    }
}
