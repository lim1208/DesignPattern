package edu.scut.individual.creation.abstractFactory;

/**
 * Created by limin on 2017/8/13.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new XiaomiFactory();
        UI xiaomiUI = factory.createUI();
        xiaomiUI.makeUI();
    }
}
