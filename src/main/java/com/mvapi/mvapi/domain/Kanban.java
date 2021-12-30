package com.mvapi.mvapi.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Kanban {
    private String paciente;
    private String cor;
    private Date classificacao;
    private Date fau;
    private Long atendimento;

    public Kanban() {
    }

    public Kanban(String paciente, String cor, Date classificacao, Date fau, Long atendimento) {
        this.paciente = paciente;
        this.cor = cor;
        this.classificacao = classificacao;
        this.fau = fau;
        this.atendimento = atendimento;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Date classificacao) {
        this.classificacao = classificacao;
    }

    public Date getFau() {
        return fau;
    }

    public void setFau(Date fau) {
        this.fau = fau;
    }

    public Long getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Long atendimento) {
        this.atendimento = atendimento;
    }
}


