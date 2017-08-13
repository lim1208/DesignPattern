package edu.scut.individual.creation.abstractFactory;

/**
 * Created by limin on 2017/8/13.
 */
public class MeizuFactory implements IFactory {
    public UI createUI() {
        return new MeizuSystem();
    }

    public Cpu createCpu() {
        return new MeizuCpu();
    }
}
