package net.callofdroidy.designpattern.abstractfactory;

/**
 * Created by Tuotuo on 12/10/2015.
 * ����ģʽ�ͳ��󹤳�����Ҫ�������ڣ�
 * ����ģʽ�У�һ������ֻ����һ����Ʒ�ߵ������������ǲ�ͬ�ͺŵĲ�Ʒ
 * ���󹤳��У�һ��������������Ʒ�ߵĲ�ͬ�ͺŲ�Ʒ������
 * ���  http://blog.csdn.net/zhengzhb/article/details/7359385
 */
public class Client {
    public static void main(String[] args){
        IFactory factory = new Factory();
        factory.manufactureProductTypeA().show();
        factory.manufactureProductTypeB().show();
    }
}
