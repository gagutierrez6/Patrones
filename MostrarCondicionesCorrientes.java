/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionClima;

import javax.security.auth.Subject;

/**
 *
 * @author Usuario
 */
public class MostrarCondicionesCorrientes implements Observador, MostarElemento{
    private float temperatura;
    private float humedad;
    private Sujeto datosClima;

    public MostrarCondicionesCorrientes(Sujeto datosClima) {
        this.datosClima= datosClima;
        datosClima.registroObservador(this);
    }

  
    
    

    @Override
    public void update (float temperatura, float humedad, float presion) {
        this.temperatura=temperatura;
        this.humedad=humedad;
        display();
    }

    @Override
    public void display() {
        System.out.println("Condiciones corrientes: " + temperatura+ "F grados y  " +humedad+"%humedad");
    }
    
}
