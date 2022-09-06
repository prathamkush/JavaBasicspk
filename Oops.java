/*
public class Oops {
    int a = 10;
    Oops(){
        int b = 11;
    }

    public void add(){
        System.out.println("Adding");
    }
    public void subtract(){
        System.out.println("Subtracting");
    }
    public static void main(String[] args){
        // Class object = new Constructor()
        Oops obj1 = new Oops();
        System.out.println(obj1.add);
    }




}*/

import javax.swing.*;
import java.security.PolicySpi;

class Oops{


    static void check(){
        System.out.println("here is the static checking");
    }
}

class B extends Oops{
    public static void main(String[] args){
        System.out.println("hello");
        printit();

    }
    static void printit(){
        B.check();
    }


    Oops o1 = new Oops();
    Oops o2 = new Oops();
/*
    if(o1.equals(o2)){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }*/

}

// Inheritance
// Single, Multilevel, Hierarchical, Hybrid

class superClass{

    String lname="Check1";
    int a = 10;
    public superClass(String lname){
        this.lname = lname;
    }

    String fname = "Pratham";
    public void display(){
        System.out.println("displaying super text");
    }
}

class derived extends superClass{

    public derived(String lname) {
        super(lname);
    }

    public static void main(String[] args){
        derived obj1 = new derived("Kushwah");
        obj1.fname = "Checkssss";
        System.out.println(obj1.fname+" "+obj1.lname);

        obj1.display();
        obj1.a = 11;
        System.out.println(obj1.a);//10

        System.out.println("_----------------");

        derived obj2 = new derived("Kushwah2");
        System.out.println(obj2.fname+" "+obj2.lname);
        obj2.display();
        System.out.println(obj2.a);
    }
}
// Heap memory  -> all objects are created in heap space
// Stack memory -> their references stored in stack

// Multilevel

class derived2 extends derived{


    public derived2(String lname) {
        super(lname);
    }

    public static void main(String[] args){
        derived2 obj3 = new derived2("sadf");
        obj3.display();
    }
}

// Hierarchical
class derived3 extends derived{

    public derived3(String lname) {
        super(lname);
    }
    public static void main(String[] args){
        derived3 obj4 = new derived3("asdfafd");
        obj4.display();
    }
}


class grandfather{
    public void grandfatherMethod(){
        System.out.println("grandpa");
    }
}

class father extends grandfather{} //single
class son extends father{} //Single, Multilevel, Hierarchicical, Hybrid
class daughter extends father{} // (all above)


// Polymorphism
class Poly1{
    public  static void add(){
        System.out.println("adding two numbers");
    }
    public static void add(int a, int b){
        System.out.println(a+ "+" + b + "=" + (a+b));
    }

    public static void add(double a, double b){
        System.out.println("printing doubles");
    }
    public static void add(String a, String b){
        System.out.println(a +" " + b);
    }

    // Method Overloading
    public static void main(String[] args){
        add();
        add(1,2);
        add("hello","world");
        add(1,2);
    }

}
/*
class Poly2 extends Poly1{

    //Method Overriding/Runtime Polymorphism/Dynamic
    public  void add(){
        System.out.println("Poly2 Add Method");
    }

    //dummy method to prevent overriding
    public void superMethod(){
        super.add();
        super.add(1,3);
    }


    public static void main(String[] args) {
        Poly2 obj5 = new Poly2();
        //for overriding
        //obj5.add();

        //for preventing overriding
        obj5.superMethod();
    }
}
*/

// Encapsulation
class Company{

    //encapsulation (access private only by public getters&setters)
    private String companyName;

    //Getter
    public String getCompanyName() {
        return companyName;
    }

    //Setter
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

class Oops2{
    public static void main(String[] args) {
        Company obj7 = new Company();
        obj7.setCompanyName("Blue Yonder");
        System.out.println(obj7.getCompanyName());
    }
}

// Inner/nested classes
class outerClass{
    String ffname = "Pratham";
        class innerClass{
            String llname = "KK";
        }
}

class Oops3{
    public static void main(String[] args) {
        outerClass outObj = new outerClass();
        outerClass.innerClass inobj = outObj.new innerClass();

        System.out.println(inobj.llname + outObj.ffname);
    }
}

// Abstract -> From incomplete to complete implementations
// of different functionalities/methods

abstract class Oops4{
    public abstract void display();
    public void  dispaly2(){
        System.out.println("displaying abstractss");
    }
}

class AbstractDerived extends Oops4{
    public void display(){
        System.out.println("printing text 1");
    }

    public static void main(String[] args) {
        AbstractDerived obj9 = new AbstractDerived();
        obj9.dispaly2();
    }
}

//Interfaces - Pure Absract/ Complete Abstract

interface Oops5{
    public void display1();
}

class Company1 implements Oops5{

    @Override
    public void display1() {
        System.out.println("printing display1 from company1");
    }
}

class ObjectCreation{
    public static void main(String[] args) {
        Company1 obj10 = new Company1();
        obj10.display1();
    }
}
interface BluePrint{ public void display(); }

// ENUMS -> a special class containing constants

class Oops6{
    enum Game /*implements BluePrint*/{
        CRICKET,
        FOOTBALL,
        HOCKEY
        /*,
        DISPLAY {
            @Override
            public void display() {
                System.out.println("displaying");
            }
        }*/
    }

    public static void main(String[] args) {
        Game var1 = Game.CRICKET;
        System.out.println(var1);
    }
}
















