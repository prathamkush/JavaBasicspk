package com.package3;

final class employee{
    String fname = "Pratham";
    public void displayEmployee(){
        System.out.println("Displaying final class");
    }

    public static void main(String[] args){
        employee obj1 = new employee();
        obj1.fname = "Check";
    }
}


// final class Cannot extend to a child class
public class nonAccess {
    public static void main(String[] args){

    }
}
