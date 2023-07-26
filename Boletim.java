  import java.util.Scanner;
  
  public class Boletim {
  public static void main(String[] args) {  
      
        Scanner ent = new Scanner(System.in);
         Scanner in = new Scanner(System.in);
        
  
    String disciplina;
    float media;
   
    System.out.println("Digite o nome do aluno: ");
    
    String nome = in.nextLine();
    
             
           
            System.out.println("Digite o nome da disciplina: ");
           
            disciplina = ent.next();

            // recebe a 1º nota
           System.out.println("Digite a 1ª nota do aluno " + nome + ": ");
           float n1 = ent.nextFloat();
            
             System.out.println("Digite a 2ª nota do aluno " + nome + ": ");
             float n2 = ent.nextFloat();
            
              media = (n1 + n2 ) / 2;
            System.out.println(String.format( "RESULTADO: " + 
            "\nNome do Aluno:" + nome + 
            "\nDisciplina: "+ disciplina +"\nMédia: %.1f", media));
      
    
  if (media ==0 && media < 4.0f) {
   
      System.out.println("Conceito E" + "\nVocê está REPROVADO");
               
    } else
    if (media >=4.0f && media <6.0f) {
   
 
      System.out.println("Conceito D"+  "\nVocê está REPROVADO");
   
     } else if (media >=6.0f && media <7.5f) {
          System.out.println("Conceito C"+  "\nVocê está REPROVADO");
         
 
     } else if (media >=7.5f && media <9.0f ) {
         System.out.println("Conceito B"+  "\nParabéns " +nome+ "!" + " Você está APROVADO.");
         
     } else {
   
      System.out.println("Conceito A" +  "\nParabéns " +nome+ "!" + " Você está APROVADO.");
    }
  }
}