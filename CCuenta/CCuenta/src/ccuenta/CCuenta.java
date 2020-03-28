/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccuenta;

/**
 * Errores de documentación del proyecto CCuenta arreglados.
 *
 * @author admin
 * @since 28/2/2020
 * @version 2.0
 */
public class CCuenta {

    // Propiedades de la Clase Cuenta
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /* Constructor sin argumentos */
    /**
     * Constructor sin parámetros
     */
    public CCuenta() {

    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase
    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }
    // Método para asignar el nombre del titular de la cuenta

    /**
     * Método para asignar el nombre del titular de la cuenta
     * @param nom 
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    // Método que me devuelve el nombre del titular
    /**
     * Método que me devuelve el nombre del titular
     * @return nombre
     */
    public String obtenerNombre() {

        return getNombre();
    }

    // Método que me devuelve el saldo disponible en cada momento
    /**
     * Método que me devuelve el saldo disponible en cada momento
     * @return saldo
     */
    public double estado() {
        return getSaldo();
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    /**
     * Método para ingresar cantidades en la cuenta. Modifica el saldo. Este método va a ser probado con Junit
     * @param cantidad
     * @throws Exception :No se puede ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    
    /**
     * Método para retirar cantidades en la cuenta. Modifica el saldo.  Este método va a ser probado con Junit
     * @param cantidad
     * @throws Exception :No se puede retirar una cantidad negativa y No se hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    // Método que me devuelve el número de cuenta
    
    /**
     * Método que me devuelve el número de cuenta
     * @return cuenta
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
