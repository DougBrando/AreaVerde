# Área Verde - Sistema de Gerenciamento de Áreas Verdes

## Descrição
O "Área Verde" é um mini-projeto em Java que simula o gerenciamento de áreas verdes, como parques, praças ou reservas naturais. Ele foi criado como um exercício de Programação Orientada a Objetos (POO) para praticar conceitos como encapsulamento, classes, listas e repositórios em memória. O sistema permite que o usuário cadastre áreas verdes, avalie sua qualidade com notas de 1 a 5 em cinco critérios, liste todas as áreas registradas e veja detalhes de uma área específica. Tudo é feito por meio de uma interface simples de console, onde os dados são armazenados em listas estáticas (sem uso de banco de dados externo).

O objetivo é oferecer uma ferramenta básica para registrar e avaliar áreas verdes, calculando médias de avaliações e exibindo informações organizadas.

## Funcionalidades
O sistema possui cinco funcionalidades principais, acessadas por um menu interativo:
1. **Listar Áreas Verdes:** Mostra todas as áreas cadastradas ou uma mensagem se não houver nenhuma.
2. **Avaliar Área Verde:** Permite dar notas a uma área existente e associa a avaliação a ela.
3. **Ver Detalhes de uma Área Verde:** Exibe informações completas de uma área específica, incluindo a média das avaliações.
4. **Cadastrar uma Nova Área Verde:** Registra uma nova área com informações detalhadas.
5. **Sair:** Encerra o programa.

## Estrutura do Projeto
O projeto está organizado em pacotes para separar responsabilidades:
- **`main`:** Contém `Main.java`, a classe principal com o menu e as funções do sistema.
- **`models`:** Inclui as classes de modelo que representam os dados:
  - `AreaVerde.java`: Define uma área verde com atributos como nome, localização e avaliações.
  - `Avaliacao.java`: Armazena notas de avaliação e calcula a média.
  - `Localizacao.java`: Representa as coordenadas geográficas (latitude e longitude) de uma área.
- **`repositories`:** Contém os repositórios em memória para simular persistência:
  - `AreaVerdeRepository.java`: Gerencia a lista de áreas verdes.
  - `AvaliacaoRepository.java`: Gerencia a lista de avaliações.
  - `LocalizacaoRepository.java`: Gerencia a lista de localizações.

## Tecnologias
- **Linguagem:** Java
- **Ferramentas:** 
  - `Scanner` para capturar entrada do usuário.
  - `ArrayList` para armazenar dados em memória.
  - `String.format` para formatar as saídas de texto.

## Como Executar
1. **Pré-requisitos:** Ter o Java Development Kit (JDK) instalado (versão 8 ou superior).
2. **Passos:**
   - Clone o repositório: `git clone https://github.com/seu-usuario/area-verde.git`
   - Entre no diretório: `cd area-verde`
   - Compile todas as classes: `javac main/*.java models/*.java repositories/*.java`
   - Execute o programa: `java main.Main`
3. **Interação:** Use o menu no console digitando números de 0 a 4 para acessar as funções.

## Exemplos de Uso
Abaixo estão exemplos práticos de como usar cada funcionalidade do sistema:

### 1. Cadastrar uma Nova Área Verde (Opção 4)
Permite registrar uma nova área com informações detalhadas.
 ```text
 Opção: 4
 Cadastre uma area verde
 Digite o Nome: Parque Central
 Digite latitude: -23.5
 Digite longitude: -46.6
 Digite o horario de atendimento (ex.: 06:00-18:00): 08:00-18:00
 Digite o tipo de vegetação (ex.: árvores, arbustos, grama): árvores
 Digite as atividades disponiveis (separadas por vírgula, ex.: caminhada, piquenique): caminhada, piquenique
 Area Verde cadastrada com sucesso! ID: 1
```
 O sistema cria uma nova área com ID único e salva em memória.

### 2. Avaliar Área Verde (Opção 2)
```text
Permite dar notas a uma área existente.
Digite o id da area que deseja avaliar: 1
Avaliando: Parque Central, notas de 1 a 5
Quantidade de arvores: 4
Qualidade do Ar: 5
Ausencia de Poluição Sonora: 3
Coleta de Residuos: 4
Facilidade de Transporte Publico: 5
Avaliação realizada com sucesso!!
```
- As notas são salvas e associadas ao "Parque Central" (ID 1). A média será calculada automaticamente.

### 3. Listar Áreas Verdes (Opção 1)
Mostra todas as áreas cadastradas.
```text
Opção: 1
Lista de Areas Verdes
Detalhes da Área Verde:
ID: 1
Nome: Parque Central
Localização: Localização [ID: 1, Latitude: -23.5, Longitude: -46.6, ID Área Verde: 1]
Tipo de Vegetação: árvores
Horários: 08:00-18:00
Atividades Disponíveis: caminhada, piquenique
Média das Avaliações: 4.20
```

- Se não houver áreas, exibe "Lista vazia".

### 4. Ver Detalhes de uma Área Verde (Opção 3)
Exibe informações completas de uma área específica.
```text
Opção: 3
Digite o ID da area verde que gostaria de ver os detalhes: 1
Detalhes da Área Verde:
ID: 1
Nome: Parque Central
Localização: Localização [ID: 1, Latitude: -23.5, Longitude: -46.6, ID Área Verde: 1]
Tipo de Vegetação: árvores
Horários: 08:00-18:00
Atividades Disponíveis: caminhada, piquenique
Média das Avaliações: 4.20
```
- Mostra todos os dados, incluindo a média calculada (ex.: 4.2 após a avaliação acima).

### 5. Sair (Opção 0)
Encerra o programa.
```text
Opção: 0
Encerrando a sessão...
```

- Finaliza a execução.

## Contribuições
Esse é um projeto educacional simples. Sugestões de melhorias, como adicionar validação de entrada ou persistência em arquivo, são bem-vindas! Abra um pull request ou issue se quiser contribuir.
