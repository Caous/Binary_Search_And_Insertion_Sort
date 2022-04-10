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
//        <summary>
//            Necessário passar o nome do arquivo com a extensão colocamos
//            o diretório no src/ porque não identificava nessa versão do netbeans o arquivo
//        </summary>
        String file = "dic";
        
        String extension = "txt";
        
        String[] fileString = processFile(file, extension);
        
        printVet(fileString);
        
    }
    
    public static String[] processFile(String file, String extension) throws FileNotFoundException, IOException {
        
        File temp = File.createTempFile(file, extension);
        
        String[] fileString = new String[1000];
        
        int count = 0;
        
        if (temp.exists()) {
            
            Scanner leitor = new Scanner(new File("src/" + file + "." + extension));
            
            while (leitor.hasNextLine()) {
                
                String[] vet = leitor.nextLine().replaceAll("\\p{Punct}", "").split(" ");
                
                for (int i = 0; i < vet.length; i++) {
                    if (!vet[i].equals(" ") && !vet[i].equals("")) {
                        if (!searchBinary(vet[i], fileString)) {
                            
//                            Método antigo substituindo o insertLast e colocando no insertionSort
//                            insertLastPosition(vet[i], fileString);
  
                              insertionSort(fileString,vet[i]);
                        }
                    }
                }
            }
        }
        
        return fileString;
        
    }
    
    public static void insertionSort(String[] words,String word) {
        
        if (words[0] == null) {
            words[0] = word;
            return;
        }
        
        for (int i = 1; i < words.length; i++) {
            if (words[i] != null) {
                
                int point = i;
                String value = words[point];
                
                while (point > 0 && value.toUpperCase().compareTo(words[point - 1].toUpperCase()) < 0) {
                    words[point] = words[point - 1];
                    point--;
                }
                
                words[point] = value;
                
            }else if(words[i] == null && !word.equals("")){
                words[i] =word;
                word = "";
            }
        }
    }
    
    public static boolean searchBinary(String value, String[] fileString) {
        
        if (fileString[0] != null) {
            for (int i = 0; i < fileString.length; i++) {
                if (fileString[i] != null && fileString[i].toUpperCase().equals(value.toUpperCase())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void insertLastPosition(String word, String[] words) {
        
        if (words[0] == null) {
            words[0] = word;
        } else {
            for (int i = 0; i < words.length; i++) {
                if (words[i] == null) {
                    words[i] = word;
                    break;
                }
            }
        }
        
    }
    
    public static void printVet(String[] word) {
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] != null) {
                System.out.println(word[i].toLowerCase());
                count = count + 1;
            }
        }
        System.out.println("Total de palavras diferentes no dicionario =" + count);
    }
}
