package net.callofdroidy.designpattern.singleton;

/**
 * Created by admin on 26/02/16.
 * 双重检验锁模式, 重点在于instance要用volatile修饰
 */
public class DoubleCheckedLocking {
    private volatile static DoubleCheckedLocking instance;
    private DoubleCheckedLocking(){}

    public static DoubleCheckedLocking getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedLocking.class){
                if(instance == null)
                    instance = new DoubleCheckedLocking();
            }
        }
        return instance;
    }
}
