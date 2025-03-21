package repositories;

import models.Localizacao;

import java.util.ArrayList;
import java.util.List;

public class LocalizacaoRepository {
    // Lista estática para armazenar todas as localizações em memória
    public static List<Localizacao> LOCALIZACOES = new ArrayList<>();
    // Contador para gerar IDs únicos para cada localização
    private static int ultimoId = 0;

    // Insere uma nova localização na lista
    public static void inserir(Localizacao localizacao) {
        ultimoId++; // Incrementa o contador de IDs
        localizacao.setId(ultimoId); // Define o ID único para a localização
        LOCALIZACOES.add(localizacao); // Adiciona a localização à lista
    }

    // Retorna todas as localizações cadastradas
    public static List<Localizacao> listarTudo() {
        return LOCALIZACOES; // Retorna a lista completa de localizações
    }

    // Busca uma localização pelo seu ID
    public static Localizacao buscarPorId(int id) {
        for (Localizacao loc : LOCALIZACOES) { // Itera sobre a lista de localizações
            if (loc.getId() == id) {
                return loc; // Retorna a localização encontrada
            }
        }
        return null; // Retorna null se nenhuma localização for encontrada
    }
}