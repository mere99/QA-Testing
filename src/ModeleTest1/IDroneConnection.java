package ModeleTest1;

public interface IDroneConnection {
    void connectUser(String userId);
    void disconnectUser(String userID);
    boolean isUserConnected(String userId);
    String getDedicatedChannel(String userId);

}
