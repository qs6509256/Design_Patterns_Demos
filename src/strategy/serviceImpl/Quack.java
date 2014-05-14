package strategy.serviceImpl;

import strategy.service.QuackBehavior;

/**
 * Created by QS on 14-5-14.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("guagua");
    }
}
