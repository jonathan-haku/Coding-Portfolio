
import java.io.*;
import java.util.*;
public class TicTacToe {
    public static String[][]tic = new String[3][3];
    public static int Turns = 0;
public static String decidewinner(String[][]tic) {
//HORIZONTAL
    if(tic[0][0].equals(tic[0][1]) && tic[0][1].equals(tic[0][2]) && tic[0][0].equals("*")==false)
        return "("+tic[0][1]+")"+" WINS!";
    if(tic[1][0].equals(tic[1][1]) && tic[1][1].equals(tic[1][2]) && tic[1][0].equals("*")==false)
        return "("+tic[1][1]+")"+" WINS!";
    if(tic[2][0].equals(tic[2][1]) && tic[2][1].equals(tic[2][2]) && tic[2][0].equals("*")==false)
        return "("+tic[2][1]+")"+" WINS!";
//VERTICAL
    if(tic[0][0].equals(tic[1][0]) && tic[1][0].equals(tic[2][0]) && tic[0][0].equals("*")==false)
        return "("+tic[0][0]+")"+" WINS!";
    if(tic[0][1].equals(tic[1][1]) && tic[1][1].equals(tic[2][1]) && tic[0][1].equals("*")==false)
        return "("+tic[1][0]+")"+" WINS!";
    if(tic[0][2].equals(tic[1][2]) && tic[1][2].equals(tic[2][2]) && tic[0][2].equals("*")==false)
        return "("+tic[2][0]+")"+" WINS!";
//DIAGONAL
    if(tic[0][0].equals(tic[1][1]) && tic[1][1].equals(tic[2][2]) && tic[0][0].equals("*")==false)
        return "("+tic[0][0]+")"+" WINS!";
    if(tic[2][0].equals(tic[1][1]) && tic[1][1].equals(tic[0][2]) && tic[2][0].equals("*")==false)
        return "("+tic[2][0]+")"+" WINS!";
    else
        return "DRAW";
}
public static void newcoord() {
    System.out.println("Please enter a new coordinate");
}
public static boolean ifcontain (String[][]tic, int x, int y) {
    if(tic[x][y].equals("*")==false)
        return true;
    else
        return false;
}
public static void printInt (int[][]tic){
    for(int r=0; r!=tic.length; r++) {
        for(int c=0; c!=tic[r].length; c++) {
           System.out.print(" "+tic[r][c] + "");
           }
          System.out.println("");
    }
}
public static void printString (String[][]tic){
    for(int r=0; r!=tic.length; r++) {
        for(int c=0; c!=tic[r].length; c++) {
           System.out.print(" "+tic[r][c] + "");
           }
          System.out.println("");
    }
}
public static String[][] input (String xoro,String[][]tic){
    Scanner input = new Scanner(System.in);
    String[][]toc = tic;
    System.out.println("("+xoro+")"+" Input coordinates:");
    int x = input.nextInt();
    int y = input.nextInt();
        if(ifcontain(tic,x,y)==false) {
            tic[x][y]=xoro;
            return tic;
        }
        else {
            Turns--;
            newcoord();
            return toc;
        }
}
public static void fillet(String[][] tic) {
    for(int row = 0; row!=tic.length; row++) {
        for(int col = 0; col!=tic[row].length; col++) {
            tic[row][col]="*";
        }
    }
}
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            fillet(tic);
            printString(tic);
            while(Turns!=9) {
                
                if(Turns%2==0) {
                    System.out.println("Number of turns: " + Turns);
                    input("X",tic);
                    Turns++;
                    if(decidewinner(tic).contains("WINS")) {
                        printString(tic);
                        System.out.println(decidewinner(tic));
                        break;
                    }
                    printString(tic);
                }
                if(Turns%2!=0) {
                    System.out.println("Number of turns: " + Turns);
                    input("O",tic);
                    Turns++;
                    if(decidewinner(tic).contains("WINS")) {
                        printString(tic);
                        System.out.println(decidewinner(tic));
                        break;
                    }
                    printString(tic);
                }
                
            }
            
    }
}
