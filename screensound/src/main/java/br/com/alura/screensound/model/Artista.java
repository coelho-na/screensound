package br.com.alura.screensound.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "artistas")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremental
    private Long id;
    @Column(unique = true) // definindo o nome como único, não poderá ser inserido o mesmo artista duas vezes
    private String nome;
    @Enumerated(EnumType.STRING)
    private TipoArtista tipo;

@OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, fetch = FetchType.EAGER) // Um artista para várias músicas
    private List<Musica> musicas = new ArrayList<>();

    public Artista(){}

    public Artista(String nome, TipoArtista tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoArtista getTipo() {
        return tipo;
    }

    public void setTipo(TipoArtista tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  " Artista ='" + nome + '\'' +
                ", tipo=" + tipo +
                ", musicas=" + musicas ;
    }
}
