package strategy.serviceImpl;

import strategy.service.FlyBehavior;

/**
 * Created by QS on 14-5-14.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
