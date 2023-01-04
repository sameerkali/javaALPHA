package oops;
// import java.util.*;                               uncomment

public class Inheritance {
    public static void main(String[] args) {
        // Animal a1 = new Animal();
        // a1.eat();
        // Fish f1 = new Fish();
        // f1.fins();
        // f1.isHuman();

        // Scanner sc = new Scanner(System.in);      uncomment
        // int a = sc.nextInt();                     uncomment
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,2));
        System.out.println(calc.sum((float)2.2,(float)2.2));
        System.out.println(calc.sum(2,2,3));
    }
    
}

class Animal {
    String eat;
    String isHuman;

    void eat(){
        System.out.println("sare janwar khana toh khate hi hai bhai");
    }

    void isHuman(){
        System.out.println("nhi insaan nhi hai");
    }
}

class Fish extends Animal {
    String fins;

    void fins(){
        System.out.println("machli hai toh fins toh honge hi na meri jaannnn.....");
    }
}

class Calculator {
    int sum(int a , int b){
        return a + b;
    }
    
    float sum(float a , float b){
        return a + b;
    }
    
    int sum(int a, int b, int c){
        return a + b + c;
    }
}