import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MonServiceRPCServeur extends UnicastRemoteObject implements MonServiceRPCInterface {
    private int currentID = 0;

    protected MonServiceRPCServeur() throws RemoteException {
        super();
    }

    @Override
    public int getCurrentID() throws RemoteException {
        return currentID;
    }

    @Override
    public void incrementID() throws RemoteException {
        currentID++;
    }

    public static void main(String[] args) {
        try {
            MonServiceRPCServeur monService = new MonServiceRPCServeur();
            Registry registry = LocateRegistry.createRegistry(1098); // Use the same port as the client
            registry.rebind("MonServiceRPC", monService);
            System.out.println("Serveur RMI prêt.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}