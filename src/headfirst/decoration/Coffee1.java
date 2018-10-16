package headfirst.decoration;

/**
 * 咖啡实现类
 */
public class Coffee1 extends Coffee {

    public Coffee1() {
        information = "coffee1";
    }

    @Override
    public double price() {
        return 10.0;
    }
}
