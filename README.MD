# Sobre🚀
Para testar meu conhecimento realizei os seguintes exercicios proporcionados no bootcamp de JAVA da DIO juntamente com o ITAÚ. Pude aprender mais sobre POO, métodos, modificadores de acesso, getters e setters, classes abstratas, encapsulamento, herança e polimorfismo.

#Exercicios🧠
> Todos os exercícios devem ter um menu interativo para chamar as funções e ter uma opção de sair para finalizar a execução.

## 1. Conta Bancária

Escreva um código onde temos uma conta bancária que possa realizar as seguintes operações:

- Consultar saldo
- Consultar cheque especial
- Depositar dinheiro
- Sacar dinheiro
- Pagar um boleto
- Verificar se a conta está usando cheque especial

### Regras de implementação

- A conta bancária deve ter um limite de cheque especial somado ao saldo da conta.
- O valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação:
  - Se o valor depositado na criação da conta for de R$500,00 ou menos, o cheque especial deve ser de R$50,00.
  - Para valores acima de R$500,00, o cheque especial deve ser de 50% do valor depositado.
- Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

## 2. Carro

Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:

- Ligar o carro
- Desligar o carro
- Acelerar
- Diminuir velocidade
- Virar para esquerda/direita
- Verificar velocidade
- Trocar a marcha

### Regras de implementação

- Quando o carro for criado, ele deve começar desligado, em ponto morto e com sua velocidade em 0.
- O carro desligado não pode realizar nenhuma função.
- Quando o carro for acelerado, ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km).
- Quando diminuir a velocidade do carro, ele deve decrementar 1km de sua velocidade (pode chegar no mínimo a 0km).
- O carro deve possuir 6 marchas; não deve ser permitido pular uma marcha no carro.
- A velocidade do carro deve respeitar os seguintes limites para cada marcha:

  | Marcha | Velocidade permitida |
  |--------|-----------------------|
  | 0 (ponto morto) | Não pode acelerar |
  | 1ª | 0km a 20km |
  | 2ª | 21km a 40km |
  | 3ª | 41km a 60km |
  | 4ª | 61km a 80km |
  | 5ª | 81km a 100km |
  | 6ª | 101km a 120km |

- O carro poderá ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0km.
- O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km.

## 3. Pet Shop (Máquina de Banho)

Escreva um código onde temos o controle de banho de um petshop; a máquina de banhos dos pets deve ter as seguintes operações:

- Dar banho no pet
- Abastecer com água
- Abastecer com shampoo
- Verificar nível de água
- Verificar nível de shampoo
- Verificar se tem pet no banho
- Colocar pet na máquina
- Retirar pet da máquina
- Limpar máquina

### Regras de implementação

- A máquina de banho deve permitir somente 1 pet por vez.
- Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo.
- A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo.
- Se o pet for retirado da máquina sem estar limpo, será necessário limpar a máquina para permitir a entrada de outro pet.
- A limpeza da máquina irá consumir 3 litros de água e 1 litro de shampoo.
- O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado.
