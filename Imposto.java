import java.util.Scanner;
  public class Imposto {
  public static void main(String[] args) {  
            
      Scanner ent = new Scanner(System.in);
      
    
     
System.out.println("Vamos calcular os dados do seu Imposto de Renda");
System.out.println("Digite o total de sua renda");
            float renda = ent.nextFloat();
           
    if (renda <1903.99f) {
   
      System.out.println("Você está isento de pagamento.");
               
    } else
    if (renda >= 1903.99f && renda <= 2826.65f) {

      System.out.println("\nDados do seu IMPOSTO DE RENDA 2022." +
      "\nAlíquota de : 7,50% \nSua parcela será de: R$142,80");
   
     } else if (renda >=  2826.66f && renda <= 3751.05f) {
          System.out.println("\nDados do seu IMPOSTO DE RENDA 2022." +
      "\nAlíquota de 15% \nSua parcela será de: R$354,80");
         
 
     } else if (renda >=  3751.06f && renda <= 4664.68f ) {
         System.out.println("\nDados do seu IMPOSTO DE RENDA 2022." +
      "\nAlíquota de: 22,50% \nSua parcela será de: R$636,13");
         
     } else {
   
      System.out.println("\nDados do seu IMPOSTO DE RENDA 2022." +
      "\nAlíquota de: 27,50% \nSua parcela a deduzir será de: R$869,36");
    }
  }
}



