package net.callofdroidy.designpattern.abstractfactory;

/**
 * Created by Tuotuo on 12/10/2015.
 */
public class Factory implements IFactory {
    public IProductTypeA manufactureProductTypeA(){
        return new ConcreteProductTypeA();
    }

    public IProductTypeB manufactureProductTypeB(){
        return new ConcreteProductTypeB();
    }
}
