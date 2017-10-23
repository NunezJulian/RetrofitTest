package integrador.taller.prueba;

/**
 * Created by Julian Nuñez on 23/10/17.
 * eSoft del Pacifico
 */

public class MetaData {
    String message;
    String status;
    String devMessage;
    MetaData metaData;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDevMessage() {
        return devMessage;
    }

    public void setDevMessage(String devMessage) {
        this.devMessage = devMessage;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }
}
