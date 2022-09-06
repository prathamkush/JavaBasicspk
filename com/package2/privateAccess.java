package com.package2;

public class privateAccess {

    protected int a = 10;

    public void displayPrivate(){
        System.out.println("Displaying private data");
    }
}

class newClass{
    public static void main(String[] args){
        privateAccess obj = new privateAccess();
        obj.displayPrivate();
        try{
            System.out.println(2*obj.a);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

    }
}

class B extends privateAccess{
    public static void main(String[] args){
        privateAccess obj1 = new privateAccess();
        obj1.displayPrivate();
        System.out.println(3*obj1.a);
    }
}
