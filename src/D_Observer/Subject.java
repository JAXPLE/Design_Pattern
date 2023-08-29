package D_Observer;

public interface Subject {
    void register(Crew crew);
    void unRegister(Crew crew);
    void notifyCrew(String msg);
}
