package creational.singleton;

/**
 * @description：懒汉式单例模式
 * @author: huizuofandechengxuyuan
 * @date: 2019/8/15
 * @motto: 苦行和极简让人更加敏锐，匮乏既是富足，自律产生喜悦!
 */
public class LazySingleton {

    private LazySingleton(){}

    public static LazySingleton singleton=null;

    public static synchronized LazySingleton getSingleton(){
        if(singleton==null){
                singleton=new LazySingleton();
        }
        return singleton;
    }
}
