/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionClima;

/**
 *
 * @author Usuario
 */
public interface Observador {
    public void update (float temp, float humedad, float presion);
}
