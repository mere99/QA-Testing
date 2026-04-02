package ModeleTest1.AutonomousDriving;

public interface IDroneConnection {
    void connectUser(String userId);
    void disconnectUser(String userID);
    boolean isUserConnected(String userId);
    String getDedicatedChannel(String userId);

}
