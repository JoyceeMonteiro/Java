import java.util.Scanner;
public class Compra {
  public static void main(String[] args) {
      Scanner ent = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
  
  
 
   System.out.println("Digite Código de identificação:");
           
           int codigo = in.nextInt();
            System.out.println("Digite o valor total da compra: ");
            float valor = ent.nextFloat();
            
  float funcionario = valor - (valor * 0.20f) ;
  float vip = valor -(valor * 0.10f);
            
   switch (codigo) {
    case 1:
    System.out.println("O valor a pagar será de: R$  " + valor);
    break;
  case 2:
   System.out.println("Por ser nosso funcionário,ganhou 20% de desconto."+ " \nSua compra sairá por apenas: R$ "  + funcionario);
     break;
     case 3:
    System.out.println("Por ser nosso Cliente Vip,ganhou 10% de desconto."+ " \nSua compra sairá por apenas: R$ "  + funcionario);
     
  }
}
}
