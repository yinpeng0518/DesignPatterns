package creational.singleton;

/**
 * @description：
 * @author: huizuofandechengxuyuan
 * @date: 2019/8/15
 * @motto: 苦行和极简让人更加敏锐，匮乏既是富足，自律产生喜悦!
 */
public class T implements Runnable {

    @Override
    public void run() {
        LazySingleton singleton=LazySingleton.getSingleton();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
