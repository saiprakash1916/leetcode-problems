package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializeDemo {
    public static void main(String[] args) {
        employee employee = new employee(101, "Sai", 2500000);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employee.ser"))) {
            outputStream.writeObject(employee);
            System.out.println("Object Serialized Successfully...");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
