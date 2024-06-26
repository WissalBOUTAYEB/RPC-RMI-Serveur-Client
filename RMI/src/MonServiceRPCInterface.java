
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MonServiceRPCInterface extends Remote {
    int getCurrentID() throws RemoteException;
    void incrementID() throws RemoteException;
}