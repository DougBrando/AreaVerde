package main;

import models.AreaVerde;
import models.Avaliacao;
import models.Localizacao;
import repositories.AreaVerdeRepository;
import repositories.AvaliacaoRepository;
import repositories.LocalizacaoRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Scanner para entrada de dados do usuário
        int opcao = 0;

        // Loop principal do programa, exibe o menu até o usuário escolher sair
        do {
            // Menu interativo com opções do sistema
            System.out.printf("""
                    Bem vindo ao AREA VERDE
                    
                    Digite a opção que gostaria de acessar:
                    1- Listar Areas Verdes
                    2 - Avaliar Area Verde
                    3 - Ver detalhe de uma Area Verde
                    4 - Cadastrar uma nova Area verde
                    0 - Sair
                    
                    Opção: 
                    """);
            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer após nextInt() para evitar problemas com nextLine()

            // Switch para direcionar a ação com base na opção escolhida
            switch (opcao) {
                case 1 -> listarAreas(); // Lista todas as áreas verdes
                case 2 -> avaliarArea(entrada); // Avalia uma área existente
                case 3 -> verDetalhesArea(entrada); // Mostra detalhes de uma área
                case 4 -> cadastraAreaVerde(entrada); // Cadastra uma nova área
                case 0 -> System.out.println("Encerrando a sessão..."); // Encerra o programa
                default -> System.out.println("Selecione uma opção válida."); // Trata opções inválidas
            }
        } while (opcao != 0); // Continua até o usuário digitar 0
        entrada.close(); // Fecha o Scanner ao final (boa prática)
    }

    // Lista todas as áreas verdes cadastradas
    private static void listarAreas() {
        List<AreaVerde> areas = AreaVerdeRepository.listarTudo(); // Obtém a lista do repositório
        if (areas.isEmpty()) {
            System.out.println("Lista vazia"); // Mensagem caso não haja áreas cadastradas
        } else {
            System.out.println("\nLista de Areas Verdes"); // Cabeçalho da listagem
            for (AreaVerde area : areas) {
                System.out.println(area.toString()); // Exibe detalhes de cada área
            }
        }
    }

    // Avalia uma área verde com notas de 1 a 5 em cinco critérios
    private static void avaliarArea(Scanner entrada) {
        System.out.println("Digite o id da area que deseja avaliar: ");
        int id = entrada.nextInt(); // ID da área a ser avaliada

        AreaVerde area = AreaVerdeRepository.buscarPorId(id); // Busca a área no repositório
        if (area == null) {
            System.out.println("Area Verde não encontrada!");
            return; // Sai do método se a área não existir
        }

        // Exibe o nome da área e solicita notas
        System.out.printf("Avaliando: %s, notas de 1 a 5 %n", area.getNome());
        System.out.print("Quantidade de arvores: ");
        int quantidadeArvores = entrada.nextInt();
        System.out.print("Qualidade do Ar: ");
        int qualidadeAr = entrada.nextInt();
        System.out.print("Ausencia de Poluição Sonora: ");
        int ausenciaPolucao = entrada.nextInt();
        System.out.print("Coleta de Residuos: ");
        int coletaResiduos = entrada.nextInt();
        System.out.print("Facilidade de Transporte Publico: ");
        int facilidadeTraspPublico = entrada.nextInt();
        entrada.nextLine(); // Limpa o buffer para evitar problemas com entradas futuras

        // Cria uma nova avaliação com ID automático (0) e associa ao ID da área
        Avaliacao avaliacao = new Avaliacao(0, quantidadeArvores, qualidadeAr, ausenciaPolucao,
                coletaResiduos, facilidadeTraspPublico, id);
        AvaliacaoRepository.inserir(avaliacao); // Salva no repositório de avaliações
        area.getAvaliacoes().add(avaliacao); // Adiciona à lista de avaliações da área
        System.out.println("Avaliação realizada com sucesso!!");
    }

    // Exibe detalhes de uma área verde específica
    private static void verDetalhesArea(Scanner entrada) {
        System.out.println("Digite o ID da area verde que gostaria de ver os detalhes: ");
        int id = entrada.nextInt(); // ID da área a ser consultada
        entrada.nextLine(); // Limpa o buffer

        AreaVerde area = AreaVerdeRepository.buscarPorId(id); // Busca a área pelo ID
        if (area == null) {
            System.out.println("Area verde não encontrada"); // Mensagem se não encontrada
        } else {
            System.out.println("\n" + area.toString()); // Exibe detalhes com toString()
        }
    }

    // Cadastra uma nova área verde com informações fornecidas pelo usuário
    private static void cadastraAreaVerde(Scanner entrada) {
        System.out.println("Cadastre uma area verde");

        System.out.print("Digite o Nome: ");
        String nome = entrada.nextLine(); // Nome da área

        System.out.print("Digite latitude: ");
        double latitude = entrada.nextDouble(); // Latitude da localização
        System.out.print("Digite longitude: ");
        double longitude = entrada.nextDouble(); // Longitude da localização
        entrada.nextLine(); // Limpa o buffer após entradas numéricas

        System.out.print("Digite o horario de atendimento (ex.: 06:00-18:00): ");
        String horariosFuncionamento = entrada.nextLine(); // Horários de funcionamento
        System.out.print("Digite o tipo de vegetação (ex.: árvores, arbustos, grama): ");
        String tipoVegetacao = entrada.nextLine(); // Tipo de vegetação

        // Solicita atividades e as converte em uma lista
        System.out.print("Digite as atividades disponiveis (separadas por vírgula, ex.: caminhada, piquenique): ");
        String atividadesInput = entrada.nextLine();
        List<String> atividades = Arrays.asList(atividadesInput.split(",\\s*")); // Separa por vírgula e remove espaços

        // Cria e salva a localização
        Localizacao localizacao = new Localizacao(0, latitude, longitude, 0);
        LocalizacaoRepository.inserir(localizacao);

        // Cria e salva a área verde
        AreaVerde area = new AreaVerde(nome, localizacao, tipoVegetacao, horariosFuncionamento, atividades);
        AreaVerdeRepository.inserir(area);
        localizacao.setIdAreaVerde(area.getId()); // Associa a localização à área

        System.out.println("Area Verde cadastrada com sucesso! ID: " + area.getId());
    }
}