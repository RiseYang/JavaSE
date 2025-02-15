package singleton;

import com.sun.org.apache.xerces.internal.parsers.CachingParserPool;

/**
 * @className: SingletonDCL
 * @author: yang
 * @date: 2025/2/15 13:18
 * @Version: 1.0
 * @description: 线程安全的单例模式
 */
public class SingletonDCL {
    //私有构造
    private SingletonDCL(){}
    //私有变量
    private static final SingletonDCL singleton = null;
    //双重检查锁定
    public static SingletonDCL getInstance(){
        if (singleton==null){
           synchronized (SingletonDCL.class){
                if(singleton==null){
                    return new SingletonDCL();
                }
            }
        }
        return singleton;
    }

}