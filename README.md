# AreaVerde 🌳

**AreaVerde** é um sistema de console em Java desenvolvido como um **projeto institucional** no âmbito do curso de Programação Orientada a Objetos (POO) do **SENAI**. O projeto simula o gerenciamento de áreas verdes, como parques, praças ou reservas naturais, permitindo cadastrar áreas, avaliar sua qualidade com base em cinco critérios, listar áreas registradas e visualizar detalhes. Ele utiliza listas em memória (sem banco de dados) e uma interface de console interativa, servindo como exercício prático para conceitos de POO, como encapsulamento, classes e repositórios.

> **Nota**: Este projeto foi desenvolvido por Douglas Graça como parte das atividades do curso do SENAI, com foco em aprendizado prático de Java e sustentabilidade ambiental.

## 🎯 Objetivo do Projeto

Promover o aprendizado de Programação Orientada a Objetos através de um sistema simples que gerencia áreas verdes, incentivando a conscientização sobre a preservação ambiental e a gestão de espaços sustentáveis. O projeto simula um sistema real de registro e avaliação, com potencial para expansões futuras (ex.: integração com banco de dados ou interface gráfica).

## 🛠️ Tecnologias Utilizadas

- **Java (JDK 8+)**: Linguagem principal, com foco em POO (encapsulamento, classes, objetos).
- **Scanner**: Captura de entrada do usuário via console.
- **ArrayList**: Armazenamento de dados em memória (áreas, avaliações, localizações).
- **String.format**: Formatação de saídas de texto para exibição clara.
- **Ferramentas de Desenvolvimento**: IDEs como IntelliJ, Eclipse ou VS Code (opcional).

## 📂 Estrutura do Projeto

O projeto está organizado em pacotes para separar responsabilidades:

```
AreaVerde/
├── src/
│   ├── main/
│   │   └── Main.java
│   ├── models/
│   │   ├── AreaVerde.java
│   │   ├── Avaliacao.java
│   │   └── Localizacao.java
│   ├── repositories/
│   │   ├── AreaVerdeRepository.java
│   │   ├── AvaliacaoRepository.java
│   │   └── LocalizacaoRepository.java
└── README.md
```

### Descrição dos Arquivos

