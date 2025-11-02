package uni1a;

public class Investigador {
    private String nombreCompleto;
    private String especialidad; // Ej: "Biología Marina", "Historia Antigua"
    private String institucion;

    // CONSTRUCTOR
    public Investigador(String nombreCompleto, String especialidad, String institucion) {
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
        this.institucion = institucion;
    }
    
    // GETTERS (Métodos de Acceso)
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getInstitucion() {
        return institucion;
    }

    // SETTERS (Métodos de Mutación)
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
}