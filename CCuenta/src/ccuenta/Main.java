/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ccuenta;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param cuentaUno
     */
    
    public void operacionesCuenta(CCuenta cuentaUno){
        try 
        {
            cuentaUno.retirar(2300);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            cuentaUno.ingresar(695);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }
    
    public static void main(String[] args) {
        CCuenta cuentaUno;
        double saldoActual;
        
        cuentaUno = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        
        saldoActual = cuentaUno.estado();
        System.out.println("El saldo actual es"+ saldoActual );
    }

}
