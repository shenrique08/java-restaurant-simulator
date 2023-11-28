import java.util.List;
import java.io.Serializable;
public class PratoPrincipal extends Prato implements Serializable {

    public PratoPrincipal(List<String> ingredientes, String descricao, double tempoPreparo) {
        super(ingredientes, descricao, tempoPreparo);
    }

}
