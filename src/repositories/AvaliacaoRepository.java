package repositories;

import models.Avaliacao;

import java.util.ArrayList;
import java.util.List;

public class AvaliacaoRepository {
    // Lista estática para armazenar todas as avaliações em memória
    public static List<Avaliacao> AVALIACOES = new ArrayList<>();
    // Contador para gerar IDs únicos para cada avaliação
    private static int ultimoId = 0;

    // Insere uma nova avaliação na lista
    public static void inserir(Avaliacao avaliacao) {
        ultimoId++; // Incrementa o contador de IDs
        avaliacao.setId(ultimoId); // Define o ID único para a avaliação
        AVALIACOES.add(avaliacao); // Adiciona a avaliação à lista
    }

    // Retorna todas as avaliações cadastradas
    public static List<Avaliacao> listarTudo() {
        return AVALIACOES; // Retorna a lista completa de avaliações
    }

    // Busca uma avaliação pelo seu ID
    public static Avaliacao buscarPorId(int id) {
        for (Avaliacao av : AVALIACOES) { // Itera sobre a lista de avaliações
            if (av.getId() == id) {
                return av; // Retorna a avaliação encontrada
            }
        }
        return null; // Retorna null se nenhuma avaliação for encontrada
    }
}