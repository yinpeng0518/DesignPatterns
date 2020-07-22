package behavior.observer.subjectextends;

import behavior.observer.Subject;

/**
 * Created By YinP
 * 2020/7/22
 */
public class Hero extends Subject {

    public void move() {
        System.out.println("主角向前移动");
        notifyObservers();
    }
}
