package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Motocicleta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String marcaMotocicleta;
    private String placaMotocicleta;
    private int cilindrajeMotocicleta;
    private double precioMotocicleta;
    private String colorMotocicleta;

   
    public Motocicleta() {}

    
    public Motocicleta(String marcaMotocicleta, String placaMotocicleta, int cilindrajeMotocicleta, double precioMotocicleta, String colorMotocicleta) {
        this.marcaMotocicleta = marcaMotocicleta;
        this.placaMotocicleta = placaMotocicleta;
        this.cilindrajeMotocicleta = cilindrajeMotocicleta;
        this.precioMotocicleta = precioMotocicleta;
        this.colorMotocicleta = colorMotocicleta;
    }

    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getMarcaMotocicleta() { return marcaMotocicleta; }
    public void setMarcaMotocicleta(String marcaMotocicleta) { this.marcaMotocicleta = marcaMotocicleta; }
    public String getPlacaMotocicleta() { return placaMotocicleta; }
    public void setPlacaMotocicleta(String placaMotocicleta) { this.placaMotocicleta = placaMotocicleta; }
    public int getCilindrajeMotocicleta() { return cilindrajeMotocicleta; }
    public void setCilindrajeMotocicleta(int cilindrajeMotocicleta) { this.cilindrajeMotocicleta = cilindrajeMotocicleta; }
    public double getPrecioMotocicleta() { return precioMotocicleta; }
    public void setPrecioMotocicleta(double precioMotocicleta) { this.precioMotocicleta = precioMotocicleta; }
    public String getColorMotocicleta() { return colorMotocicleta; }
    public void setColorMotocicleta(String colorMotocicleta) { this.colorMotocicleta = colorMotocicleta; }
}
