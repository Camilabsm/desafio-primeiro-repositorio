import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {
    public static void main(String[] args) throws Exception {
        // Cria lista
        List<Double> notas = new ArrayList<>(); 
        // Adiciona itens à lista - Shift+Alt+Seta para baixo p/ copiar linha
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        // Imprimir lista
        System.out.println(notas.toString());

        // Exibir a posição de um item na lista
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        // Adicionar um item na lista - sobrecarga do método add onde se tem o índice como parâmetro
        notas.add(4, 8d);
        System.out.println(notas.toString());
      
        // Substituir um item na lista
        notas.set(3, 6.0); /* Caso já saiba o índice */
        // notas.set(notas.indexOf(5d), 6.0); - caso não saiba o índice, apenas o elemento 
        System.out.println(notas);
        
        // Conferir se um item está na lista
        System.out.println("A nota 5.0 está na lista? " + notas.contains(5d));

        // Exibir os itens conforme foram adicionadas - como se está usando list, só imprimir já basta
        // for (Double nota : notas) System.out.println(nota);

        // Exibir o terceiro item adicionada
        System.out.println("Exiba a 3a nota adicionada: " + notas.get(2));
        
        // Exibir o menor item da lista (numérico) - tem que importar o Collections
        System.out.println("Exiba o menor item da lista: " + Collections.min(notas));
        
        // Exibir o maior item da lista (numérico) - tem que importar o Collections
        System.out.println("Exiba o maior item da lista: " + Collections.max(notas));

        // Exibir a soma dos itens da lista (numérico) - precisa importar o Iterator
        Iterator<Double> iterator = notas.iterator(); /* método de iteração dentro da lista */
        Double soma = 0d;
        while (iterator.hasNext()){ /* enquanto a lista tiver um "próximo item", o laço executa - retorna um booleano */
            Double next = iterator.next(); 
            soma += next;
        }
        
        System.out.println("Exiba a soma dos itens da lista: " + soma);

        // Exbir a média dos valores da lista
        System.out.println("Exiba a média item da lista: " + (soma/notas.size()));

        // Remover um item da lista
        notas.remove(0d); /* se a lista é de double, colocar só 0 vai indicar que quer tirar o item de ÍNDICE 0, então precisa do d */

        // Remover o item de posição x da lista
        notas.remove(0);
        
        // Remover valores menores que X da lista
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        } 

        System.out.println(notas);

        // Apagar a lista
        notas.clear();
        System.out.println(notas);

        // Conferir se a lista está vazia
        System.out.println(notas.isEmpty());

    }
}
