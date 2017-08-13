package edu.scut.individual.creation.abstractFactory;

/**
 * Created by limin on 2017/8/13.
 */
public interface IFactory {
    UI createUI();
    Cpu createCpu();
}
