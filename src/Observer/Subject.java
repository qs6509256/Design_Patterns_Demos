package Observer;

/**
 * Created by QS on 14-5-14.
 */
public interface Subject {
    public void register(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
