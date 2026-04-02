package ModeleTest1.AutonomousDriving;

import java.util.HashMap;
import java.util.Map;

//clasa SINGLETON
public class DroneConnection implements IDroneConnection {
    private static DroneConnection instance = new DroneConnection();
    public static synchronized DroneConnection getInstance(){
        if(instance==null){
            return new DroneConnection();
        }
        return instance;
    }
private DroneConnection(){};

    //mi-ar trb un Map ca sa retin userId conectati si conexiunea lor unica
    Map<String, String> mapa = new HashMap<>();

    @Override
    public void connectUser(String userId) {
        if(mapa.containsKey(userId)){throw new IllegalStateException("ACEST USER ESTE DEJA CONECTAT");}
        String channel = "CHAN-"+userId;
       mapa.put(userId, channel);
    }

    @Override
    public void disconnectUser(String userID) {
        mapa.remove(userID);
        System.out.println("am deconectat user-ul "+ userID);
    }

    @Override
    public boolean isUserConnected(String userId) {
        if(mapa.containsKey(userId)){
            System.out.println("userul "+userId+" este conectat");
            return true;
        }else{
            System.out.println("userul "+userId+" NU este conectat");
            return false;}
    }

    @Override
    public String getDedicatedChannel(String userId) {
        if(!mapa.containsKey(userId)){throw new IllegalStateException("ACEST USER NU ESTE  CONECTAT");}
        return mapa.get(userId);
    }

    public void showConnections(){
        System.out.println(mapa);
    }
}
