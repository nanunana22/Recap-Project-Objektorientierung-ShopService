import java.util.List;

//Fügen Sie dem Auftrag einen Auftragsstatus hinzu (PROCESSING, IN_DELIVERY, COMPLETED), um den Status des Auftrags zu bestimmen.
//Erstellen Sie dazu einen neuen Zweig, erstellen und pushen Sie die Commits,
// erstellen Sie einen Pull-Request, überprüfen Sie den PR und führen Sie ihn mit dem Hauptzweig zusammen.

//Add an order status to the Order (PROCESSING, IN_DELIVERY, COMPLETED) to determine the status of the order.
//To do this, create a new branch, create and push the commits, create a pull request, review the PR, and merge it into the main branch.

public record Order(
        String id,
        List<Product> products)
{
    public enum OrderStatus {
        PROCESSING,
        IN_DELIVERY,
        COMPLETED
    }
}
