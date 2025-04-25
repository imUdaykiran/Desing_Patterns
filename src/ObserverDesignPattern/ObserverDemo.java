package ObserverDesignPattern;

public class ObserverDemo implements Observer{
    String observerName;
    Subject subjectSubscribed;

    public ObserverDemo(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update() {
        String newMessage=(String)subjectSubscribed.getUpdate();
        if(newMessage==null)
        {
            System.out.println(observerName+" No message recieved!!");
        }
        else
        {
            System.out.println(observerName+" new message recieved: "+newMessage);
        }
    }

    @Override
    public void update(String newMessage) {
        if(newMessage==null)
        {
            System.out.println(observerName+" No message recieved!!");
        }
        else
        {
            System.out.println(observerName+" new message recieved: "+newMessage);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        subjectSubscribed=subject;
    }
}
