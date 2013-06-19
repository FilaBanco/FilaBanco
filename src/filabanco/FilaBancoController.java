/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filabanco;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * @author Cauê
 */
public class FilaBancoController implements Initializable {
    
    Random gerador = new Random();
    Gerador gerar = new Gerador();
    
    @FXML
    private Button iniciar;
    @FXML
    private Button encerrar;
    @FXML
    private Text idTicket;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
   
    
    @FXML
    private void iniciarAction(){
       int proximo = 0;
       while(encerrar.isPressed() == false){
            int tempo = gerador.nextInt(6000);
            int prioridade = gerador.nextInt(6);
            System.out.println("TEMPO:" + tempo);
            System.out.println("PRIORIDADE: " + prioridade);
            gerar.Gerador(tempo);
            proximo++;
            idTicket.setText(Integer.toString(proximo));
            
       }
    }
    
    
}
