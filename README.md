# Aula: Funções

Exemplos desenvolvidos em aula

## Conteúdo do Projeto (`src/main/scala/`)

- **FunctionDefinition.scala**: Exemplos de definição de funções, parâmetros padrão, aninhados e variádicos.
- **Filter.scala**: Demonstra filtragem de listas usando predicados.
- **Map.scala**: Demonstra transformação de listas usando `map`.
- **Reduce.scala**: Demonstra agregação de listas com `reduce` (soma, produto) e casos de borda.
- **ForEach.scala**: Demonstra iteração sobre coleções para efeitos colaterais.
- **Collect.scala**: Demonstra o combinador `collect` com pattern matching.
- **Lambdas.scala**: Explora expressões lambda, inferência de tipos e interfaces runtime.
- **HOFs.scala**: Demonstra funções de alta ordem (funções como argumentos e retornos).
- **Closure.scala**: Demonstra closures e escopo léxico em Scala.
- **Currying.scala**: Demonstra funções currificadas e aplicação parcial de argumentos.
- **Composition.scala**: Demonstra composição de funções usando `andThen` e `compose`.
- **Combinators.scala**: Demonstra encadeamento sequencial simples de combinadores de coleção.
- **Transactions.scala**: Exemplo prático de processamento sequencial de transações.
- **ParallelTransactions.scala**: Demonstra processamento paralelo de coleções usando `.par`.
- **TransactionCombinators.scala**: Demonstra composição de pipelines modulares de transações.

## Ambiente de execução 

Esse projeto conta com configuração de DevContainer, podendo ser executado via Codespaces ou localmente com Docker e VSCode. 

## Como executar

Para executar qualquer um dos arquivos que possua uma função `@main` basta usar o comando `sbt runMain <nomeDoArquivo>`, ou, alternativamente, rodar `sbt run` e escolher o nome da função no menu interativo.


