package hibernate_test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Puesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;

    @Override
    public String toString() {
        return "Puesto [id=" + id + ", nombre=" + nombre + "]";
    }

    public Puesto() {
    }

    public Puesto(String nombre) {
        this.nombre = nombre;
    }
    
    
}
