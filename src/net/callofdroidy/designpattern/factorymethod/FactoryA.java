package net.callofdroidy.designpattern.factorymethod;

/**
 * Created by admin on 06/10/15.
 */
public class FactoryA implements IFactory{
    @Override
    public IProduct manufacture(){
        return new ConcreteProductA();
    }
}
