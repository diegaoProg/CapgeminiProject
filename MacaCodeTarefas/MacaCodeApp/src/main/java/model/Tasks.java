/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author diegaoProg
 */
public class Tasks {
    private int cod, projCod;
    private String name, description, notes;
    private Date created, deadline;
    private boolean status;

    public Tasks(int cod, int projCod, String name, String description, String notes, Date created, Date deadline, boolean status) {
        this.cod = cod;
        this.projCod = projCod;
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.created = created;
        this.deadline = deadline;
        this.status = status;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getProjCod() {
        return projCod;
    }

    public void setProjCod(int projCod) {
        this.projCod = projCod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
