package D_Observer;

import java.util.ArrayList;
import java.util.List;

public class Owner implements Subject{
    private List<Crew> crewList = new ArrayList<>();

    @Override
    public void register(Crew crew) {
        crewList.add(crew);
    }

    @Override
    public void unRegister(Crew crew) {
        crewList.remove(crew);
    }

    @Override
    public void notifyCrew(String msg) {
    crewList.forEach(crew -> crew.update(msg));
    }
}
