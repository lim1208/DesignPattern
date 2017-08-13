package edu.scut.individual.creation.simplyFactory;

/**
 * Created by limin on 2017/8/13.
 */
public class SimpleFactory {
    public static IPerson createInstance(String personName) {
        IPerson person = null;
        if ("Chinese".equals(personName)) {
            person = new Chinese();
        } else if ("American".equals(personName)) {
            person = new American();
        }
        return person;
    }
}
