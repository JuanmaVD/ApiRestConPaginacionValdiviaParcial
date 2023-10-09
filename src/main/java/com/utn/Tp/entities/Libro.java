package com.utn.Tp.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Libro extends Base{
    private int fecha;
    private String genero;
    private int paginas;
    private String titulo;
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
