/**
 * Java 1 Homework 6
 *
 * @authors Sergey Leschenko
 * @version dated Jul 29, 2018
 */
public class Java1Homework6 {
    public static void main(String[] args){
        Dog dog = new Dog(50,10,1.3);
        System.out.println();
        Cat cat = new Cat(50,10,1.3);

    }
}

class Animal{
    public int run;
    public int swim;
    public double jump;
    public Animal() {
    }
}

class Cat extends Animal{
    public Cat(int run,int swim,double jump){
        if(run < 200 && run >= 0){this.run = run; System.out.print("true" + " ");}
        else{System.out.print("false" + " ");}
        if(swim == 0){this.swim = swim; System.out.print("true" + " ");}
        else{System.out.print("false" + " ");}
        if(jump < 2 && jump >= 0){this.jump = jump; System.out.print("true" + " ");}
        else{System.out.print("false" + " ");}
    }

}

class Dog extends Animal{
    public Dog(int run,int swim,double jump){
        if(run < 500 && run >= 0){this.run = run; System.out.print("true" + " ");}
        else{System.out.print("false" + " ");}
        if(swim < 10 && swim >= 0){this.swim = swim; System.out.print("true" + " ");}
        else{System.out.print("false" + " ");}
        if(jump < 0.5 && jump >= 0){this.jump = jump; System.out.print("true" + " ");}
        else{System.out.print("false" + " ");}
    }
}
