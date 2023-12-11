import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class test implements Serializable {

    test t1 = new test(211, "Rohit");
    // creating stream and writing the object
    FileOutputStream fout = new FileOutputStream("file.txt");
    ObjectOutputStream out = new ObjectOutputStream(fout);out.writeObject(t1);out.flusg();
    // closing the stream
    out.close();System.out.println("success");}catch(Exception e){
    System.out.println(e);
}
}}
