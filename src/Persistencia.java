import java.io.*;
import java.util.List;

public class Persistencia {

    public static <T extends Serializable> void serializar(String filename, List<T> objects) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(objects);
            System.out.println("Objeto serializado com sucesso.");
        } catch (IOException e) {
            System.out.println("Falha na serialização do objeto: " + e.getMessage());
        }
    }

    public static <T extends Serializable> List<T> desserializar(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Falha na desserialização do objeto: " + e.getMessage());
            return null;
        }
    }
}