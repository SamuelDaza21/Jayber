/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.con.jayber;

/**
 *
 * @author dazas
 */
public class Notas_ProgramacionII {
    private final double [] Notas_Estudiantes;
    private double Promedio,SumaNotas;
    private int Over_Prom,Below_Prom;
    private String promFin;
    //
    public Notas_ProgramacionII(double[]Notas_Estudiantes){
        this.Notas_Estudiantes=Notas_Estudiantes;//asigna los datos recibidos al array local
    }
    //se crean los metodos que calcularan el promedio y los numeros sobre y bajo el promedio
    private void Set_Promedio(){
        for(int a=0;a<Notas_Estudiantes.length;a++){
            SumaNotas+=Notas_Estudiantes[a];
        }
        Promedio=(SumaNotas/Notas_Estudiantes.length);
        promFin=String.format("%.2f", Promedio);//, con el comando(String.format("%.2f", Promedio))se limitan los decimales del double Promedio.
    }
    public void Set_CalculoG(){
        Set_Promedio();
        for(int a=0;a<Notas_Estudiantes.length;a++){
            if(Notas_Estudiantes[a]<Promedio){
                Below_Prom++;
            }else if(Notas_Estudiantes[a]>=Promedio){
                Over_Prom++;
            }
        }
    }
    //se crean los metodos retorno que enviaran los datos al main
    public String Get_Promedio(){
        return promFin;
    }
    public int Get_Over_Prom(){
        return Over_Prom;
    }
    public int Get_Below_Prom(){
        return Below_Prom;
    }
}
