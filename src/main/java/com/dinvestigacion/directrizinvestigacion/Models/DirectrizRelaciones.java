package com.dinvestigacion.directrizinvestigacion.Models;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Directriz_Investigacion")
public class DirectrizRelaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Atributos//
    private String id;
    private String directrizRelacion;

    private Date Fecha_Directriz;



    //Constructores//

    public DirectrizRelaciones() {
        super();
    }

    public DirectrizRelaciones(String id, String directrizRelacion, Date Fecha_Directriz) {
        this.id = id;
        this.directrizRelacion = directrizRelacion;
        this.Fecha_Directriz= Fecha_Directriz;
    }

    //Getters & Setters//


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDirectrizRelacion() {
        return directrizRelacion;
    }

    public void setDirectrizRelacion(String directrizRelacion) {
        this.directrizRelacion = directrizRelacion;

    }

    public Date getFecha_Directriz() {
        return Fecha_Directriz;
    }

    public void setFecha_Directriz(Date fecha_Directriz) {
        Fecha_Directriz = fecha_Directriz;
    }
}
