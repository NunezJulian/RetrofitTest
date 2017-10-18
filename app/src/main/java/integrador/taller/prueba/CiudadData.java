package integrador.taller.prueba;

/**
 * Created by Julian Nuñez on 17/10/17.
 * eSoft del Pacifico
 */

class CiudadData {
    public Integer ciudadid;
    public String nombre;
    public Boolean estadoactivo;
    public Estado estado;

    public Integer getCiudadid() {
        return ciudadid;
    }

    public void setCiudadid(Integer ciudadid) {
        this.ciudadid = ciudadid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstadoactivo() {
        return estadoactivo;
    }

    public void setEstadoactivo(Boolean estadoactivo) {
        this.estadoactivo = estadoactivo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
