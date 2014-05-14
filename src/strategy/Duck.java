package strategy;

import strategy.service.FlyBehavior;
import strategy.service.QuackBehavior;

/**
 * Created by QS on 14-5-14.
 */
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
