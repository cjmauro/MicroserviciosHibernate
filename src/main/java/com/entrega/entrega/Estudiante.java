package com.entrega.entrega;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ESTUDIANTE")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Si el valor de LU es autoincrementable
    @Column(name = "LU", nullable = false)
    private int LU;

    @Column(name = "DNI", nullable = false)
    private int DNI;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Apellido", nullable = false)
    private String apellido;

    @Column(name = "Edad")
    private long edad;

    @Column(name = "Genero")
    private String genero;

    @Column(name = "Ciudad_Residencia")
    private String ciudadResidencia;

    // Getters and Setters

    public int getNumeroLibretaUniversitaria() {
        return LU;
    }

    public void setNumeroLibretaUniversitaria(int LU) {
        this.LU = LU;
    }

    public int getNumeroDocumento() {
        return DNI;
    }

    public void setNumeroDocumento(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    @Override
    public String toString() {
        return "Estudiante [numeroLibretaUniversitaria=" + LU + ", numeroDocumento=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + ", ciudadResidencia=" + ciudadResidencia + "]";
    }
}
