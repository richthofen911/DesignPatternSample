package net.callofdroidy.designpattern.factorymethod;

/**
 * Created by admin on 06/10/15.
 */
public class TestFactoryMethod {
    public static void main(String[] args){
        IFactory factory1 = new FactoryA();
        IFactory factory2 = new FactoryB();

        IProduct product1 = factory1.manufacture();
        product1.displayProductInfo();
        System.out.println("------------------------");
        IProduct product2 = factory2.manufacture();
        product2.displayProductInfo();
    }
}
