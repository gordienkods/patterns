package observer_pattern_2.interfaces;

/**
 * Created by Dimon on 21.02.2017.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
