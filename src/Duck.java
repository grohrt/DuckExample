/**
 * Created by User on 5/17/2014.
 */
public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() { }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }


}

