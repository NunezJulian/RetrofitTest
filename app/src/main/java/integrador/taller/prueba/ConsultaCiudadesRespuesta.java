package integrador.taller.prueba;

import java.util.List;

/**
 * Created by Julian Nuñez on 18/10/17.
 * eSoft del Pacifico
 */

public class ConsultaCiudadesRespuesta {
    public List<CiudadData> data;
    public CiudadMeta meta;

    public List<CiudadData> getData() {
        return data;
    }

    public void setData(List<CiudadData> data) {
        this.data = data;
    }

    public CiudadMeta getMeta() {
        return meta;
    }

    public void setMeta(CiudadMeta meta) {
        this.meta = meta;
    }
}
