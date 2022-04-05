package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Entrega do Trabalho 1- Algoritmos e Programação II Nós, Felipe Santana Silva
 * Gustavo Santos Nascimento
 *
 * declaramos que todas as respostas são fruto de nosso próprio trabalho, não
 * copiamos respostas de colegas externos à equipe, não disponibilizamos nossas
 * respostas para colegas externos ao grupo e não realizamos quaisquer outras
 * atividades desonestas para nos beneficiar ou prejudicar outros.
 */
public class main {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome do arquivo: ");
        String arquivo = teclado.nextLine();
        EntradarArquivo(arquivo);
        teclado.close();

    }

    public static void EntradarArquivo(String arquivo) throws FileNotFoundException, IOException {

        Scanner leitor = new Scanner(new File("src/" + arquivo));
        
        String linha;        
        while (leitor.hasNextLine()) {
            linha = leitor.nextLine();
        }
    }
}
