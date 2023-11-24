//abstract class cannot be used to create objects.
abstract class Farm {
    static String farmHouse = "Lynch Farmhouse";
    public abstract void produceStudy();
}
abstract class Supermarket extends Farm{
    protected String wholesaleFoods;
    public char gotProduce = 'Y';
    public void produceStudy() {
        System.out.println("Produce was studied and certified.");
    }
    public static void main(String[] args){
        System.out.println(farmHouse);
    }
}
//****************************************************//


public class Store {
    //declaring default instance fields of the class
    int inventoryCount;
    String productType;
    //declaring instance field with keyword "final".
    //final keyword is known as a modifier. Once a variable is declared with this keyword, the value cannot be changed.
    final char approved = 'A';
    final char declined = 'F';

    //declaring "public" instance fields of the class
    public int farmReleased;

    //declaring "private" instance fields of the class
    //private meaning that it belongs only to the class and cannot be accessed by another class.
    private String farmerConfirmed;

    //declaring "protected" instance fields of the class.
    // protected meaning it is accessible within the same package and subclasses.
    protected boolean paidForProduce;

    public Store(String product, int count){
        productType = product;
        inventoryCount = count;
        System.out.println("Constructor Invoked!");
    }
    public static void main(String[] args){
        //calling or invoking the constructor methods with objects.
        Store cookieShop = new Store("chocolate chip cookies", 2);
        Store lemonadeStand = new Store("lemonade juice", 12);

        System.out.println("The Lemonade Stand sells " +lemonadeStand.productType+ " and " +lemonadeStand.inventoryCount+ cookieShop.productType+".");
    }

}
