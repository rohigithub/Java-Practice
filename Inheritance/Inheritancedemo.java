//class Person parent
class Person {
    public String Name;
    public String Address;
    public String Adharnumber;
    public String Pan;

    public Person() {
        // TODO Auto-generated constructor stub
    }

    public Person(String name, String address, String adharnumber, String pan) {

        this.Name = name;
        this.Address = address;
        this.Adharnumber = adharnumber;
        this.Pan = pan;
    }

    // method to print data
    public void display() {
        System.out.println("*********************************");
        System.out.println("Data from Parent ");
        System.out.println("*********************************");
        System.out.println("Name" + this.Name);
        System.out.println("Address" + this.Address);
        System.out.println("Adhar" + this.Adharnumber);
        System.out.println("Pan" + this.Pan);
        System.out.println("*********************************");
    }

}

// class employee
class Emp extends Person {
    int Emp_id;
    String departmentString;
    int salary;

    public Emp() {
        // TODO Auto-generated constructor stub
    }

    public Emp(String name, String address, String adharnumber, String pan, int emp_id, String departmentString,
            int salary) {
        super(name, address, adharnumber, pan);
        this.Emp_id = emp_id;
        this.departmentString = departmentString;
        this.salary = salary;
    }

    public void printemployee() {
        System.out.println("***************************");
        System.out.println("Employee details");
        System.out.println("__________________________");
        System.out.println("Emp id: " + this.Emp_id);
        System.out.println("Department: " + this.departmentString);
        System.out.println("Salary: " + this.salary);
    }

}

class Inheritancedemo {

    public static void main(String[] args)

    {
        // Emp e1=new Emp();

        // String name, String address, String adharnumber, String pan,int emp_id,
        // String departmentString, int salary
        Emp obj1 = new Emp("Don", "Bombay", "5544654", "ajkbd552", 111, "banbas", 5000);
        obj1.printemployee();

    }
    // TODO Auto-generated method stub

}
