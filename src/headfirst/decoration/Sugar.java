package headfirst.decoration;

/**
 * 装饰类实现类
 */
public class Sugar extends Decorate{

    Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getInformation() {
        return coffee.getInformation() + "  加糖";
    }

    @Override
    public double price() {
        return coffee.price() + 4;
    }
}
