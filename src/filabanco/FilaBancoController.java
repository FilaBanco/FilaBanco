/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filabanco;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;
import pojo.Atendente;
import pojo.Ticket;

/**
 * @author Cauê
 */
public class FilaBancoController implements Initializable {
    
    
    private ArrayList<Ticket> listaNormal = new ArrayList<Ticket>();
    private ArrayList<Ticket> listaEspecial = new ArrayList<Ticket>();
    
    @FXML
    private RadioButton r1;
    private RadioButton r2;
    private RadioButton r3;
    private RadioButton r4;
    private RadioButton r5;
            
    @FXML
    private Button iniciar;
    @FXML
    private Button encerrar;
    @FXML
    private Text idTicket;
    
    private int a = 0;
    private int b = 0;
    
    
    
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
   
    
    
    @FXML
    private void iniciarAction(){
        proximo("Normal");
        
    }
    
    public Ticket proximo(String prioridade){
        Ticket ticket;
        if(prioridade.equals("Especial")){
         ticket = new Ticket(prioridade, a);
           a++;
           senhaEspecial(null);
        }else{
         ticket = new Ticket(prioridade, b);   
           b++;
           senhaNormal(null);
        }
        
        return ticket;
    }
    
    public int chamar(Atendente a){
        Random r = new Random();
        int f = 1 + r.nextInt(5);
        return f;
        
    }
    
    public void senhaEspecial(ActionEvent event){
        Ticket ticket = proximo("Especial");
        idTicket.setText(ticket.getId() + "");
        listaEspecial.add(ticket);
        
    }
    
    public void senhaNormal(ActionEvent event){
        Ticket ticket = proximo("Normal");
        idTicket.setText(ticket.getId() + "");
        listaNormal.add(ticket);
    }
    
}
