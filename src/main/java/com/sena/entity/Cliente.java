package com.sena.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
@Getter
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;
    private String direccion;
    private String telefono;
    private String email;


}
