package com.socorro.simulado.entity;

import jakarta.persistence.*;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String descricao;

    private StatusCurso status;

    private PrioridadeCurso prioridade;

    private boolean deleted = false;

    public Curso() {
    }

    public Curso(Long id, String nome, String descricao, StatusCurso status, PrioridadeCurso prioridade, boolean deleted) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.prioridade = prioridade;
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public void setStatus(StatusCurso status) {
        this.status = status;
    }

    public StatusCurso getStatus() {
        return status;
    }

    public void setPrioridade(PrioridadeCurso prioridade) {
        this.prioridade = prioridade;
    }

    public PrioridadeCurso getPrioridade() {
        return prioridade;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}