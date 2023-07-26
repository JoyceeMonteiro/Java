import java.util.Scanner;
public class Sorteio {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   
   System.out.println("Digite seu nome: ");
    String nome = in.nextLine();
    
   int randomNum = (int)(Math.random() * 10);
   
   
    switch (randomNum) {
   
      case 0:
        System.out.println(" Parabéns "+nome+"!\nVocê ganhou o prêmio 1" +
        "\nFavor entrar em contato conosco para agendar a retirada.");
        break;
      case 1:
        System.out.println(" Parabéns "+nome+"! \nVocê ganhou o prêmio 2" +
        "\nFavor entrar em contato conosco para agendar a retirada.");
        break;
      case 2:
        System.out.println(" Parabéns "+nome+"! \nVocê ganhou o prêmio 3"+
        "\nFavor entrar em contato conosco para agendar a retirada.");
        break;
      case 3:
        System.out.println(" Parabéns "+nome+"!\nVocê ganhou o premio 4" +
        "\nFavor entrar em contato conosco para agendar a retirada.");
        break;
      case 4:
        System.out.println(" Parabéns "+nome+"!\nVocê ganhou o prêmio 5"+
        "\nFavor entrar em contato conosco para agendar a retirada.");
        break;
      case 5:
        System.out.println(" Parabéns "+nome+"! \nVocê ganhou o prêmio 6"+
        "\nFavor entrar em contato conosco para agendar a retirada.");
        break;
        case 6:
        System.out.println(" Parabéns "+nome+"! \nVocê ganhou o prêmio 7"+
        "\nFavor entrar em contato conosco para agendar a retirada.");
        break;
        case 7:
        System.out.println(" Parabéns " +nome+ "! \nVocê ganhou o prêmio 8"+
        "\nFavor entrar em contato conosco para agendar a retirada.");
        break;
        case 8:
        System.out.println(" Parabéns " +nome+ "! \nVocê ganhou o prêmio 9"+
        "\nFavor entrar em contato conosco para agendar a retirada.");
        break;
        case 9:
        System.out.println(" Parabéns "+nome+"\nVocê ganhou o prêmio 10"+
        "\nFavor entrar em contato conosco para agendar a retirada.");
        break;
    }
  }
}