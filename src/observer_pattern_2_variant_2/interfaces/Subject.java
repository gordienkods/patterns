package observer_pattern_2_variant_2.interfaces;

import observer_pattern_2.interfaces.Observer;

/**
 * Created by Dimon on 21.02.2017.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
