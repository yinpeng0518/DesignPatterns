package creational.singleton;

/**
 * @description：静态内部类单例模式
 * @author: huizuofandechengxuyuan
 * @date: 2019/8/16
 * @motto: 苦行和极简让人更加敏锐，匮乏既是富足，自律产生喜悦!
 */
public class StaticInnerClassLazySingleton {

    private StaticInnerClassLazySingleton(){};

    private static class InnerClass{
        private static StaticInnerClassLazySingleton singleton=new StaticInnerClassLazySingleton();
    }

    public StaticInnerClassLazySingleton getSingleton(){

        return InnerClass.singleton;
    }
}
