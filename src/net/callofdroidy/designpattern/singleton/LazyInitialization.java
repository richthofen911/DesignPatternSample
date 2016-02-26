package net.callofdroidy.designpattern.singleton;

/**
 * Created by admin on 26/02/16.
 */
// 懒汉式，主要要注意getInstance()要synchronized， 否则线程不安全。详见链接

public class LazyInitialization {
    private static LazyInitialization instance;
    private LazyInitialization(){}

    public static synchronized LazyInitialization getInstance(){
        if(instance == null)
            instance = new LazyInitialization();
        return instance;
    }
}
