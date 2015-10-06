package net.callofdroidy.designpattern.factorymethod;

/**
 * Created by admin on 06/10/15.
 */
public class ConcreteProductA implements IProduct{
    public ConcreteProductA(){
        System.out.println("Concrete Product A has been created");
    }

    @Override
    public void displayProductInfo(){
        System.out.println("The model of this product is: A");
    }
}
