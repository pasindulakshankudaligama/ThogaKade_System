import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Customer;
import model.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
       /* Customer customer = new Customer();
        customer.setId("C-001");
        customer.setName("Pasindu");
        customer.setAddress("Meegahakubura,Bulathsinhala");
        customer.setSalary(23000);
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();

        Item item = new Item();
        item.setCode("I-001");
        item.setDescription("Apple");
        item.setQtyOnHand(200);
        item.setUnitPrice(25);
        Session session1 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction1 = session1.beginTransaction();
        session1.save(item);
        transaction1.commit();
        session1.close();*/

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/DashBoardForm.fxml"))));
        primaryStage.show();

    }
}
