package oops;

public class Constructor {
    public static void main(String[] args){
        Student st = new Student("sameer");
        System.out.println(st.name);
    }
}
class Student{
    String name;
    int id;

    Student(String name){
        this.name = name;
        // System.out.println("yoyo bantai");
    }
}