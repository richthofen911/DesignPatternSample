package net.callofdroidy.designpattern.singleton;

/**
 * Created by admin on 26/02/16.
 * 这种方式也是Effective Java 提倡的方式，它不光能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒啊，
 * 但为由于1.5中才加入enum特性，用这种方式写不免让人感觉生疏
 */
public enum EnumSingleton {
    INSTANCE;

    public void output(){
        System.out.println("output method");
    }


}
