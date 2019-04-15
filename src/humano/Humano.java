
package humano;
import java.util.Scanner;



 class Humano {
     public String nome;
     public int idade;
     public int altura;
     public String religiao;
     public String cursotecnico;
     public String coleguinhas;
     
     
     public void falar(){
         System.out.println("Olá, meu nome é "+nome+".");
         System.out.printf("Tenho %d anos\n ",idade);
         System.out.printf("Tenho %d cm de altura\n", altura);
         System.out.printf("Sou "+religiao+".\n");
         System.out.printf("Estou no 3º semestre do curso  "+cursotecnico+".\n");
         System.out.printf(""+coleguinhas+" são meus/minhas melhores coleguinhas.\n\n");

         
     }
     
    
    


    public static void main(String[] args) {
        
        Humano Edilene;
        Edilene = new Humano();
        Edilene.nome = "Edilene";
        Edilene.idade = 21;
        Edilene.altura = 156;
        Edilene.religiao = "Católica";
        Edilene.cursotecnico = "Técnico em Informática";
        Edilene.coleguinhas = "Augusto e Suzana do Vale";
        Edilene.falar();
        
        
        
         Humano Augusto;
        Augusto = new Humano();
        Augusto.nome = "Augusto";
        Augusto.idade = 27;
        Augusto.altura = 165;
        Augusto.religiao = "Adventista do Sétimo dia";
        Augusto.cursotecnico = "Técnico em Informática";
        Augusto.coleguinhas = "Edilene e Suzana do Vale";
        Augusto.falar();
        
        
        
        Humano Suzana;
        Suzana = new Humano();
        Suzana.nome = "Suzana";
        Suzana.idade = 32;
        Suzana.altura = 159;
        Suzana.religiao = "Adventista do Sétimo dia";
        Suzana.cursotecnico = "Técnico em Informática";
        Suzana.coleguinhas = "Edilene e Augusto";
        Suzana.falar();
        
        
        
         
        
        
    }
}
