package net.callofdroidy.designpattern.singleton;

/**
 * Created by admin on 26/02/16.
 * 饿汉式，用static和final修饰instance,第一次加载类到内存中就会初始化，所以创建本身线程安全，但是可能造成不必要创建，占用空间
 * 饿汉式的创建方式在一些场景中将无法使用：譬如 Singleton 实例的创建是依赖参数或者配置文件的，在 getInstance() 之前必须调用
 * 某个方法设置参数给它，那样这种单例写法就无法使用了。
 */
public class EagerInitialization {

    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
        return instance;
    }
}
