package oop;

public class AccountMain {
    public static void main(String[] args) {

        Account acc = new Account();
        acc.setAccno(101);
        System.out.println(acc.getAccno());
        acc.setName("Wayne");
        System.out.println(acc.getName());
        acc.setAmount(200.350);
        System.out.println(acc.getAmount());
    }
}
