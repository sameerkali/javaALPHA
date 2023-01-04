package oops;

public class OOPS1 {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.color);
        bank myAcc = new bank();
        myAcc.username = "sameerfaridi";
        System.out.println(myAcc.username);
    }
}
class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int nreTip){
        tip = nreTip; 
    }
}

class bank {
    public String username;
    // private String password;

}
