import javax.swing.JOptionPane;

public class ImpostoJanelas
{
   public static void main(String[] args)
   {
      
      float renda;
      
      String resultado = "";
 
      
      renda = Float.parseFloat(JOptionPane.showInputDialog("Digite sua renda:"));
        if (renda <1903.99f) {
   
     resultado ="Você está isento de pagamento.";
               
    } else
    if (renda >= 1903.99f && renda <= 2826.65f) {

      resultado ="\nAlíquota de : 7,50% \nSua parcela será de: R$142,80";
   
     } else if (renda >=  2826.66f && renda <= 3751.05f) {
          resultado ="\nAlíquota de 15% \nSua parcela será de: R$354,80";
         
 
     } else if (renda >=  3751.06f && renda <= 4664.68f ) {
         resultado = "\nAlíquota de: 22,50% \nSua parcela será de: R$636,13";
         
     } else {
   
      resultado ="\nAlíquota de: 27,50% \nSua parcela será de: R$869,36";
    }
     
    JOptionPane.showMessageDialog(null," Imposto de Renda 2022: " + " \n\nDados:" + resultado);
    }
}