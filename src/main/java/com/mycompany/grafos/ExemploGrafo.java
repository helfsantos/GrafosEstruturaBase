/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafos;

/**
 *
 * @author heloysa.fsantos
 */
public class ExemploGrafo {

    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Cleuza");
        grafo.adicionarVertice("Kleber");
        grafo.adicionarVertice("Claudio");

        grafo.adicionarAresta(2.0, "Paulo", "Lorenzo");
        grafo.adicionarAresta(3.0, "Lorenzo", "Kleber");
        grafo.adicionarAresta(1.0, "Kleber", "Cleuza");
        grafo.adicionarAresta(1.0, "Paulo", "Cleuza");
        grafo.adicionarAresta(1.0, "Claudio", "Lorenzo");
        grafo.adicionarAresta(1.0, "Claudio", "Paulo");

        grafo.BuscaEmLargura();
        
    }
}
