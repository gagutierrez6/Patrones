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
public class EstacionClima {
    public static void main(String[] args) {
        DatosClima datosClima = new DatosClima();
        MostrarCondicionesCorrientes mostrarCorrientes = 
                new MostrarCondicionesCorrientes(datosClima);
        datosClima.setMediciones(80, 35, 30.4f);
        datosClima.setMediciones(82, 70, 29.2f);
        datosClima.setMediciones(78, 90, 29.2f);
    }
}
