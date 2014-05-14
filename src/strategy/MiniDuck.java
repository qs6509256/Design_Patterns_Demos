package strategy;

import strategy.serviceImpl.FlyWithNoWings;
import strategy.serviceImpl.Quack;

/**
 * Created by QS on 14-5-14.
 */
public class MiniDuck extends Duck {

    public MiniDuck() {
        flyBehavior = new FlyWithNoWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a MiniDuck");
    }


}
