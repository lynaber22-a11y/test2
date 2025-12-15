/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compiletest2;

import java.util.Scanner;

/**
 *
 * @author GSI Bdjaoui
 */
public class Compiletest2 {

    
    public static int col(char c){
     if(c=='(')return 0;
     else if (c=='{') return 1;
      else if (c=='}') return 2;
      else if (c=='v') return 3;
     else if (c=='t') return 4;
      else if (c==')') return 5;
      else if (c=='m') return 6;
      else return 7;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String mot;
        int[][]M={
        {0,0,-1,-1,-1,-1,1,-1},
        {-1,-1,1,2,2,-1,-1,-1},
        {-1,-1,2,-1,-1,2,-1,-1} 
    };
        while(true){
            System.out.print("entrer une chaine ");
            mot = sc.nextLine()+'#';
                    
        int Ec=0;
        int i=0;
        int j=0;
        while(mot.charAt(i)!='#'&& M[Ec][col(mot.charAt(i))]!=-1 ){
            Ec=M[Ec][ col(mot.charAt(i))];
            if(mot.charAt(i)==')'){
            j++;
            }
            i++;
        }
        if(mot.charAt(i)=='#'&& (Ec==1||Ec==2)&& j<=20){
            System.out.print(" chaine accepter \n");
        }else{
        System.out.print(" chaine rejeteee ");
        }
                
    }}
    
}
