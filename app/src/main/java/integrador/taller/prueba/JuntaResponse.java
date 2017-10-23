package integrador.taller.prueba;

/**
 * Created by Julian Nuñez on 23/10/17.
 * eSoft del Pacifico
 */

public class JuntaResponse {
    CiudadData data;
    MetaData meta;

    public CiudadData getData() {
        return data;
    }

    public void setData(CiudadData data) {
        this.data = data;
    }

    public MetaData getMeta() {
        return meta;
    }

    public void setMeta(MetaData meta) {
        this.meta = meta;
    }
}
