package headfirst.decoration;

/**
 * 咖啡实现类
 */
public class Coffee2 extends Coffee{

    public Coffee2() {
        information = "coffee2";
    }

    @Override
    public double price() {
        return 12.0;
    }
}
