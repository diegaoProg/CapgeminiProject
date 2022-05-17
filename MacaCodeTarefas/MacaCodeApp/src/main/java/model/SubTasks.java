/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author diegaoProg
 */
public class SubTasks {
    private int cod, taskCod;
    private String name, description;
    private boolean completed;

    public SubTasks(int cod, int taskCod, String name, String description, boolean completed) {
        this.cod = cod;
        this.taskCod = taskCod;
        this.name = name;
        this.description = description;
        this.completed = completed;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getTaskCod() {
        return taskCod;
    }

    public void setTaskCod(int taskCod) {
        this.taskCod = taskCod;
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

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    
    
    
    
}
