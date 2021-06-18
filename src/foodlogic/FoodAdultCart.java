package foodlogic;

public class FoodAdultCart implements FoodCart {

    @Override
    public Burger createBurger() {
        return new BigBurger();
    }

    @Override
    public Dessert createDessert() {
        return new BaileysCake();
    }
    
}
