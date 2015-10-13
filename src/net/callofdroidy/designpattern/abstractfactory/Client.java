package net.callofdroidy.designpattern.abstractfactory;

/**
 * Created by Tuotuo on 12/10/2015.
 * 工厂模式和抽象工厂的主要区别在于：
 * 工厂模式中，一个工厂只负责一个产品线的生产，可以是不同型号的产品
 * 抽象工厂中，一个工厂负责多个产品线的不同型号产品的生产
 * 详见  http://blog.csdn.net/zhengzhb/article/details/7359385
 */
public class Client {
    public static void main(String[] args){
        IFactory factory = new Factory();
        factory.manufactureProductTypeA().show();
        factory.manufactureProductTypeB().show();
    }
}
