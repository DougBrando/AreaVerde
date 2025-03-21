package models;

public class Avaliacao {
    // Atributos da avaliação
    private int id; // Identificador único da avaliação
    private int quantidadeArvores; // Nota de 1 a 5 para quantidade de árvores
    private int qualidadeAr; // Nota de 1 a 5 para qualidade do ar
    private int ausenciaPoluicaoSonora; // Nota de 1 a 5 para ausência de poluição sonora
    private int coletaResiduos; // Nota de 1 a 5 para coleta de resíduos
    private int facilidadeTraspPublico; // Nota de 1 a 5 para facilidade de transporte público
    private int idAreaVerde; // ID da área verde associada à avaliação

    // Construtor completo com todos os atributos
    public Avaliacao(int id, int quantidadeArvores, int qualidadeAr, int ausenciaPoluicaoSonora,
                     int coletaResiduos, int facilidadeTraspPublico, int idAreaVerde) {
        this.id = id;
        this.quantidadeArvores = quantidadeArvores;
        this.qualidadeAr = qualidadeAr;
        this.ausenciaPoluicaoSonora = ausenciaPoluicaoSonora;
        this.coletaResiduos = coletaResiduos;
        this.facilidadeTraspPublico = facilidadeTraspPublico;
        this.idAreaVerde = idAreaVerde;
    }

    // Construtor vazio para flexibilidade (ex.: criar objeto e setar valores depois)
    public Avaliacao() {}

    // Getters e Setters para encapsulamento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidadeArvores() {
        return quantidadeArvores;
    }

    public void setQuantidadeArvores(int quantidadeArvores) {
        this.quantidadeArvores = quantidadeArvores;
    }

    public int getQualidadeAr() {
        return qualidadeAr;
    }

    public void setQualidadeAr(int qualidadeAr) {
        this.qualidadeAr = qualidadeAr;
    }

    public int getAusenciaPoluicaoSonora() {
        return ausenciaPoluicaoSonora;
    }

    public void setAusenciaPoluicaoSonora(int ausenciaPoluicaoSonora) {
        this.ausenciaPoluicaoSonora = ausenciaPoluicaoSonora;
    }

    public int getColetaResiduos() {
        return coletaResiduos;
    }

    public void setColetaResiduos(int coletaResiduos) {
        this.coletaResiduos = coletaResiduos;
    }

    public int getFacilidadeTraspPublico() {
        return facilidadeTraspPublico;
    }

    public void setFacilidadeTraspPublico(int facilidadeTraspPublico) {
        this.facilidadeTraspPublico = facilidadeTraspPublico;
    }

    public int getIdAreaVerde() {
        return idAreaVerde;
    }

    public void setIdAreaVerde(int idAreaVerde) {
        this.idAreaVerde = idAreaVerde;
    }

    // Calcula a média das notas da avaliação
    public double calcularMedia() {
        int soma = quantidadeArvores + qualidadeAr + ausenciaPoluicaoSonora +
                coletaResiduos + facilidadeTraspPublico;
        return soma / 5.0; // Divide por 5.0 para obter um resultado decimal
    }

    // Retorna uma representação em string da avaliação
    @Override
    public String toString() {
        return String.format("""
                Avaliação [ID: %d, Área Verde ID: %d, 
                           Quantidade de Árvores: %d, 
                           Qualidade do Ar: %d, 
                           Ausência de Poluição Sonora: %d, 
                           Coleta de Resíduos: %d, 
                           Facilidade Transporte Público: %d, 
                           Média: %.2f]""",
                id, idAreaVerde, quantidadeArvores, qualidadeAr,
                ausenciaPoluicaoSonora, coletaResiduos, facilidadeTraspPublico,
                calcularMedia()); // Inclui a média calculada
    }
}