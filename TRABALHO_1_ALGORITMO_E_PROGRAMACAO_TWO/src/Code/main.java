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

        Scanner nameFile = new Scanner(System.in);

        System.out.print("Nome do arquivo: ");

        String file = nameFile.nextLine();

        System.out.print("Extensão do arquivp: ");

        String extension = nameFile.nextLine();

        String[] fileString = processFile(file, extension);

        nameFile.close();

        String[] words = insertionSort(fileString);

    }

    public static String[] processFile(String file, String extension) throws FileNotFoundException, IOException {

        File temp = File.createTempFile(file, extension);
        String[] fileString = new String[1000];
        
        if (temp.exists()) {
            Scanner leitor = new Scanner(new File("src/" + file));

            while (leitor.hasNextLine()) {
                fileString = leitor.nextLine().split(" ");
            }
        }

        return fileString;

    }
    
    public static String[] insertionSort(String[] words ){
    
        String[] word = new String[1000];
        
        word[0] = words[0];
        
        for (int i = 1; i < words.length; i++) {
            
            int compare = word[0].compareTo(words[i]);
            
            switch(compare){
            
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    
        return word;
    }
}
