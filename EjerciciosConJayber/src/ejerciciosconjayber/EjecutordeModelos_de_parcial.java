/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosconjayber;
import java.util.Scanner;
/**
 *
 * @author dazas
 */
public class  EjecutordeModelos_de_parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Input=new Scanner(System.in);
        int CanAlum,mod1,mod2,mod3,mod4,mod5;
        System.out.println("Ingresa cuantos alumnos presentaran el examen");
        CanAlum=Input.nextInt();
        int[]dig_cc=new int[CanAlum];
        System.out.println("ingresa el ultimo digito de la cedula de cada alumno");
        for(int a=0; a<dig_cc.length;a++){
            dig_cc[a]=Input.nextInt();
        }
        Modelos_de_parcial modelo=new Modelos_de_parcial(dig_cc);
        mod1=modelo.get_totMod1();
        mod2=modelo.get_totMod2();
        mod3=modelo.get_totMod3();
        mod4=modelo.get_totMod4();
        mod5=modelo.get_totMod5();
        System.out.println("los ultimos digitos de las cedulas de los alumnos son: ");
        for(int a=0;a<dig_cc.length;a++){
            System.out.println(dig_cc[a]+" ");
        }
        System.out.println("La cantidad de estudiantes que presentan cada modelo son:");
        System.out.println("Modelo #1\n"+mod1);
        System.out.println("Modelo #2\n"+mod2);
        System.out.println("Modelo #3\n"+mod3);
        System.out.println("Modelo #4\n"+mod4);
        System.out.println("Modelo #5\n"+mod5);
    }
    
}
