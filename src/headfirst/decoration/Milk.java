package headfirst.decoration;

/**
 * 装饰类实现类
 */
public class Milk extends Decorate {

    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getInformation() {
        return coffee.getInformation()+ "   加奶";
    }

    @Override
    public double price() {
        return coffee.price() + 3;
    }
}
