package br.com.alura.screensound.model;

import jakarta.persistence.*;

@Entity
@Table(name = "artistas")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremental
    private Long id;
    @Column(unique = true) // definindo o nome como único, não poderá ser inserido o mesmo artista duas vezes
    private String nome;
    private tipoArtista tipo;

}
