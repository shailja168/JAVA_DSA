package OOPs;

public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); //created a Pen object called p1
        // p1.setColor("Bule");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "shailja";
        // myAcc.setPassword("1233");
        // System.out.println(myAcc.username);

        // Student s0 = new Student();
        // Student s1 = new Student();
        // s1.name = "shailja";
        // s1.roll = 123;
        // s1.password = "hijihij";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 70;
        // Student s2 = new Student(s1);
        // s2.password = "dfff";
        // s1.marks[2] = 55;
        // for (int i = 0; i < 3; i++) {
        //     System.out.println(s2.marks[i]);
        // }

        Fish shark = new Fish();
        shark.eat();
        
    }
}

//Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor  
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("constructor is called");
    }
    
    Student(String name) {
        marks = new int[3];
        this.name = name;
    } 
}

// class Pen {
//     private String color;
//     private int tip;

//     String getColor() {
//         return this.color;
//     }

//     int getTip() {
//         return this.tip;
//     }

//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setTip(int newTip) {
//         tip = newTip;
//     }
// }


// class BankAccount {
//     public String username;
//     private String password;

//     public void setPassword(String pwd) {
//         password = pwd;
//     }
// }

