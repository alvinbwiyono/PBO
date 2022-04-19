/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.materi;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        boolean run=true;
        String nama[]=new String[5];
        int skor[]=new int[5];
        for(int i=0;i<5;i++){
            skor[i]=0;
        }
        int player[]=new int[1];
        player[0]=0;
        do{
            System.out.println("===HANGMAN===");
            System.out.println("1. Play");
            System.out.println("2. Highscore");
            System.out.println("0. Exit");
            System.out.println(">>>");
            int inp=scan.nextInt();
            scan.nextLine();
            if(inp==1){
                play(nama,skor,player);
            }else if(inp==2){
                highscore(nama,skor,player);
            }else if(inp==0){
                run=false;
            }
        }while(run);
    }
    static void play(String nama[],int skor[],int player[]){
        Scanner scan = new Scanner(System.in);
        String[] dict1 = {
        "wifi",
        "java",
        "water",
        "glass",
        "chair",
        "bicycle",
        "train",
        "kitchen",
        "bread",
        "bird"
        };
        String[] dict2 = {
        "network",
        "webcam",
        "client",
        "library",
        "integer",
        "terminal",
        "server",
        "scanner",
        "phyton",
        "webpage"
        };
        String[] dict3 = {
        "keyboard",
        "breadcrumb",
        "database",
        "algorithm",
        "framework",
        "procedure",
        "function",
        "directory",
        "virtualization",
        "compiler"
        };
        System.out.println("Input name");
        String name=scan.nextLine();
        System.out.println("CHOOSE DIFFICULITY");
        System.out.println("1. ez");
        System.out.println("2. Normal");
        System.out.println("3. HANG ME");
        int inp=scan.nextInt();
        scan.nextLine();
        if(inp==1){
            int bolong=2;
           game(nama,skor,player,dict1,name,bolong); 
        }else if(inp==2){
            int bolong=4;
            game(nama,skor,player,dict2,name,bolong);
        }else if(inp==3){
            int bolong=6;
            game(nama,skor,player,dict3,name,bolong);
        }
    }
    static void game(String nama[],int skor[],int player[],String dic[],String name,int bolong){
        boolean run=true;
        Scanner scan = new Scanner(System.in);
        int word=1;
        int live=10;
        String tebakan=dic[(int)(Math.random()*dic.length)];
        String jawab=tebakan;
        tebakan="";
        int score=0;
        int jml=0;
        for(int i=0;i<jawab.length();i++){
            int a=(int)(Math.random()*jawab.length());
            if(i==a && jml<=bolong){
                tebakan+="_";
                jml++;
            }else{
                tebakan+=jawab.charAt(i);
            }
        }
        do{
            boolean ket=false;
            System.out.println("Word "+word);
            System.out.println("Score = "+score);
            System.out.println("Life = "+live);
            System.out.println(tebakan);
            System.out.println("Guess : ");
            String inp=scan.nextLine();
            String temp="";
            for(int i=0;i<jawab.length();i++){
                if(inp.charAt(0)==(jawab.charAt(i))&&(tebakan.charAt(i)=='_')){
                    temp+=inp;
                   ket=true;
                }else{
                    temp+=tebakan.charAt(i);
                }
            }
            
            if(ket==false){
                System.out.println("Wrong guess");
            }else{
                System.out.println("Correct guess");
                tebakan=temp;
            }
            if(tebakan.equals(jawab)){
                score+=100;
                live=10;
                System.out.println("You Win");
                word++;
                tebakan=dic[(int)(Math.random()*(dic.length))];
                jawab=tebakan;
                tebakan="";
                jml=0;
                 for(int i=0;i<jawab.length();i++){
                    int a=(int)(Math.random()*jawab.length());
                     if(i==a && jml<=bolong){
                        tebakan+="_";
                        jml++;
                    }else{
                        tebakan+=jawab.charAt(i);
                    }
                }
            }else{
                live--;
            }
            if(live==0){
                run=false;
            }
        }while(run);
        boolean high=false;
        int idx=0;
        for(int i=0;i<5;i++){
            if(skor[i]<=score){
                high=true;
                idx=i;
                i=5;
                if(player[0]<5){
                    player[0]++;
                }
            }
        }
        if(high==true){
            for(int i=player[0];i>idx;i--){
                nama[i]=nama[i-1];
            }
            nama[idx]=name;
            skor[idx]=score;
        }
    }
    static void highscore(String nama[],int skor[],int player[]){
        System.out.println("===Highscore===");
        for (int i = 0; i < player[0]; i++) {
             System.out.println((i+1)+". "+nama[i]+" - "+skor[i]);
        }
    }
}
