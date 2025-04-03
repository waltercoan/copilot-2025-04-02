# Curso Copilot 02/04/2025

[Assinaturas](https://docs.github.com/en/copilot/about-github-copilot/subscription-plans-for-github-copilot)

[Codex](https://openai.com/index/openai-codex/)

[Cheat Sheets](https://docs.github.com/en/copilot/using-github-copilot/copilot-chat/github-copilot-chat-cheat-sheet?tool=vscode)

## Configuração do ambiente local

[VSCode](https://code.visualstudio.com/)

[Download JDK](https://adoptium.net/)

[Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

[GitHub Copilot](https://marketplace.visualstudio.com/items?itemName=GitHub.copilot)

[Atalhos Github Copilot](https://docs.github.com/en/copilot/managing-copilot/configure-personal-settings/configuring-github-copilot-in-your-environment?tool=jetbrains)

## Prompt gitignore
```bash
por favor, gere um arquivo .gitignore para o meu projeto java maven
```

```bash
@workspace crie uma função para  gerar um arquivo .csv com alguns dados dentro
```

```bash
@workspace por favor gere um método que receba uma URL de uma API REST, e faça uma chamada HTTP e em seguida imprima o retorno em formato de texto
```

[Prompt Copilot](https://docs.github.com/en/copilot/using-github-copilot/copilot-chat/prompt-engineering-for-copilot-chat)

```bash
@workspace /explain por favor explique o método chamarApiRest
```

```bash
@workspace /explain por favor gere a documentação no código para o método chamarApiRest
```

```bash
@workspace /explain por favor gere a documentação no código linha a linha para o método chamarApiRest, sem modificar o código fonte
```

```bash
@workspace por favor, gere um novo método no #file:Main.java que receba um número inteiro e retorne o texto se ele é par ou impar

@workspace por favor insira a dependencia do junit jupiter

@workspace por favor gere um teste de unidade para o método verificarParOuImpar na pasta de test do projeto seguindo o mesmo pacote.
```

```bash
@workspace crie um novo arquivo main no pacote br.com.kasolution.exercicio3 e definir um método para criar validação para email. O método deve ser chamado validarEmail e deve receber um parâmetro do tipo String com o email a ser validado. O método deve retornar um boolean indicando se o email é válido ou não. O método main deve chamar o método validarEmail e passar o email. Ao começar a digitar a função ‘validarEmail’, o Copilot pode sugerir o uso de expressões regulares para validação. 
```
```bash
definir um método para criar uma validação para CPF. O método deve ser chamado validarCPF e deve receber um parâmetro do tipo String com o CPF a ser validado. O método deve retornar um boolean indicando se o CPF é válido ou não. O método main deve chamar o método validarCPF e passar o CPF "123.456.789-10" como parâmetro. O Copilot pode ajudar a sugerir a criação do método para validação de CPF 
```

```bash
definir um método para gerenciar a conexão com um banco de dados SQL Server. O método deve ser chamado conectarBanco e deve receber um parâmetro do tipo String com a URL de conexão. O método deve retornar um objeto do tipo Connection. O método main deve chamar o método conectarBanco e passar a URL de conexão "jdbc:sqlserver://localhost:1433;databaseName=exemplo" como parâmetro.

@workspace considerando o método conectarBanco gere uma versão do código em c#
```

## Exercício 5 SQL
- Tabela de Usuário possui os campos: nome, telefone, endereco, numero
- Tabela de Publicacao possui os campos: texto, usuario associado, data e numero de likes
- Tabela de Comentário possui os campos: publicacao associada, texto e data

```bash
@workspace #sym:## Exercício 5 SQL por favor gere o código na linguagem SQL para criar as tabelas e associações
```

## Exercício 6

```bash
Crie uma classe chamada ‘Carro’ que descreve e implementa atributos referente a uma veículo 
automotor.  
A classe deve: 
1. Descrever alguns atributos: por exemplo, marca, modelo, cor, ano. 
2. Gerar o método-construtor da classe para inicializar seus atributos 
3. Gerar o método booleano vender() com valor default true. 
4. Gerar o método  imprimir() para exibir os valores atribuídos as propriedades(atributos) da classe. 
5. Crie uma classe chamada ‘MainClass’  para gerar o método main e, a partir, gerar o objeto da classe 
Carro, acessar seus atributos, atribuir valores as propriedades e chamar os métodos a sua execução 
```
## Exercício 7

```bash
Crie um programa que simule o funcionamento de um caixa de supermercado. O caixa fica aberto até 
o fim do expediente e pode processar a compra de vários clientes. Cada cliente pode comprar vários itens. Ao ler 
cada item deve ser exibida uma mensagem para o operador do caixa perguntando se há mais itens a serem 
processados. Ao final, exiba quanto a compra custou ao cliente. E então solicite do operador do caixa a 
informação se deseja fechar o caixa. Encerre o algoritmo quando o usuário informar que deseja fechar o caixa 
O programa deve ser composto pelos seguintes recursos: 
1. Classe para representar um item do supermercado (nome e preço). Retornar 1 se `n` for 0 ou 1. 
2. Classe para armazenar os itens comprados e calcular o total.  
3. Classe para iniciar o programa e gerenciar o caixa.  
4. Classe principal que gerencia o fluxo do caixa e interage com o operador.  
```

### Documentação do código

```bash
@workspace /explain gere a documentação linha a linha
```

## Exercício 8

```bash
Implemente um programa que utilize herança para representar funcionários de uma empresa e 
verificar se eles têm direito a férias. 
1. Crie uma classe base chamada Pessoa, contendo atributos comuns como nome e um método para exibir 
informações.  
2. Crie uma classe derivada Funcionario, que herda de Pessoa e adiciona um atributo para armazenar o 
tempo de serviço (em meses). Na classe Funcionario, implemente um método que verifica se o 
funcionário tem mais de 12 meses de serviço e retorna se ele tem direito a férias.  
3. O programa deve solicitar ao usuário a quantidade de funcionários, e para cada funcionário, pedir o 
nome e o tempo de serviço. Exiba uma mensagem informando se cada funcionário tem ou não direito a 
férias.  
4. Ao final, mostre a quantidade total de funcionários com e sem direito a férias. 
```
## Exercício 9

```bash
Desenvolver um simulador de caixa eletrônico utilizando a linguagem Java e uma interface gráfica
baseada na biblioteca Swing. O programa permitirá que um usuário realize operações bancárias
básicas, como:
• Saque
• Consulta de saldo
• Depósito
• Pagamento de contas
• Transferência entre contas
O usuário deverá inserir suas credenciais para acessar sua conta e, após a autenticação, poderá navegar por um
menu interativo para realizar as operações bancárias.
Requisitos do Sistema
1. Interface Gráfica (GUI)
A interface do caixa eletrônico deve conter:
Tela de Login (usuário e senha)
Tela Principal com botões para cada operação
Tela para cada operação (saque, depósito, etc.), onde o usuário insere os valores e confirma a
transação
Mensagens de erro e sucesso exibidas para o usuário
2. Funcionalidades do Caixa Eletrônico
Cada operação deve funcionar conforme descrito abaixo:
2.1. Login do Usuário
• O usuário deve inserir um número de conta e senha.
• Se a autenticação falhar, uma mensagem de erro deve ser exibida.
• Após o login bem-sucedido, o usuário será redirecionado para a tela principal.
2.2. Consulta de Saldo
• O sistema exibe o saldo atual da conta.
2.3. Saque
• O usuário insere um valor para sacar.
• O sistema verifica se há saldo suficiente.
• Se o saldo for suficiente, o valor é deduzido da conta e uma mensagem de sucesso é
exibida.
• Caso contrário, exibir uma mensagem de erro.
2.4. Depósito
• O usuário insere um valor para depositar.
• O valor é adicionado ao saldo da conta.
• Uma mensagem de sucesso é exibida.
2.5. Pagamento de Conta
• O usuário insere um número da conta e o valor do pagamento.
• O sistema verifica se há saldo suficiente.
• Se houver saldo, o pagamento é efetuado.
• Se não houver saldo, uma mensagem de erro é exibida.
2.6. Transferência entre Contas
• O usuário informa número da conta destino e valor da transferência.
• O sistema verifica se há saldo suficiente.
• Se houver saldo, o valor é transferido para a conta de destino.
• Caso contrário, exibir uma mensagem de erro.
3. Requisitos Técnicos
• Linguagem: Java
• Interface Gráfica: Swing
• Persistência de Dados: Pode ser feita usando um arquivo .txt, .json, ou um banco de dados como SQLite
Classes Principais:
• ContaBancaria: Armazena os dados da conta e operações bancárias.
• Usuario: Representa o titular da conta.
• CaixaEletronico: Controla a interface gráfica e as operações.
4. Fluxo do Programa
• Tela de Login
• Menu Principal (Selecionar Operação)
• Tela da Operação Escolhida (Saque, Depósito, etc.)
• Processamento da Transação
• Exibição de Mensagem de Sucesso ou Erro
• Voltar ao Menu Principal ou Encerrar Sessão
```

## Exercício 10

```bash
O desafio propõe o desenvolvimento de um SnakeGame básico que fornece as
seguintes funcionalidades:
• A Cobra pode se mover em uma determinada direção e quando come a comida, o comprimento da cobra aumenta.
• Quando a cobra se cruza ou quando um dos cantos da tela é atingido pela cobra o jogo acaba.
• Os alimentos serão gerados em posição aleatória.
• Idealmente, todos estes elementos de funcionalidades devem ser apresentados numa tela com interface
de usuário.
Antes de tudo, é necessário pensar nas classes. As principais classes serão - considerando que estas são as classesbase da aplicação:
1. Snake
2. Cell
3. Board
4. Game
Obs.: deve-se pensar em criar uma Enum para definir um CellType – por exemplo: se a célula esta vazia, com comida
ou, ainda, se é um snake node(um pedaço do corpo da cobra) – ainda, pode ocorrer a necessidade de criar uma
enum para tratar as direções que o personagem snake pode adotar; considerando as setas do teclado;
Também é importante identificar, com comentários, qual é a classificação e funcionalidade de cada bloco de
código.
Indicações importantes:
• A classe Game representa o corpo do programa. Ele armazena informações sobre a cobra e o tabuleiro
por onde o personagem principal circula.
• A classe Cell representa o único ponto de exibição/quadradinho. Ele contém o numero de linhas e colunas
e as informações.
• A classe Snake, que contém o corpo e a cabeça da cobra.
• Pode-se usar o recurso LinkedList para armazenar o corpo porque, dessa forma, fica mais fácil adicionar
uma célula em O(1).
• O método Grow será chamado quando ele - o personagem - comer o alimento. A classe Board representa
o display (a tela do jogo). É uma matriz de células. Possui um método de geração de alimentos que gera
o alimento em uma posição aleatória.
• A classe principal (Game) mantém as instâncias de Snake e Board. Seu método “update” precisa ser
chamado em um intervalo fixo.
Obs.: a estruturas de classe do seu projeto não precisam seguir estritamente a indicação de nomes e quantidades
de classes indicadas acima. Se for necessário, cada desenvolvedor pode nomear as classes da forma que lhe for
conveniente. Também, se preciso for, crie a quantidade de classes que você acredita ser necessária para que o
projeto funcione adequadamente.
É recomendado o uso das classes JFrame e JPanel -superclasses oferecidas pelo próprio Java - e praticar a herança
(quando necessário) para gerar gráficos e interfaces para a aplicação:
"JFrame é uma classe java que é estendida pela classe Frame. O JFrame é tratado como a janela principal. No
JFrame, diferentes elementos, como rótulos, campos de texto e botões, podem ser adicionados. Esses elementos
no JFrame criam a interface gráfica do usuário.O JFrame também é conhecido como contêiner de nível superior
Swing. Swing refere-se ao kit de ferramentas do widget da GUI para criar aplicativos em JAVA. "
```
## Projeto Spring Boot
[Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)

```bash
@workspace por favor gere as configurações necessárias no arquivo application.properties para conectar no banco de dados H2 e acessara a interface web
```

## Histórias de Usuário
- Como um atendente eu gostaria de registrar os dados de um cliente como: nome, endereco, telefone, e-mail, estado
- Como um atendente eu gostaria de buscar um cliente pelo nome
- Como um atendente eu gostaria de altearr os dados de um cliente
- Como um atendente eu gostaria de excluir um cliente pelo nome
- Como um atendente ue gostaria de registrar os estados com os dados: nome, pais
- 
- 
```bash
@workspace #sym:## Histórias de Usuário quais são as entidades?

por favor gere as classes em java no pacote br.com.kasolution.springboot.entities para representar as entidades

@workspace por favor altere as entidades para que possam ser persistidas no banco de dados
```
