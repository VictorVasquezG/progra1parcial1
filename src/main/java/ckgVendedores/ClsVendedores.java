/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ckgVendedores;

import java.util.Random;

/**
 *
 * @author MajestadVictor
 */
public class ClsVendedores {
    
public static void main(String[] args) {

    String[] Vendedores = {"VICTOR", "MANUEL", "BRITNEY", "LUCIA", "CARLITOS"};
        float[][] Datos = new float[5][10];
        Random random = new Random();
        float Ttlmeses = 0;

        for (int i = 0; i < 5; i++) {
        float Tltmeses = 0;
            for (int j = 0; j < 4; j++) {
                Datos[i][j] = random.nextInt(2500) + 150;
                Tltmeses += Datos[i][j];
            }

            
            Datos[i][4] = Tltmeses;
            if (Datos[i][4] <= 2000) {
                Datos[i][5] = Datos[i][4] * 0.20f;
                Datos[i][7] = Datos[i][4] + Datos[i][5];
            } else {
                Datos[i][6] = Datos[i][4] * 0.35f;
                Datos[i][7] = Datos[i][4] + Datos[i][6];
            }

            Datos[i][8] = Datos[i][7] * 0.05f; 
            Datos[i][9] = Datos[i][7] - Datos[i][8]; 
        }

        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.printf("%20s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s", "Nombre", "ENERO", "FEBRERO", "MARZO","ABRIL","TOTAL VENTAS","20%","35%","SUB TOTAL","QUITAR ISR 5%","TOTAL");
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.format("%20s", Vendedores[i]); 
            for (int j = 0; j < 10; j++) {
                System.out.format("%16s", Datos[i][j]);   
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        float TltColumnas;
        System.out.format("%20s", "Total"); 
        for(int i=0; i<10; i++){
            TltColumnas=0;
            for(int j=0; j<5; j++){
                TltColumnas+=Datos[j][i];
            }
            System.out.format("%16s", TltColumnas);
        }
        
        System.out.println();
}
    
}
