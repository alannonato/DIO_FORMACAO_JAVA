# Desafio Controle de Fluxo

Projeto simples em Java para praticar controle de fluxo e tratamento de exceções.

## Sobre

O programa `Contador` lê dois números inteiros do usuário e imprime uma sequência com base na diferença entre eles.

- Se o segundo número for menor ou igual ao primeiro, o programa lança uma exceção e mostra uma mensagem de erro.
- Caso contrário, ele imprime "Imprimindo o número: X" para cada valor até a diferença.

## Estrutura do projeto

- `src/Contador.java` - classe principal com entrada pelo terminal e lógica de contagem.
- `src/ParametrosInvalidosException.java` - exceção personalizada usada quando os parâmetros são inválidos.

## Como executar

1. Navegue até a pasta do projeto:

```powershell
cd  \DIO_FORMACAO_JAVA\DesafioControleFluxo
```

2. Compile o código Java:

```powershell
javac src\*.java
```

3. Execute o programa:

```powershell
java -cp src Contador
```

## Exemplo de uso

```text
Digite o primeiro parâmetro:
2
Digite o segundo parâmetro:
5
Imprimindo o número: 1
Imprimindo o número: 2
Imprimindo o número: 3
```

## Personalização

Se quiser, você pode estender o projeto para:

- suportar valores decrescentes;
- mostrar os próprios números em vez de uma sequência incremental;
- aceitar parâmetros por linha de comando.
