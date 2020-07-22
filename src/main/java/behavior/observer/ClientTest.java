package behavior.observer;

import behavior.observer.observerImpl.Monster;
import behavior.observer.observerImpl.Trap;
import behavior.observer.observerImpl.Treasure;
import behavior.observer.subjectextends.Hero;

/**
 * Created By YinP
 * 2020/7/22
 * 测试
 */
public class ClientTest {

    public static void main(String[] args) {
        //初始化对象
        Hero hero = new Hero();
        Monster monster = new Monster();
        Trap trap = new Trap();
        Treasure treasure = new Treasure();
        //注册观察者
        hero.attachObserver(monster);
        hero.attachObserver(trap);
        hero.attachObserver(treasure);
        //移动事件
        hero.move();
    }
}
