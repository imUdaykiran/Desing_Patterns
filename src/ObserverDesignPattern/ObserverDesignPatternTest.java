package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesignPatternTest {
    public static void main(String[] args)
    {
        Subject demoSubject = new SubjectDeom();
        List<Observer> observers = new ArrayList<>();
        for(int i= 1; i<=5; i++)
        {
            observers.add(new ObserverDemo("Observer-"+i));
        }

        for(Observer observer:observers)
        {
            demoSubject.register(observer);
            observer.setSubject(demoSubject);
        }

        observers.get(0).update();
        demoSubject.postMessage("Hello Java - message posted by Uday");
    }
}
