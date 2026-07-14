package serializable;

import java.io.Serial;
import java.io.Serializable;

public class employee implements Serializable {

    // Recommended: version control for serialized objects
    @Serial
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private double salary;

    // transient fields are NOT serialized
    private transient String password;

    public employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
