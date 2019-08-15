package creational.singleton;

/**
 * @description：
 * @author: huizuofandechengxuyuan
 * @date: 2019/8/15
 * @motto: 苦行和极简让人更加敏锐，匮乏既是富足，自律产生喜悦!
 */
public class Test {

    public static void main(String[] args) {
        Thread t1=new Thread(new T());
        Thread t2=new Thread(new T());
        t1.start();
        t2.start();

        System.out.println("do finish");
    }
}
