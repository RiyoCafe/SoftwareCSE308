package com.company.Burger;

public class cheeseBurgerDecorator extends BurgerDecorator{
    public cheeseBurgerDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return super.name()+" With cheese.";
    }

    @Override
    public double price() {
        return super.price();
    }


}
