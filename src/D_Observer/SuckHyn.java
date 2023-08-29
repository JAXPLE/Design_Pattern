package D_Observer;

public class SuckHyn implements Crew{
    @Override
    public void update(String msg) {
        System.out.println("석현이는 "+msg);
    }
}
