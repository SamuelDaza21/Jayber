/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.con.jayber;

import java.util.Scanner;

/**
 *
 * @author dazas
 */
public class EjecutordeNotas_ProgramacionII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Input=new Scanner(System.in);
        int CanAlum,Over_Prom,Below_Prom;
        double Promedio;
        System.out.println("Ingresa cuantos alumnos presentarón el examen");
        CanAlum=Input.nextInt();
        double []Notas_Estudiantes=new double[CanAlum];
        System.out.println("ingresa la Nota de cada alumno");
        for(int a=0; a<Notas_Estudiantes.length;a++){
            Notas_Estudiantes[a]=Input.nextDouble();
        }
        Notas_ProgramacionII notas=new Notas_ProgramacionII(Notas_Estudiantes);
        Promedio=notas.Get_Promedio();
        String promedioFormateado = String.format("%.2f", Promedio);
        Over_Prom=notas.Get_Over_Prom();
        Below_Prom=notas.Get_Below_Prom();
        System.out.println("Los resultados son: \n Promedio de notas: "+promedioFormateado+"\n Estudiantes sobre el promedio: "+Over_Prom+"\n Estudiantes por debajo del promedio: "+Below_Prom);
        
    }
    
}
