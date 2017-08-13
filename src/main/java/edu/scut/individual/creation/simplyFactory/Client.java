package edu.scut.individual.creation.simplyFactory;

/**
 * Created by limin on 2017/8/13.
 */
public class Client {
    public static void main(String[] args) {
        IPerson person = SimpleFactory.createInstance("American");
        if (person != null) {
            person.speak();
        } else {
            System.out.println("没有创建对象。");
        }

    }
}
