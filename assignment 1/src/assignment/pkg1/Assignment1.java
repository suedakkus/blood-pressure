/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg1;
import java.util.Scanner;
/**
 *
 * @author RUKIYE
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
        System.out.print("Please enter your age:");
        int age=scn.nextInt();
        if(age<1 || age>150){
            System.out.println("Incorrect entry made.");
            return;
        }
        System.out.print("Please enter your sex (0: Female, 1: Male):");
        int sex=scn.nextInt();
        if(sex!=0 && sex!=1){
            System.out.println("Incorrect entry made.");
            return;
        }
        System.out.print("Please enter your blood pressure:");
        double bloodPressure=scn.nextDouble();
       
        if(age>45 && age<150){//Old
            if(sex==1){// Old Male
                if(bloodPressure<11){
                    System.out.println("This bp is too low for an old man.");
                }
                else if(bloodPressure>15){
                    System.out.println("This bp is too high for an old man.");
                }
                else{
                    System.out.println("This bp is normal for an old man.");
                }
            }
            else if(sex==0){// Old Female
                if(bloodPressure<10){
                    System.out.println("This bp is too low for an old woman.");
                }
                else if(bloodPressure>13){
                    System.out.println("This bp is too high for an old woman.");
                }
                else{
                    System.out.println("This bp is normal for an old woman.");
                } 
            }
            else{
                System.out.println("Incorrect entry made.");
                return;
            }
        }
        else if(age<45 && age>0){//Young
            if(sex==1){// Young Male
                if(bloodPressure<10){
                    System.out.println("This bp is too low for a young man.");
                }
                else if(bloodPressure>14){
                    System.out.println("This bp is too high for a young man.");
                }
                else{
                    System.out.println("This bp is normal for a young man.");
                }
            }
            else if(sex==0){ // Young Female
                if(bloodPressure<9){
                    System.out.println("This bp is too low for a young woman.");
                }
                else if(bloodPressure>12){
                    System.out.println("This bp is too high for a young woman.");
                }
                else{
                    System.out.println("This bp is normal for a young woman.");
                } 
            }
            else{
                System.out.println("Incorrect entry made.");
                return;
            }
            
        }
        else{
            System.out.println("Incorrect entry made.");
            return;
        }

    }
    
}
