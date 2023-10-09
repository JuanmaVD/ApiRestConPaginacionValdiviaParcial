package com.utn.Tp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Localidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Localidad extends Base{
    private String denominacion;
}
