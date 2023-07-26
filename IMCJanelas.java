import javax.swing.JOptionPane;

public class IMCJanelas
{
   public static void main(String[] args)
   {
      
      float peso, altura, imc;
      String nome, sexo;
      String resultado = "";
 
      nome = JOptionPane.showInputDialog("Cálculo do IMC\n"+ "Digite seu nome:");
      sexo = JOptionPane.showInputDialog("Digite seu sexo (M/F):");
      peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu Peso (kg):"));
      altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua Altura 1.7 (m):") );
     
 
      imc = (float) (peso/Math.pow(altura, 2));

 switch (sexo) {
    case "M":
      if (imc <20.7f) {
   
       resultado =": Abaixo do Peso";
               
    
    }else if (imc >=20.7f && imc < 26.4f){
   
 
        resultado ="com: Peso Normal";
   
    }else if (imc >=26.4 && imc < 27.8f){ 
        resultado =": Marginalmente acima do Peso.";
         
      
     }else if (imc >= 27.8f && imc < 31.1f ) 
        resultado =": Acima do Peso Ideal";
    
    else {
   
        resultado =": Obeso";
    }
 break;
 case "F":
    if (imc <19.1f) {
   
             resultado =":  Abaixo do Peso.";
               
    
    }else if (imc >=19.1 && imc <= 25.8f) {
   
            resultado ="com: Peso Normal.";
   
    }else if (imc >= 25.8 && imc <= 27.3f) {
            resultado =": Marginalmente acima do Peso.";
            
         
    }else if (imc >= 27.3f && imc <= 32.3f) {
            resultado =": Acima do Peso Ideal.";
 
    }else 
   
        resultado =": Obeso.";
    }
 
      
 JOptionPane.showMessageDialog(null, nome + ", seus resultados são:\n" +  "\n Seu IMC é = "+imc+"\n Você está "+ resultado);
   
      
}
}