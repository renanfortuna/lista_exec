import java.util.Scanner;
import javax.swing.JOptionPane;
public class teste_surpresa{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        Integer idade;
        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();

        System.out.println();

        if (idade <= 2){
        JOptionPane.showMessageDialog(null, "Você é um Bebê");
        }else if ((idade > 2) && (idade <=11)){
        JOptionPane.showMessageDialog(null, "Você é uma Criança");
        }else if ((idade >11) && (idade <= 19)){
        JOptionPane.showMessageDialog(null, "Você é Adolescente");
        }else if ((idade >19) && (idade <=30)){
        JOptionPane.showMessageDialog(null, "Você é Jovem");
        }else if ((idade >30) && (idade <= 60)){
        JOptionPane.showMessageDialog(null, "Você é Adulto");
        }else if (idade >60)
        JOptionPane.showMessageDialog (null, "Você é Idoso");
        

    }
}