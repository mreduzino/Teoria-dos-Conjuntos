
# Teoria dos Conjuntos - 😎🤝😎


# `Uniao_Vetores`, realiza as seguintes operações:

    1. Cria um array `A` de inteiros com tamanho 5.

    2. Solicita ao usuário que insira 5 valores inteiros únicos.

    3. Para cada valor inserido:
        - Se for o primeiro valor (índice 0), ele é adicionado diretamente ao array.
        - Para os valores subsequentes, o programa verifica se o valor já existe no array.
        - Se o valor não existir, ele é adicionado ao array.
        - Se o valor já existir, o programa exibe uma mensagem de erro e pede ao usuário para inserir outro valor.

    4. O processo continua até que 5 valores únicos sejam inseridos.

    5. Ao final, o programa exibe todos os valores armazenados no array.

            
Em resumo, este programa cria um array de 5 elementos com valores únicos fornecidos pelo usuário, evitando duplicatas. É uma implementação simples de um conjunto (set) usando um array.

# `2-Interseccao_Vetores.java`, contém uma classe chamada `Interseccao_Vetores`. O programa realiza as seguintes operações:

    1. Define um array de inteiros `A` com valores predefinidos.

    2. Cria um `ArrayList` chamado `X` para armazenar elementos únicos.

    3. Inicializa `X` com o primeiro elemento de `A`.

    4. Percorre o array `A` a partir do segundo elemento.

    5. Para cada elemento em `A`, verifica se ele já existe em `X`.

    6. Se o elemento não existir em `X`, ele é adicionado.

    7. Ao final, imprime o conteúdo de `X`.

Em essência, este programa remove elementos duplicados do array `A` e armazena os elementos únicos em `X`. Ele implementa uma forma simples de criar um conjunto (set) a partir de um array, mantendo a ordem de aparição dos elementos.

No entanto, é importante notar que esta implementação não é a mais eficiente para grandes conjuntos de dados, pois utiliza uma busca linear para verificar a existência de elementos em `X`. Para conjuntos maiores, seria mais eficiente usar uma estrutura de dados como `HashSet` ou otimizar o algoritmo de busca.

# o terceiro arquivo implementa um programa simples que realiza as seguintes operações:

    1. Define um vetor (array) de inteiros chamado `A` com os valores {3, 1, 4, 2}.

    2. Implementa um algoritmo de ordenação conhecido como "Bubble Sort" para ordenar o vetor em ordem crescente.

    3. Imprime o vetor ordenado.

Aqui está uma descrição mais detalhada:

    1. O programa começa definindo um vetor `A` com valores iniciais {3, 1, 4, 2}.

    2. Em seguida, utiliza dois loops aninhados para implementar o algoritmo de ordenação Bubble Sort:
        - O loop externo (`i`) percorre o vetor da primeira posição até a penúltima.
        - O loop interno (`j`) compara cada elemento com os elementos seguintes.
        - Se um elemento for maior que o próximo, eles são trocados de posição.

    3. Após a ordenação, o programa utiliza `Arrays.toString(A)` para converter o vetor em uma string e o imprime no console.

O resultado final será o vetor A ordenado em ordem crescente: [1, 2, 3, 4].

Este programa demonstra um método simples de ordenação de vetores em Java, embora existam métodos mais eficientes para ordenação em casos de vetores maiores.

# `Insercao_elementos_unicos` realiza a seguinte operação:

    1. Define dois arrays de inteiros, `A` e `B`, cada um com 3 elementos.
    2. Cria um novo array `U` com o dobro do tamanho de `A` (ou `B`).
    3. Copia os elementos de `A` para a primeira metade de `U`.
    4. Copia os elementos de `B` para a segunda metade de `U`.
    5. Imprime o array resultante `U`.

Especificamente:

    - `A` contém os elementos [1, 2, 3]
    - `B` contém os elementos [4, 5, 6]
    - `U` será preenchido com [1, 2, 3, 4, 5, 6]

O programa usa um loop `for` para copiar os elementos e a classe `Arrays` para imprimir o array resultante de forma legível.

É importante notar que, apesar do nome da classe sugerir "elementos únicos", o código atual não verifica a unicidade dos elementos. Ele simplesmente concatena os dois arrays em um novo array maior.

# O quinto arquivo encontra a interseção entre dois vetores de inteiros. Aqui está uma descrição do que o código faz:

    1. Dois vetores de inteiros são definidos: `a` e `b`.

    2. Uma ArrayList chamada `IT` é criada para armazenar os elementos da interseção.

    3. O programa usa dois loops aninhados para comparar cada elemento do vetor `a` com cada elemento do vetor `b`.

    4. Quando um elemento comum é encontrado, ele é adicionado à ArrayList `IT`, e um contador `C` é incrementado.

    5. Após a comparação:
        - Se `C` for igual a zero (nenhum elemento comum encontrado), o programa imprime "Intersecção vazia".
        - Caso contrário, o programa imprime "Intersecção: " seguido pelos elementos na ArrayList `IT`.

Em resumo, este programa identifica e exibe os elementos comuns entre dois vetores predefinidos, ou informa se não há elementos em comum.


# `Classificacao_Vetor_Unico`, realiza as seguintes operações:

    1. Define dois arrays de inteiros: `A` e `B`.
    2. Cria um ArrayList chamado `CAB` para armazenar os resultados.
    3. Itera sobre cada elemento do array `A`.
    4. Para cada elemento de `A`, verifica se ele existe no array `B`.
    5. Se um elemento de `A` não for encontrado em `B`, ele é adicionado ao ArrayList `CAB`.
    6. No final, imprime o ArrayList `CAB`.

Em essência, o programa encontra e armazena todos os elementos do array `A` que não estão presentes no array `B`. Isso é conhecido como a diferença entre conjuntos A e B.

Algumas observações:

    - A variável `C` é incrementada cada vez que um elemento único é encontrado, mas não é utilizada no output final.
    - A variável `Chave` é usada como um flag para indicar se um elemento de `A` foi encontrado em `B` (0) ou não (1).
    - O comentário no início do arquivo resume corretamente a função do programa: "O algoritmo encontra elementos de A que não estão em B."

O resultado impresso será uma lista contendo os elementos de `A` que não estão em `B`, neste caso: `[1, 5]`.
## Autores

- [@ramon.god](https://github.com/Ramonlegend)
- [@.danielgalvao.](https://github.com/MagalDevs)
- [@mreduzino]()
- [@nathan.ferracini](https://github.com/Nathan-Ferracini-Batista)



## 🚀 Sobre nós
Somos alunos do segundo semestre do curso de DSM da Fatec - Indaitauba, amantes do mundo tecnológico e com muita determinação e perseverança, para que no futuro tornar-mos excelentes desenvolvedors. 😁😁


