/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import status.StateTicket;

/**
 *
 * @author Cauê
 */
public class Ticket {
    private int id;
    private int nOperacoes;
    private String prioridade;
    private StateTicket s;

    public Ticket(String prioridade,int id) {
        this.prioridade = prioridade;
        this.id = id;
    }
    
    

    public int getId() {
        return id;
    }

    public StateTicket getStatus() {
        return s;
    }

    public int getnOperacoes() {
        return nOperacoes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setnOperacoes(int nOperacoes) {
        this.nOperacoes = nOperacoes;
    }

    public void setStatus(StateTicket s) {
        this.s = s;
    }
    
    
    
    
    
}
