package com.dinvestigacion.directrizinvestigacion.Models;


import javax.persistence.*;

@Entity
@Table (name = "directrices")

public class DirectrizInvestigacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

 //Atributos//

    private String id;
    private String directriz;



 //Constructores//

    public DirectrizInvestigacion() {
        super();
    }

    public DirectrizInvestigacion(String id, String directriz) {
        this.id = id;
        this.directriz = directriz;
    }

    //Getters & Setters//


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDirectriz() {
        return directriz;
    }

    public void setDirectriz(String directriz) {
        this.directriz = directriz;
    }
}
