package net.callofdroidy.designpattern.singleton;

/**
 * Created by admin on 26/02/16.
 * 这种方法也是《Effective Java》上所推荐的。
 *
 * 这种写法仍然使用JVM本身机制保证了线程安全问题；由于 SingletonHolder 是私有的，除了 getInstance() 之外没有办法访问它，
 * 只要没有调用getInstance()，instance就不会被初始化，因此它是懒汉式的；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本。
 */
public class StaticNestedClassPattern {
    private static class SingletonHolder{
        private static final StaticNestedClassPattern INSTANCE = new StaticNestedClassPattern();
    }

    private StaticNestedClassPattern(){}

    public static final StaticNestedClassPattern getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
