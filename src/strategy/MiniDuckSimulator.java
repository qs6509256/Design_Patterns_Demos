package strategy;

import strategy.serviceImpl.FlyWithWings;

/**
 * Created by QS on 14-5-14.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck miniDuck = new MiniDuck();
        miniDuck.performFly();
        miniDuck.performQuack();
        miniDuck.display();
        miniDuck.setFlyBehavior(new FlyWithWings());
        miniDuck.performFly();
    }
}
