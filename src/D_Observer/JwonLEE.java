package D_Observer;

public class JwonLEE implements Crew{
    @Override
    public void update(String msg) {
        System.out.println("재원이는 "+msg);
    }
}
