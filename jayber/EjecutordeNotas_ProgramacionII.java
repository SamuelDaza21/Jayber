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
        // Se crea un objeto de tipo Scanner que permitira el ingreso de datos
         Scanner Input=new Scanner(System.in);
         //se establecen las variables a usar
        int CanAlum;
        boolean check=false;
        //ingreso de datos
        System.out.println("Ingresa cuantos alumnos presentarón el examen");
        CanAlum=Input.nextInt();
        double []Notas_Estudiantes=new double[CanAlum];//array que almacenara las notas
        //ingreso de Notas, lineas de codigo que establecen la entrada de las notas de 0 a 5
        do{
                check=false;
                System.out.println("ingresa la Nota de cada alumno");
                for(int a=0; a<Notas_Estudiantes.length;a++){
               double cont=Input.nextDouble();//se crea contador para asignar las notas entre (0 y 5)
                if(cont>=0&&cont<=5){
                    Notas_Estudiantes[a]=cont;
                    
                }else{
                    //si la nota ingresada no estra entre [0,5] el programa borrara los datos ya tomados y los pedira de nuevo
                    System.out.println("Ingresa un dato valido");
                    check=true;
                    break;
                }
                }
            }while(check);    
        //Instancia el objeto de la clase Notas_Programacion 
        Notas_ProgramacionII notas=new Notas_ProgramacionII(Notas_Estudiantes);
        // se llaman los metodos promedio y calcular
        notas.Set_CalculoG();
        //se llaman los getter y se muestran en pantalla
        System.out.println("Los resultados son: \n Promedio de notas: "+notas.Get_Promedio());
        System.out.println("Estudiantes sobre el promedio: "+notas.Get_Over_Prom());
        System.out.println("Estudiantes por debajo del promedio: "+notas.Get_Below_Prom());
    }
    
}
