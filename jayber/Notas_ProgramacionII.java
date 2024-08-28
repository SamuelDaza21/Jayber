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
    private double [] Notas_Estudiantes;
    private double Promedio,SumaNotas;
    private int Over_Prom,Below_Prom;
    public Notas_ProgramacionII(double[]Notas_Estudiantes){
        this.Notas_Estudiantes=Notas_Estudiantes;
        Set_Promedio();
        Set_CalculoG();
    }
    private void Set_Promedio(){
        for(int a=0;a<Notas_Estudiantes.length;a++){
            SumaNotas+=Notas_Estudiantes[a];
        }
        Promedio=(SumaNotas/Notas_Estudiantes.length);
    }
    public double Get_Promedio(){
        return Promedio;
    }
    private void Set_CalculoG(){
        for(int a=0;a<Notas_Estudiantes.length;a++){
            if(Notas_Estudiantes[a]<Promedio){
                Below_Prom++;
            }else if(Notas_Estudiantes[a]>=Promedio){
                Over_Prom++;
            }
        }
    }
    public int Get_Over_Prom(){
        return Over_Prom;
    }
    public int Get_Below_Prom(){
        return Below_Prom;
    }
}
