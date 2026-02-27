import java.util.Scanner;

public class Menu{
    // Declaraçoes globais
    public static Scanner input = new Scanner(System.in);
    public static Armazem armazem = new Armazem();
    public static Armazem[] galpoes = new Armazem[10];
    
    // Main
        public static void main(String[] args){
        System.out.println("Bem vindo ao ERP Estoque");
        System.out.println(java.util.Arrays.toString(galpoes));
    }
    
    // Funçōes
    public static void criarArmazem(){
    }
}
