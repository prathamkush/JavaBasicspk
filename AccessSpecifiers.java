public class AccessSpecifiers {
    protected int a = 10;

    public void add(){
        System.out.println("checking the add");
    }
}

//Default -> No access modifier -> cannot be accessed outside the package
// Public -> Can be accessed anywhere
// Private -> Only inside the class
// Protected -> Only Inside subclass or inherited classes
