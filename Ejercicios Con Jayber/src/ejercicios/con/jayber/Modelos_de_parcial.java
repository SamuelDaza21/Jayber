/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.con.jayber;

/**
 *
 * @author dazas
 */
public class Modelos_de_parcial {
     private final int[]dig_cc;
   private int mod1, mod2, mod3, mod4, mod5;
    public Modelos_de_parcial(int []dig_cc){
        this.dig_cc=dig_cc;
        set_CalcularMod();
    }
    private void set_CalcularMod(){
       for(int a=0; a<dig_cc.length;a++){
            switch (dig_cc[a]) {
                case 1:
                case 6:
                    mod1++;
                    break;
                case 2:
                case 7:
                    mod2++;
                    break;
                case 3:
                case 8:
                    mod3++;
                    break;
                case 4:
                case 9:
                    mod4++;
                    break;
                case 5:
                case 0:
                    mod5++;
                    break;
                default:
                    break;
            }
        }
       
    }
    public int get_totMod1(){
        return mod1;
    }
    public int get_totMod2(){
        return mod2;
    }
    public int get_totMod3(){
        return mod3;
    }
    public int get_totMod4(){
        return mod4;
    }
    public int get_totMod5(){
        return mod5;
    }
}
