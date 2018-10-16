package headfirst.observer;

/**
 * 观察者模式
 */
public class Test {
    public static void main(String[] args) {
        WeChatServer weChatServer = new WeChatServer();
        IObserver user1 = new User("pqd");
        IObserver user2 = new User("wxz");
        weChatServer.add(user1);
        weChatServer.add(user2);
        weChatServer.setInfomation("tonight");
    }
}
