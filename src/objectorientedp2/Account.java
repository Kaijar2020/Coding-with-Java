package objectorientedp2;

public class Account {

    private int acc_no;
    private String name;
    private double amount;


    void setAcc_no(int acc_no){
        this.acc_no = acc_no;
    }

    int getAcc_no(){
        return acc_no;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setAmount(double amount){
        this.amount= amount;
    }

    double getAmount(){
        return amount;
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.setAcc_no(100725014);
        System.out.println(account.getAcc_no());
        account.setName("Ayon");
        System.out.println(account.getName());
        account.setAmount(5000);
        System.out.println(account.getAmount());
    }
}
