# AreaVerde 🌳 (Projeto Base - Console)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Projeto_Acadêmico-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

**AreaVerde** é um sistema de console em Java desenvolvido como um projeto acadêmico no âmbito do curso de Programação Orientada a Objetos (POO) do **SENAI**. O projeto simula o gerenciamento de áreas verdes, como parques e praças, aplicando conceitos fundamentais de POO em um cenário prático.

> **Nota**: Este projeto foi a base inicial de aprendizado, focado em Java puro, sem frameworks ou banco de dados.

## 🚀 A Evolução do Projeto

Este projeto de console foi o ponto de partida para uma ideia maior: **transformá-lo em uma aplicação web full-stack moderna.** A lógica de negócio desenvolvida aqui serviu como base para a criação de uma API REST completa e uma interface de usuário interativa.

Confira a evolução deste projeto nos repositórios abaixo:

* **Backend API (Java + Spring Boot):** **[github.com/DougBrando/areaverde-api](https://github.com/DougBrando/areaverde-api)**
* **Frontend (React):** **[github.com/DougBrando/areaverde-frontend](https://github.com/DougBrando/areaverde-frontend)**

## 🎯 Objetivo do Projeto

Promover o aprendizado de **Programação Orientada a Objetos** através de um sistema simples que gerencia áreas verdes. O projeto incentiva a conscientização sobre a preservação ambiental e serve como um exercício prático para conceitos como encapsulamento, classes e repositórios.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 8+)
* **Conceitos de POO:** Encapsulamento, Classes, Objetos, Herança (implícita).
* **Entrada de Dados:** `java.util.Scanner` para interação via console.
* **Armazenamento de Dados:** `java.util.ArrayList` para gerenciamento em memória.
* **Formatação de Saída:** `String.format` para exibição clara no console.

## 📂 Estrutura do Projeto

O projeto é organizado em pacotes para uma clara separação de responsabilidades:

```
AreaVerde/
└── src/
    ├── main/
    │   └── Main.java         # Ponto de entrada e menu interativo
    ├── models/
    │   ├── AreaVerde.java    # Modelo da entidade principal
    │   ├── Avaliacao.java    # Modelo para as avaliações
    │   └── Localizacao.java  # Modelo para as coordenadas
    └── repositories/
        ├── AreaVerdeRepository.java   # Gerencia a lista de áreas
        ├── AvaliacaoRepository.java   # Gerencia a lista de avaliações
        └── LocalizacaoRepository.java # Gerencia a lista de localizações
```

## ⚙️ Funcionalidades

O sistema oferece um menu interativo com as seguintes opções:

1.  **Listar Áreas Verdes**: Exibe todas as áreas cadastradas.
2.  **Avaliar Área Verde**: Permite atribuir notas de 1 a 5 em cinco critérios.
3.  **Ver Detalhes de uma Área Verde**: Mostra informações completas de uma área específica.
4.  **Cadastrar uma Nova Área Verde**: Registra uma nova área com nome, localização, etc.
5.  **Sair**: Encerra o programa.

## 🚀 Como Configurar e Executar

**Pré-requisitos:**
* Java Development Kit (JDK) 8 ou superior.
* Git para clonar o repositório.

**Passos:**
1.  **Clone o Repositório**:
    ```bash
    git clone https://github.com/DougBrando/AreaVerde.git
    cd AreaVerde
    ```

2.  **Compile o Projeto (via terminal)**:
    ```bash
    javac src/main/*.java src/models/*.java src/repositories/*.java
    ```

3.  **Execute o Programa**:
    ```bash
    java -cp src main.Main
    ```
4.  **Interaja com o Sistema** através das opções numéricas no console.

## 📸 Capturas de Tela

| Menu Principal | Cadastro de Área | Avaliação de Área |
| :---: | :---: | :---: |
| <img width="400" alt="Menu Principal" src="https://github.com/user-attachments/assets/8209a214-b4ed-48a8-beb0-ba292a28a021" /> | <img width="400" alt="Cadastro de Área" src="https://github.com/user-attachments/assets/2cd938b3-98de-45d0-b916-b0872f569514" /> | <img width="400" alt="Avaliação de Área" src="https://github.com/user-attachments/assets/84ef490e-610c-44b5-8105-4c21e14fc0a8" /> |
| **Lista de Áreas** | **Detalhes de Área** |
| <img width="400" alt="Lista de Áreas" src="https://github.com/user-attachments/assets/f384d76a-372d-4125-992a-6267a3088033" /> | <img width="400" alt="Detalhes de Área" src="https://github.com/user-attachments/assets/a01e0842-fdb5-4be2-953b-2d40440a4cb1" /> |

## 🌍 Apoio Institucional

* **SENAI**
* **Prefeitura de Joinville**
* **Lab365**
