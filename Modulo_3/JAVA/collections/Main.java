/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author wesan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Em Java, as coleções são estruturas de dados que permitem armazenar e manipular grupos de elementos de maneira eficiente. Existem várias interfaces e classes de coleções fornecidas pelo framework de coleções (java.util), cada uma adequada para diferentes necessidades de armazenamento, acesso e manipulação de dados. Abaixo estão alguns exemplos das principais interfaces e classes de coleções em Java: */

        //1 - List: Uma coleção ordenada que permite elementos duplicados. Exemplos de implementações: ArrayList, LinkedList.
        List<String> frutas = new ArrayList<>();
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Morango");

        //exemplo de uso
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        //2 - Set: Uma coleção que não permite elementos duplicados. Exemplos de implementações: HashSet, TreeSet.
        Set<String> cores = new HashSet<>();
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul"); //elemento duplicado, sera ignorado

        //exemplo de uso
        for(String cor : cores) {
            System.out.println(cor);
        }

        //3 - Map: Uma coleção que associa chaves únicas a valores. Exemplos de implementações: HashMap, TreeMap.
        Map<String, Integer> idade = new HashMap<>();
        idade.put("João", 18);
        idade.put("Maria", 19);
        idade.put("Pedro", 20);

        System.out.println(idade.get("João"));

        //Iterando sobre as entradas do mapa
        for(Map.Entry<String, Integer> entry : idade.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos.");
        }

        /*Considerações
            ArrayList vs LinkedList: ArrayList é mais rápido para acesso aleatório, enquanto LinkedList é mais eficiente para inserção e remoção no meio da lista.

            HashSet vs TreeSet: HashSet oferece melhor desempenho para operações básicas, enquanto TreeSet mantém os elementos ordenados de acordo com a ordenação natural ou definida por um comparador.

            HashMap vs TreeMap: HashMap é mais eficiente para operações básicas de inserção, remoção e acesso, enquanto TreeMap mantém os elementos ordenados pela chave.

        Esses são exemplos básicos de como usar algumas das principais coleções em Java. A escolha da coleção adequada depende dos requisitos específicos do seu programa em termos de desempenho, ordem dos elementos, e se permite ou não duplicatas. */
    }

}
