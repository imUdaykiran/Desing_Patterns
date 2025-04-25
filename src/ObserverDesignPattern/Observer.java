package ObserverDesignPattern;

public interface Observer {
    void update();//method to check fo an update from subject for state change

    void update(String message);//method used by subject to update observer for state change

    void setSubject(Subject subject);

}
