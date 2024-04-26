/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saloncopy;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class SalonCopy {

    
    public static void main(String[] args) {
        
        System.out.println("--------------");
        System.out.println("Welcome to Luna's light Salon");
        System.out.println("This is the official website of Luna's light Salon for beauty & care services ");
        System.out.println("--------------");
        System.out.println("Enter your full name:");
        String name;
        
        name = getName(); // (getName()) it's a method in the end of the class to get the name from the user
        System.out.println("Your mobile phone:");
        System.out.print("+966 ");
        int number;
        
        number = getInt(""); // The user will enter her number - (getInt("") it's a method to check if the user enterd numbers only
        System.out.println("--------------");
        System.out.println("Hello " + name);  
        
        //Services prices
        int bangs; 
        bangs = 30;
        
        int Short;
        Short = 60;
        
        int medium;
        medium = 80;
        
        int edge;
        edge = 20;
        
        int baha; //for bangs and haircut
        baha = 100;
        
        int plastic;
        plastic = 120;
        
        int acrlyic;
        acrlyic = 150;
        
        int polish;
        polish = 30;
        
        int bath;
        bath = 230;
        
        int lavenderA;
        lavenderA = 173;
        
        int jasmineA;
        jasmineA = 193;
        
        int lavenderH;
        lavenderH = 345;
        
        int jasmineH;
        jasmineH = 365;
        
        int pedicure;
        pedicure = 97;
        
        int manicure;
        manicure = 97;
        
        int mape;//for manicure & pedicure
        mape = 180;
        
        int full; // for full makeup
        full = 195;
        
        int light; // for light makeup
        light = 172;
        
        int eyes;
        eyes = 115;
        
        int total; // the total of the prices 
        total = 0;
        total = total + total; // Process to sum the prices for selected services
        
        int services;
        services = 0;

        while (services != 6) { // A loop that allows the user to choose services by numbers,it will repeat if the user input a wrong number and will be stopped if the 6 was entered
            System.out.println("This is our services menu:");
            System.out.println("--------------");
            System.out.println("1) Haircut");
            System.out.println("2) Nails");
            System.out.println("3) Moroccan bath & Massage");
            System.out.println("4) Spa");
            System.out.println("5) Makeup");
            System.out.println("6) Exit / print the receipt");
            System.out.println("--------------");
            System.out.println("Please choose a service number:");
            services = getInt("");
            if (services == 1) { // if the user chose the first service this statement will execute 
                int haircut;
                
                haircut = 0;
                while (haircut != 4) {//while loop to print the sub services and when the user input number 4 the services menu will show up agian so the user can choose another service
                    System.out.println("--------------");
                    System.out.println("1) Bangs (30 SR) "); 
                    System.out.println("2) Full haircut (The price depends on the required length cut) ");
                    System.out.println("3) Bangs & haircut (100 SR) ");
                    System.out.println("--------------");
                    System.out.println("4) Go back to the menu to choose another service or to print the receipt");
                    haircut = getInt("");
                    if (haircut == 1) { 
                        total = total + bangs; //It will add the value of the pre-defined total which is 0 with the price of this service and store it at the top variable "total" so at the end if we call it will give us the final total
                    }
                    if (haircut == 2) {
                        System.out.println("--------------");
                        System.out.println("What length do you want to cut?");
                        System.out.println("1) Short length cut (60 SR)");
                        System.out.println("2) Medium length cut (80 SR)");
                        System.out.println("3) Cut the edges (20 SR)");
                        System.out.println("--------------");
//                        System.out.println("Choose a service number \n If you want to back to the menu enter any numeber");
                        
                        int cut;
                        cut=getInt("");
                        
                        if(cut==1){
                            total = total + Short; 
                        }
                        if(cut==2) {
                            total = total + medium;
                        }if(cut==3){
                            total = total + edge;
                        }
//                        if(cut>3){
//                        System.err.println("This number is not in the options, please choose the right number");
//                        }
                        else{ //will back to the menu
                        }
                    }
                    if (haircut == 3) {
                        total = total + baha;
                    }
//                    if (haircut > 4) {
//                        System.err.println("This number is not in the options, please choose the right number");     
//                    }
//                   System.err.println("This number is not in the options, please choose the right number");
                }
            } else {
                if (services == 2) {// if the user chose the 2nd service this statement will execute 
                    int nails;
                    
                    nails = 0;
                    while (nails != 4) { //while loop to print the sub services and when the user input number 4 the services menu will show up agian so the user can choose another service
                        System.out.println("--------------");
                        System.out.println("1) Plastic nail extensions (120 SR) ");
                        System.out.println("2) Acrlyic nail extensions (150 SR) ");
                        System.out.println("3) Nail polish (30 SR) ");
                        System.out.println("4) Go back to the menu to choose another service or to print the receipt");
                        System.out.println("--------------");
                        
                        nails = getInt("");
                        if (nails == 1) {
                            total = total + plastic;
                        }
                        if (nails == 2) {
                            total = total + acrlyic;
                        }
                        if(nails == 3){
                            total = total + polish;
                        }
                        if (nails > 4) {
//                        System.err.println("This number is not in the options, please choose the right number");                       
                    }
//                    System.err.println("This number is not in the options");
                    }
                } else {
                    if (services == 3) {
                        int massage;
                        
                        massage = 0;
                        while (massage != 4) {
                            System.out.println("--------------");
                            System.out.println("1) Moroccan bath (230 SR) ");
                            System.out.println("2) Full body massage (60 min) (173 SR)");
                            System.out.println("3) Full body massage (120 min) (345 SR) ");
                            System.out.println("4) Go back to the menu to choose another service or to print the receipt");
                            System.out.println("--------------");
                            
                            massage = getInt("");
                            if (massage == 1) {
                                total = total + bath;
                            }
                            if (massage == 2) {
                                System.out.println("--------------");
                                System.out.println("We have 2 oils for massage \n Which oil do you prefer?");
                                System.out.println("--------------");
                                System.out.println("1) Lavender Oil ");
                                System.out.println("2) Jasmine Oil ");
                                System.out.println("*If you want to back to the menu enter any other number");
                                System.out.println("--------------");
                                
                                int oil;
                                oil = getInt("");
                                
                                if(oil == 1){
                                    total = total+ lavenderA;
                                }
                                if(oil == 2){
                                    total = total+ jasmineA;
                                }
                                
                                if (oil > 2) {
//                        System.err.println("This number is not in the options, please choose the right number");                     
                    }
                            }
                            if (massage == 3) {
                                System.out.println("--------------");
                                System.out.println("We have 2 oils for massage \n Which oil do you prefer?");
                                System.out.println("--------------");
                                System.out.println("1) Lavender Oil ");
                                System.out.println("2) Jasmine Oil ");
                                System.out.println("*If you want to back to the menu enter any other number");
                                System.out.println("--------------");
                                
                                int oil;
                                oil = getInt("");
                                
                                if(oil == 1){
                                    total = total+ lavenderH;
                                }
                                if(oil == 2){
                                    total = total+ jasmineH;
                                }
                                if (oil > 2) {
                        System.err.println("This number is not in the options, please choose the right number"); 
                    }
                                else{
                                }
                            }
                            if (massage > 4) {
//                        System.err.println("This number is not in the options, please choose the right number");
                    }
                        }
                    } else {
                        if (services == 4) {
                            int spa;
                            
                            spa = 0;
                            while (spa != 4) {
                                System.out.println("--------------");
                                System.out.println("1) Spa pedicure (97 SR) ");
                                System.out.println("2) Spa manicure (97 SR) ");
                                System.out.println("3) Manicure & Pedicure (180 SR) ");
                                System.out.println("4) Go back to the menu to choose another service or to print the receipt");
                                System.out.println("--------------");
                                spa = getInt("");
                                if (spa == 1) {
                                    total = total + pedicure;
                                }
                                if (spa == 2) {
                                    total = total + manicure;
                                }
                                if (spa == 3) {
                                    total = total + mape;
                                }
                                if (spa > 4) {
//                        System.err.println("This number is not in the options, please choose the right number");
                    }
                            }
                        } else {
                            if (services == 5) {
                                int makeup;
                                
                                makeup = 0;
                                while (makeup != 4) {
                                    System.out.println("--------------");
                                    System.out.println("1) Full makeup (195 SR) ");
                                    System.out.println("2) Light makeup (172 SR) ");
                                    System.out.println("3) Eyes makeup (115 SR) ");
                                    System.out.println("4) Go back to the menu to choose another service or to print the receipt");
                                    System.out.println("--------------");
                                    
                                    makeup = getInt("");
                                    if (makeup == 1) {
                                        total = total + full;
                                    }
                                    if (makeup == 2) {
                                        total = total + light;
                                    }
                                    if (makeup == 3){
                                        total = total + eyes;
                                    }
                                    if (makeup > 4) {
//                        System.err.println("This number is not in the options, please choose the right number");                        
                    }
                                }
                            } else {
                                if (services == 6) {
                                    System.out.println("--------------");  
                                    System.out.println("Your receipt: \n Name: " + name + "\n Mobile number: +966 " + number + "\n Total: " + total + " SR" ); // print the receipt
                                    System.out.println("--------------");
                                    System.out.println("Thank you for visiting us");
                                }
                                if (services > 6){
                                    System.err.println("This number is not in the options, please choose the right number");  
                                }
                            }
                        }
                    }
                }
            }
        }//End while
        System.exit (0); // Indicates successful termination
    }//End main class

    public static String getName(){//1st method to let the user enter the name
        Scanner input = new Scanner(System.in);
        String name;
        name = input.nextLine();
        return name; // return is used because we need to use the input value
    }//End this class
    
    public static int getInt(String number){ //2nd method to check if the user enterd numbers only
        Scanner input = new Scanner(System.in);
        System.out.print(number);
        while(!input.hasNextInt()){ //if the input was not an integer this loop will be repeted 
            input.next(); //input from the user
            System.out.println("Please enter numbers only:"); // will be printed if the input was wrong
        }
        return input.nextInt();
    }//End this class
}//End class




