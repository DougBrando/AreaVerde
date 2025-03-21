package repositories;

import models.AreaVerde;

import java.util.ArrayList;
import java.util.List;

public class AreaVerdeRepository {
    // Lista estática para armazenar todas as áreas verdes em memória
    public static List<AreaVerde> AREAS_VERDES = new ArrayList<>();
    // Contador para gerar IDs únicos para cada área verde
    private static int ultimoId = 0;

    // Insere uma nova área verde na lista
    public static void inserir(AreaVerde areaVerde) {
        ultimoId++; // Incrementa o contador de IDs
        areaVerde.setId(ultimoId); // Define o ID único para a área verde
        AREAS_VERDES.add(areaVerde); // Adiciona a área à lista
    }

    // Retorna todas as áreas verdes cadastradas
    public static List<AreaVerde> listarTudo() {
        return AREAS_VERDES; // Retorna a lista completa de áreas verdes
    }

    // Busca uma área verde pelo seu ID
    public static AreaVerde buscarPorId(int id) {
        for (AreaVerde av : AREAS_VERDES) { // Itera sobre a lista de áreas verdes
            if (av.getId() == id) {
                return av; // Retorna a área encontrada
            }
        }
        return null; // Retorna null se nenhuma área for encontrada
    }
}