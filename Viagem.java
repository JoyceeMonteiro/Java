import java.util.Scanner;
  public class Viagem {
  public static void main(String[] args) {  
            
      Scanner ent = new Scanner(System.in);
      Scanner in = new Scanner(System.in);
      
    System.out.println("       Olá,bem vindo! \nVamos calcular as despesas da sua viagem...");
    System.out.println("Quantos km você irá percorrer?");
            float km = ent.nextFloat();
    System.out.println("Qual valor atual do litro da gasolina?");
            float gasolina = ent.nextFloat();
    System.out.println("Quantos km seu carro percorre por litro de gasolina?");
            float consumo = ent.nextFloat();
      
            float despesas = (km / consumo ) * gasolina;
            
   System.out.println(String.format( "\n" + "       Dados da sua viagem: \n" + "Seu veículo consome: " + consumo + 
   "km por litro" + " \nSua viagem é de: " + km +
   "km" + "\nValor do litro de gasolina: R$%.2f", gasolina ));
   System.out.println(String.format( "Sua despesa nesta viagem será de: R$%.2f",  despesas));
   
   
   }
   }
