/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionClima;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class DatosClima implements Sujeto{
    private ArrayList observadores;
    private float temperatura;
    private float humedad;
    private float presion;
    public DatosClima(){
    observadores = new ArrayList();
    }

    @Override
    public void registroObservador(Observador o) {
       observadores.add(o);
    }

    @Override
    public void removerObservador(Observador o) {
        int i = observadores.indexOf(o);
        if(i >=0){
            observadores.remove(i);
        }
    }

    @Override
    public void notificarObservadores() {
        for (int i = 0; i < observadores.size(); i++) {
            Observador observador = (Observador)observadores.get(i);
            observador.update(temperatura, humedad, presion);
            
        }
    }
    public void cambioMedicion(){
        notificarObservadores();
    }
    public void setMediciones(float temperatura, float humedad, float presion){
    this.temperatura=temperatura;
    this.humedad=humedad;
    this.presion= presion;
    cambioMedicion();
    }
    
}
