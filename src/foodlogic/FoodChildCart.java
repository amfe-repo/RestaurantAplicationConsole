package foodlogic;

public class FoodChildCart implements FoodCart {

    @Override
    public Burger createBurger() {
        return new ChildBurger();
    }

    @Override
    public Dessert createDessert() {
        return new IceCream();
    }
    
}
