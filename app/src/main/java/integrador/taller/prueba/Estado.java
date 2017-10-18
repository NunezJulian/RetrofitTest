package integrador.taller.prueba;

/**
 * Created by Julian Nuñez on 17/10/17.
 * eSoft del Pacifico
 */

class Estado {
    public Integer estadoid;
    public String nombre;
    public Boolean estadoactivo;

    public Integer getEstadoid() {
        return estadoid;
    }

    public void setEstadoid(Integer estadoid) {
        this.estadoid = estadoid;
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
}
