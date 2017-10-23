package integrador.taller.prueba;

/**
 * Created by Julian Nuñez on 23/10/17.
 * eSoft del Pacifico
 */

public class Junta {
    Integer juntaid;
    String nombre;
    Boolean status;
    CiudadData ciudad;

    public Integer getJuntaid() {
        return juntaid;
    }

    public void setJuntaid(Integer juntaid) {
        this.juntaid = juntaid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public CiudadData getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadData ciudad) {
        this.ciudad = ciudad;
    }
}
