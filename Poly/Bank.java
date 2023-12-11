
//Parent class
public class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

// child class
class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class Test {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI ROI: " + s.getRateOfInterest());
        System.out.println("ICICI ROI: " + i.getRateOfInterest());
        System.out.println("AXIS: " + a.getRateOfInterest());

    }
}
