mport java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MonServiceRPCClient {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: MonServiceRPCClient <adresse_ip_serveur>");
            System.exit(1);
        }

        try {
            String serverAddress = args[0]; // L'adresse IP du serveur

            Registry registry = LocateRegistry.getRegistry(serverAddress, 1098); // Use the same port as the server
            MonServiceRPCInterface monService = (MonServiceRPCInterface) registry.lookup("MonServiceRPC");

            // Avoir l'ID 
            int currentID = monService.getCurrentID();
            System.out.println("Le courant ID: " + currentID);

            // Incremente ID
            monService.incrementID();
            System.out.println("ID incrementé.");

            // Get the updated ID
            currentID = monService.getCurrentID();
            System.out.println("Le mouveau ID: " + currentID);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}