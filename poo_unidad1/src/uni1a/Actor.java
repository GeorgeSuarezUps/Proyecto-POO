package uni1a;

public class Actor {
    private String nombre; 
    private String paisOrigen; 
    private int anioNacimiento;

    // CONSTRUCTOR
    public Actor(String nombre, String paisOrigen, int anioNacimiento) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.anioNacimiento = anioNacimiento;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }
    
    public String getPaisOrigen() {
        return paisOrigen;
    }
    
    public int getAnioNacimiento() {
        return anioNacimiento;
    }
    
    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        // Validación básica
        if (anioNacimiento > 1900 && anioNacimiento < 2024) {
             this.anioNacimiento = anioNacimiento;
        }
    }
}