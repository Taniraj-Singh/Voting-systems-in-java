package minipro;

import java.util.Scanner;  

public class vote {
    int hammad=0;
    int usama=0;
    int tushar=0;
    int huzaifa=0;
    int basit=0;
    
    void Display(){
        System.out.println("\n\n");
        System.out.println("                   Welcome to voting machine ");
        System.out.println("                    Pllease Cast your vote ");
        System.out.println("\n\n Following are the candidates \n");
        System.out.println(" 1) Hammad     2) Usama     3) Tushar     4) Huzaifa     5) Basit ");
        System.out.println("\n Choose only one of them ");
     
    }
    void castvote(int x){
        System.out.println("\n");
        if(x==1){
       
            System.out.println("you have given vote to Hammad");
            hammad++;
        }else if(x==2){
            
            System.out.println("you have given vote to Usama");
            usama++;
        }else if(x==3){
        
            System.out.println("you have given vote to Tushar");
            tushar++;
        }else if(x==4){
            
            System.out.println("you have given vote to Huzaifa");
            huzaifa++;
        }else if(x==5){
            
            System.out.println("you have given vote to Basit");
            basit++;
        }
    }
    void result(){
        System.out.println("candidates have got Following number of votes ");
        System.out.println("\nHammad : "+hammad);
        System.out.println("\nUsama : "+usama);
        System.out.println("\nTushar : "+tushar);
        System.out.println("\nHuzaifa : "+huzaifa);
        System.out.println("\nBasit :  "+basit);
    }
    void check1(){
        if(hammad==tushar){
            System.out.println(" Hammad and Tushar have same number of votes");
        }
        else if(hammad==usama){
            System.out.println(" Hammad and Usama have same number of votes");
        }
       else if(hammad==huzaifa){
            System.out.println(" Hammad and Huzaifa have same number of votes");
        }
       else if(hammad==basit){
            System.out.println(" Hammad and Basit have same number of votes");
        }
       
        if(tushar==usama){
            System.out.println(" Tushar and Usama have same number of votes");
        }
       else if(tushar==huzaifa){
            System.out.println(" Tushar and Huzaifa have same number of votes");
        }
       else if(tushar==basit){
            System.out.println(" Tushar and Basit have same number of votes");
        }
       
      if(usama==huzaifa){
            System.out.println(" Usama and Huzaifa have same number of votes");
        }
       else if(usama==basit){
            System.out.println(" Usama and Basit have same number of votes");
        }
        
         if(huzaifa==basit){
            System.out.println(" Huzaifa and Basit have same number of votes");
        }
       
    }
    void check2(){
        
        if(hammad>tushar&&hammad>usama&&hammad>huzaifa&&hammad>basit){
            System.out.println(" Hammad is Winner");
        }
        else if(tushar>hammad&&tushar>usama&&tushar>huzaifa&&tushar>basit){
            System.out.println(" Tushar is Winner");
        }
       else if(usama>tushar&&usama>hammad&&usama>huzaifa&&usama>basit){
            System.out.println(" Usama is Winner");
        }
       else if(huzaifa>hammad&&huzaifa>usama&&huzaifa>tushar&&huzaifa>basit){
            System.out.println(" Huzaifa is Winner");
        }
       else if(basit>tushar&&basit>usama&&basit>tushar&&basit>hammad){
            System.out.println(" Basit is Winner");
        }
    }
   
    public static void main(String[] args) {
       
        vote obj1 = new vote();
         int x;
        
        Scanner obj = new Scanner (System.in);
        do{
            
         obj1.Display();
         x=obj.nextInt();
   
        if(x==0){
            break;
        }
        obj1.castvote(x);
        
    } while(x==1||x==2||x==3||x==4||x==5);
        
        System.out.println("          -----------------------------------------");
        System.out.println("                          RESULTS");
         System.out.println("         -----------------------------------------");
        obj1.result();
        System.out.println("\n");
        obj1.check1();
        System.out.println("\n");
        obj1.check2();
         System.out.println("          -----------------------------------------");
        
    }
    
}
