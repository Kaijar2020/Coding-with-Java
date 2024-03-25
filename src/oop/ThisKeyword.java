package oop;

public class ThisKeyword {

    int x,y;

//    ThisKeyword(int x, int y){
//        this.x=x;
//        this.y=y;
//    }

    void setData(int x, int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x+" and "+y);
    }

    public static void main(String[] args) {

        ThisKeyword thiskey = new ThisKeyword();
        thiskey.setData(10,25);
        thiskey.display();
    }
}
