package headfirst.observer;

/**
 * 主题
 */
public interface ISubject {

    void add(IObserver observer);

    void delete(IObserver observer);

    void notice();
}
