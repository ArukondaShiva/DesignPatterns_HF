package CondimentDecoratorImpl;

import BeverageImpl.Beverage;

public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;

    public abstract String getDescription();
     
}
