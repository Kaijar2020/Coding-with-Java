package oop;

class Bank {

    double roi(){
        return 0;
    }
}

class ICICI extends Bank{

    double roi(){
        return 10.05;
    }
}

class SBI extends Bank {
    double roi(){
        return 12.00;
    }
}

public class OverRidingDemo {

    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.roi());
        ICICI is = new ICICI();
        System.out.println(is.roi());
        SBI sbi = new SBI();
        System.out.println(sbi.roi());
    }
}
