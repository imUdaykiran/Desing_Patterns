package ObserverDesignPattern;

public interface Subject {
    void register();
    void unregister();
    void notifyObservers();
    Object getUpdate();
    void postMessage(String message);

}
