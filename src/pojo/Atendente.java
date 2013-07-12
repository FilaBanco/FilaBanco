/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import status.StateAtendente;

/**
 *
 * @author Cauê
 */
public class Atendente {
    private int id;
    private String nome;
    private StateAtendente s;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public StateAtendente getStatus() {
        return s;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(StateAtendente s) {
        this.s = s;
    }
    
    
    
}
