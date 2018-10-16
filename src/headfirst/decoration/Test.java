package headfirst.decoration;

/**
 * 装饰者模式测试
 */
public class Test {

    public static void main(String[] args) {
        Coffee coffee1 = new Coffee1();
        Coffee coffee2 = new Coffee2();

        Coffee decorate1 = new Sugar(coffee1);
        Coffee decorate2 = new Milk(coffee2);

        System.out.println(decorate1.getInformation() + "  " + decorate1.price());
        System.out.println(decorate2.getInformation() + "  " + decorate2.price());

    }
}
