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

        String file = "dic";

        String extension = "txt";

        String[] fileString = processFile(file, extension);

        nameFile.close();

        insertionSort(fileString);

        printVet(fileString);

    }

    public static String[] processFile(String file, String extension) throws FileNotFoundException, IOException {

        File temp = File.createTempFile(file, extension);

        String[] fileString = new String[1000];

        int count = 0;

        if (temp.exists()) {

            Scanner leitor = new Scanner(new File("src/" + file + "." + extension));

            while (leitor.hasNextLine()) {

                String[] vet = leitor.nextLine().split(" ");

                for (int i = 0; i < vet.length; i++) {

                    if (!vet[i].equals(" ")) {

                        fileString[count] = vet[i];

                        count = count + 1;

                    }
                }
            }
        }

        return fileString;

    }

    public static void insertionSort(String[] words) {        
        
        for (int i = 1; i < words.length; i++) {

            int point = i;
            String value = words[point];

            int compare = 0;
            while (point > 0) {
                compare = value.toUpperCase().compareTo(words[point - 1].toUpperCase());

                if (compare >= 0) {
                    point--;
                }
                if (compare < 0) {
                    words[point] = words[point - 1];
                    point--;
                }
            }
            if (compare < 0) {
                words[point] = value;
            }

        }
    }

    public static void printVet(String[] word) {

        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }

    }
}
