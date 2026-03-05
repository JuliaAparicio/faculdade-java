# 💻 Sistema de Gerenciamento de Computadores

Projeto desenvolvido em Java com foco em Programação Orientada a Objetos (POO).

## 📌 Sobre o Projeto

Este sistema simula o cadastro de computadores e a compra de jogos utilizando saldo disponível.

O objetivo é aplicar conceitos fundamentais de:

- Classes e Objetos
- Construtores
- Métodos
- Regras de negócio
- Instanciação
- Organização em pacotes

---

## 🏗 Estrutura do Projeto

br.com.fiapride
│
├── model
│   └── Computador.java
│
└── main
    └── SistemaPrincipal.java

---

## 🖥 Classe Computador

A classe `Computador` contém:

### 🔹 Atributos
- `double tamanho`
- `int memoria`
- `double preco`
- `double saldo`

### 🔹 Métodos
- `comprarComputador()`
- `comprarJogo(double valorJogo)`

O método `comprarJogo` valida:
- Se o valor é positivo
- Se há saldo suficiente

---

## 🚀 Execução

A classe `SistemaPrincipal` instancia dois computadores e simula:

- Exibição de informações
- Compra de jogos
- Atualização de saldo

---

## 🎯 Conceitos Aplicados

✔ Programação Orientada a Objetos  
✔ Modelagem de classes  
✔ Regras de validação  
✔ Organização em pacotes  
✔ Uso do operador `this`

---

## 📚 Tecnologias Utilizadas

- Java
- IDE (Eclipse / IntelliJ)

---

## 👩‍💻 Autora

Julia Aparicio  
Estudante de Ciência da Computação  
Interesse em Inteligência Artificial, IoT e Lógica de Programação
