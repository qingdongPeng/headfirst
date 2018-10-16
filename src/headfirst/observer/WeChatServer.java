package headfirst.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者,微信公众号
 */
public class WeChatServer implements ISubject{

    private List<IObserver> list ;

    private String messgae;

    public WeChatServer() {
        list = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer) {
        list.add(observer);
    }

    @Override
    public void delete(IObserver observer) {
        if(!list.isEmpty()){
            list.remove(observer);
        }
    }

    @Override
    public void notice() {
        for (int i = 0 ; i < list.size(); i++){
            list.get(i).update(messgae);
        }
    }

    public void setInfomation(String s) {
        this.messgae = s;
        System.out.println("微信服务更新消息: " + s);
        //消息更新，通知所有观察者
        notice();
    }
}
