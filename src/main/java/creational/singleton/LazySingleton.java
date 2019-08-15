package creational.singleton;

/**
 * @description：
 * @author: huizuofandechengxuyuan
 * @date: 2019/8/15
 * @motto: 苦行和极简让人更加敏锐，匮乏既是富足，自律产生喜悦!
 */
public class LazySingleton {

    private LazySingleton(){}

    public static LazySingleton singleton=null;

    public static LazySingleton getSingleton(){
        if(singleton==null){
            synchronized (LazySingleton.class){
                singleton=new LazySingleton();
            }
        }
        return singleton;
    }
}
