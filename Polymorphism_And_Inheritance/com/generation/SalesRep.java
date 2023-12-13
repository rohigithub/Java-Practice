
import com.generation.Employee;

public class SalesRep extends Employee {
    double salesMade;

    public int calculateComission() {
        int comisson = 0.1 * salesMade;
        return comisson;
    }

}
