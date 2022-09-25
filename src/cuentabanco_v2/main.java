/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabanco_v2;

/**
 *
 * @author Rib
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cuenta1
        movimientosCuentas objeto1 = new  movimientosCuentas(); //cuenta1
        System.out.println("------------- Cuenta1 -------------------");
        objeto1.saldo = 4500;
        objeto1.consulta_saldo();
        objeto1.abono(300);
        objeto1.debito(1100);
        System.out.println("-----------------------------------------");
        
        //cuenta2
        movimientosCuentas objeto2 = new  movimientosCuentas(); //cuenta2
        System.out.println("------------- Cuenta2 -------------------");
        objeto2.saldo = 3000;
        objeto2.consulta_saldo();
        objeto2.abono(500);
        objeto2.debito(800);
        System.out.println("-----------------------------------------");
    }
}
    

