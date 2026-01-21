# Banco em Java com Armazenamento em CSV

Projeto de **sistema bancário em Java para execução no terminal**, usando arquivo CSV como forma de persistência de dados. O programa simula operações básicas de um banco, mantendo as informações salvas mesmo após o encerramento da aplicação.

## Funcionalidades
- Criar contas com código automático
- Listar contas cadastradas
- Depositar valores
- Sacar valores
- Transferir entre contas
- Salvar e carregar dados a partir de arquivo CSV

## Como funciona
Cada conta é armazenada em uma linha do arquivo `docm.csv`, seguindo o formato:
codigo ; nome ; saldo
Ao iniciar o programa, os dados são carregados para a memória, manipulados durante a execução e regravados no CSV após cada operação.

## Tecnologias e conceitos aplicados
- Java (JDK)
- Programação orientada a objetos
- `ArrayList`
- Leitura e escrita de arquivos (CSV)
- Estruturas de repetição e decisão
- Entrada de dados com `Scanner`

## Como executar
1. Compile os arquivos:
   ```bash
   javac BancoCSV.java ObjetosBancoCsv.java
   java BancoCSV
