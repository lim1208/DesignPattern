package edu.scut.individual.creation.abstractFactory;

/**
 * Created by limin on 2017/8/13.
 */
public class XiaomiFactory implements IFactory {
    public UI createUI() {
        return new XiaomiSystem();
    }

    public Cpu createCpu() {
        return new XiaomiCpu();
    }
}
