package models;

import java.util.ArrayList;
import java.util.List;

public class AreaVerde {
    // Atributos da área verde
    private int id; // Identificador único da área verde
    private String nome; // Nome da área (ex.: Parque Central)
    private Localizacao localizacao; // Localização geográfica (latitude e longitude)
    private String tipoVegetacao; // Tipo de vegetação (ex.: árvores, arbustos)
    private String horariosFuncionamento; // Horários de funcionamento (ex.: 06:00-18:00)
    private List<String> atividadesDisponiveis; // Lista de atividades oferecidas (ex.: caminhada, piquenique)
    private List<Avaliacao> avaliacoes; // Lista de avaliações associadas à área

    // Construtor para inicializar uma nova área verde
    public AreaVerde(String nome, Localizacao localizacao, String tipoVegetacao,
                     String horariosFuncionamento, List<String> atividadesDisponiveis) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tipoVegetacao = tipoVegetacao;
        this.horariosFuncionamento = horariosFuncionamento;
        // Inicializa atividadesDisponiveis como lista vazia se null for passado
        this.atividadesDisponiveis = atividadesDisponiveis != null ? atividadesDisponiveis : new ArrayList<>();
        this.avaliacoes = new ArrayList<>(); // Inicializa a lista de avaliações como vazia
    }

    // Getters e Setters para encapsulamento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public String getTipoVegetacao() {
        return tipoVegetacao;
    }

    public void setTipoVegetacao(String tipoVegetacao) {
        this.tipoVegetacao = tipoVegetacao;
    }

    public String getHorariosFuncionamento() {
        return horariosFuncionamento;
    }

    public void setHorariosFuncionamento(String horariosFuncionamento) {
        this.horariosFuncionamento = horariosFuncionamento;
    }

    public List<String> getAtividadesDisponiveis() {
        return atividadesDisponiveis;
    }

    public void setAtividadesDisponiveis(List<String> atividadesDisponiveis) {
        this.atividadesDisponiveis = atividadesDisponiveis;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    // Calcula a média geral das avaliações da área
    public double calcularMediaAvaliacoes() {
        if (avaliacoes.isEmpty()) {
            return 0.0; // Retorna 0 se não houver avaliações
        }
        double soma = 0.0;
        for (Avaliacao av : avaliacoes) {
            soma += av.calcularMedia(); // Soma a média de cada avaliação
        }
        return soma / avaliacoes.size(); // Retorna a média geral
    }

    // Retorna uma representação em string com os detalhes da área
    @Override
    public String toString() {
        return String.format("""
                        Detalhes da Área Verde:
                        ID: %d
                        Nome: %s
                        Localização: %s
                        Tipo de Vegetação: %s
                        Horários: %s
                        Atividades Disponíveis: %s
                        Média das Avaliações: %.2f
                        """,
                id, nome, localizacao, tipoVegetacao, horariosFuncionamento,
                String.join(", ", atividadesDisponiveis), // Junta atividades em uma string separada por vírgulas
                calcularMediaAvaliacoes()); // Inclui a média calculada
    }
}