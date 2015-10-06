package net.callofdroidy.designpattern.factorymethod;

/**
 * Created by admin on 06/10/15.
 */
public class ConcreteProductB implements IProduct{
    public ConcreteProductB(){
        System.out.println("Concrete Product B has been created");
    }

    @Override
    public void displayProductInfo(){
        System.out.println("The model of this product is: B");
    }
}
