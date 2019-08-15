package creational.singleton;

/**
 * @description：双重检查懒汉式单例模式
 * @author: huizuofandechengxuyuan
 * @date: 2019/8/16
 * @motto: 苦行和极简让人更加敏锐，匮乏既是富足，自律产生喜悦!
 */
public class DoubleCheckLazySingleton {

    private DoubleCheckLazySingleton() {
    }

    private volatile static DoubleCheckLazySingleton doubleCheckLazySingleton = null;

    public static DoubleCheckLazySingleton getDoubleCheckLazySingleton() {
        if (doubleCheckLazySingleton == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (doubleCheckLazySingleton == null) {
                    /**
                     * 1.分配对象的内存空间
                     * 2.初始化对象
                     * 3.设置instance指向内存空间
                     */
                    doubleCheckLazySingleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return doubleCheckLazySingleton;
    }
}
