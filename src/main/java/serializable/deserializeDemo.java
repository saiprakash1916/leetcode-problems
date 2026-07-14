package serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserializeDemo {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employee.ser"))) {
            employee employee = (serializable.employee) inputStream.readObject();
            System.out.println("Object Serialized: " + employee);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
