package edu.scut.individual.creation.factoryMethod;

/**
 * Created by limin on 2017/8/13.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createInstance();
        student.sweep();
        student.wash();
    }
}