- **main/**:
  - `Main.java`: Classe principal com o menu interativo e lógica de navegação do sistema.

- **models/**:
  - `AreaVerde.java`: Representa uma área verde com atributos como ID, nome, localização, tipo de vegetação, horários e atividades.
  - `Avaliacao.java`: Armazena notas (1 a 5) para cinco critérios e calcula a média.
  - `Localizacao.java`: Define coordenadas geográficas (latitude e longitude) de uma área.

- **repositories/**:
  - `AreaVerdeRepository.java`: Gerencia a lista de áreas verdes em memória.
  - `AvaliacaoRepository.java`: Gerencia as avaliações associadas às áreas.
  - `LocalizacaoRepository.java`: Gerencia as localizações das áreas.

## 🚀 Como Configurar e Executar

### Pré-requisitos
- **Java Development Kit (JDK)**: Versão 8 ou superior.
- **Ambiente de Desenvolvimento**: Terminal ou IDE (IntelliJ, Eclipse, VS Code).
- **Git**: Para clonar o repositório.

### Passos para Configuração

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/DougBrando/AreaVerde.git
   cd AreaVerde
   ```

2. **Compile o Projeto**:
   ```bash
   javac src/main/*.java src/models/*.java src/repositories/*.java
   ```

3. **Execute o Programa**:
   ```bash
   java -cp src main.Main
   ```

4. **Interaja com o Sistema**:
   - Use o menu no console (digite números de 0 a 4) para acessar as funcionalidades.
   - Siga as instruções exibidas para cadastrar, avaliar ou listar áreas verdes.

## 🛠️ Funcionalidades

O sistema oferece um menu interativo com cinco opções:
1. **Listar Áreas Verdes**: Exibe todas as áreas cadastradas ou "Lista vazia" se não houver registros.
2. **Avaliar Área Verde**: Permite atribuir notas (1 a 5) em cinco critérios (quantidade de árvores, qualidade do ar, ausência de poluição sonora, coleta de resíduos, facilidade de transporte público).
3. **Ver Detalhes de uma Área Verde**: Mostra informações completas de uma área, incluindo nome, localização, vegetação, horários, atividades e média das avaliações.
4. **Cadastrar uma Nova Área Verde**: Registra uma área com ID único, nome, localização, horários, vegetação e atividades.
5. **Sair**: Encerra o programa.

## 📸 Capturas de Tela

| Menu Principal | Cadastro de Área | Avaliação de Área | Lista de Áreas | Detalhes de Área |
|----------------|------------------|-------------------|----------------|------------------|
| <img width="348" height="229" alt="image" src="https://github.com/user-attachments/assets/8209a214-b4ed-48a8-beb0-ba292a28a021" /> | <img width="889" height="249" alt="image" src="https://github.com/user-attachments/assets/2cd938b3-98de-45d0-b916-b0872f569514" /> | <img width="361" height="244" alt="image" src="https://github.com/user-attachments/assets/84ef490e-610c-44b5-8105-4c21e14fc0a8" /> | <img width="669" height="269" alt="image" src="https://github.com/user-attachments/assets/f384d76a-372d-4125-992a-6267a3088033" /> | <img width="666" height="293" alt="image" src="https://github.com/user-attachments/assets/a01e0842-fdb5-4be2-953b-2d40440a4cb1" /> |

### Descrição das Capturas
1. **Menu Principal**: Tela inicial do console com as opções de 0 a 4.
2. **Cadastro de Área**: Exemplo de entrada de dados para cadastrar uma nova área verde (ex.: Parque Central).
3. **Avaliação de Área**: Tela mostrando a atribuição de notas para uma área existente.
4. **Lista de Áreas**: Saída com várias áreas verdes listadas, incluindo IDs e nomes.
5. **Detalhes de Área**: Informações completas de uma área, com localização, vegetação e média de avaliações.

## 📋 Exemplos de Uso

### 1. Cadastrar uma Nova Área Verde (Opção 4)
```text
Opção: 4
Cadastre uma área verde
Digite o Nome: Parque Central
Digite latitude: -23.5
Digite longitude: -46.6
Digite o horário de atendimento (ex.: 06:00-18:00): 08:00-18:00
Digite o tipo de vegetação (ex.: árvores, arbustos, grama): árvores
Digite as atividades disponíveis (separadas por vírgula, ex.: caminhada, piquenique): caminhada, piquenique
Área Verde cadastrada com sucesso! ID: 1
```

### 2. Avaliar Área Verde (Opção 2)
```text
Opção: 2
Digite o ID da área que deseja avaliar: 1
Avaliando: Parque Central, notas de 1 a 5
Quantidade de árvores: 4
Qualidade do Ar: 5
Ausência de Poluição Sonora: 3
Coleta de Resíduos: 4
Facilidade de Transporte Público: 5
Avaliação realizada com sucesso!
```

### 3. Listar Áreas Verdes (Opção 1)
```text
Opção: 1
Lista de Áreas Verdes
Detalhes da Área Verde:
ID: 1
Nome: Parque Central
Localização: Localização [ID: 1, Latitude: -23.5, Longitude: -46.6, ID Área Verde: 1]
Tipo de Vegetação: árvores
Horários: 08:00-18:00
Atividades Disponíveis: caminhada, piquenique
Média das Avaliações: 4.20
```

### 4. Ver Detalhes de uma Área Verde (Opção 3)
```text
Opção: 3
Digite o ID da área verde que gostaria de ver os detalhes: 1
Detalhes da Área Verde:
ID: 1
Nome: Parque Central
Localização: Localização [ID: 1, Latitude: -23.5, Longitude: -46.6, ID Área Verde: 1]
Tipo de Vegetação: árvores
Horários: 08:00-18:00
Atividades Disponíveis: caminhada, piquenique
Média das Avaliações: 4.20
```

### 5. Sair (Opção 0)
```text
Opção: 0
Encerrando a sessão...
```
   

## 🌍 Parceiros Institucionais

- **SENAI**
- **Prefeitura de Joinville**
- **Lab365**
