# Programação de Soluções Computacionais - UniRitter

## Avaliação: Calculadora de Salário para Professores

### Descrição do Projeto

Este projeto é uma avaliação da disciplina de Programação de Soluções Computacionais da UniRitter. O programa desenvolvido funciona como uma calculadora de salário para professores. O programa solicita ao usuário informações sobre o professor, incluindo seu nome e regime de pagamento (CLT, Horista ou PJ), e calcula o valor a receber pelo professor de acordo com seu regime de pagamento.

[Veja aqui o enunciado completo do problema](./assets/CalculadoraProfessor_20230529190708.pdf) 

### Como Utilizar

1. Execute a classe Main.
2. Digite o nome do professor.
3. Digite o regime de pagamento do professor (CLT, Horista ou PJ).
4. Dependendo do regime de pagamento selecionado, insira as informações adicionais solicitadas:
   - Para CLT: insira o salário mensal.
   - Para Horista: insira o número de horas trabalhadas e o valor da hora de trabalho.
   - Para PJ: insira o valor do contrato.
5. O programa calculará e exibirá o valor a receber pelo professor.

### Implementação

O programa é dividido em três classes:

- **Professor:** Esta classe representa um professor e contém informações sobre o nome do professor, o regime de pagamento e, dependendo do regime, o salário mensal, o número de horas trabalhadas, o valor da hora de trabalho ou o valor do contrato.

- **CalculadoraDeSalario:** Esta classe contém um método estático para calcular o valor a receber pelo professor de acordo com seu regime de pagamento.

- **Main:** Esta classe contém o método principal para executar o programa. Solicita ao usuário as informações necessárias e exibe o resultado calculado.

### Notas

Este programa é um exemplo simplificado e não contém tratamento de erros ou validação de entradas. Para um programa de produção real, seriam necessárias verificações adicionais e manejo adequado de possíveis erros.
