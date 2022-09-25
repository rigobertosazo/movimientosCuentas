
package cuentabanco_v2;

/**
 *
 * @author Rib
 */
public class movimientosCuentas {
    
     int saldo;
    
    //metodo saldo consulta
    public void consulta_saldo(){
        System.out.println("El saldo es de: Q."+saldo);
    }
    
    //abono a cuentas
    public void abono(int abono) {
        saldo += abono;
        System.out.println("Abono ingresado: Q."+saldo);
    }
    
    //metodo debito
    public void debito(int debito){
        saldo -= debito;
        System.out.println("Debito realizado exitosamente: Q." +saldo);
    }
    
}
