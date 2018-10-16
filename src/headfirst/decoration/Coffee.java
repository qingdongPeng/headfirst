package headfirst.decoration;

/**
 * 咖啡类接口
 */
public abstract class Coffee {

    protected String information = "普通咖啡";

    public String getInformation(){
        return information;
    }

    public abstract double price();
}
