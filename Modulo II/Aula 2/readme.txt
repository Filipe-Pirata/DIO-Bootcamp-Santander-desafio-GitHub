## Display Flex

Tona a tag um elemento do tipo flex container, e assim automaticamente todos os seus filhos diretos da tag, tornam-se em flex items.

# flex-direction

É a propriedade que estabelece o eixo principal do container definindo assim a direção que os flex items são colocados  no flex container

  *row(padrao): a direção do texto,  esquerda para direita
  *row-reverse: sentido oposto da direção do texto 
  *column: ordenação  de cima para baixo, em coluna unica 
  *column-reverse: ordenação, de baixo para cima 

  Flex-Wrap

  Propriedade que define se os items devem ou não quebrar de linha, por padrão eles não quebram linhas, isso faz com que os flex itens sejam compactados além do limite do conteúdo. 


  *nowrap : é o padrão, não permite a quebra de linhas 
  *wrap: permita a quebra de linhas assim que um dos flex itens não puder mais ser compactado
  *wrap-reverse: permite a quebra de linha assim que um dos flex itens  não puder mais ser compactado, porém na direção contraria da linha, acima. 

  flex-flow 
  
  É um atalho para as propriedades flex wrap e flex-direction, seu uso não é tão comum, visto que quando  mudamos o flex-direction para column, mantemos o padrao do flex-wrap que é nowrap 

  # Justify-Content 

  Propriedade se encarrega do alinhamento dos itens dentro do container de acordo com a direção pretendida e trata da distrbuição de espaçamento entre eles. 
  Não aplicada caso o item ocupe 100% do espaçamento do container 

  flex-start 
  flex-end
  center
  space-between 
  space-around 


  # Align-Items 

  Trata do alinhamento dos flex itens de acordo com o eixo do container.
  O alinhamento é diferente  para quando os itens estão em colunas ou linhas. 
  permite o alinhamento central no eixo vertical.

  - tipos de alinhamento: 
  center: alinhamento dos itens ao centro
  stretch: padrão, e os flex itens cresçam igualmente
  flex-Start: alinhamento dos itens no inicio do container
  flex-end: alinhamento dos itens no final do container
  baseline: alinhamento de acordo com a linha base da tipografia dos itens 


 # Align-content

 É a propriedade responsavel por tratar o alinhamento  das linhas do container em relação ao eixo vertical do container. 

Neste caso é necessario que o container: 
  - Utilize quebra de linhas (wrap)
  - A altura seja maior que a soma  das linhas dos itens

tipos de alinhamento do container

center: alinhamento dos itens ao centro
stretch: padrão, e os flex itens cresçam igualmente
flex-start: alinhamento dos itens no inicio do container
flex-end: alinhamento dos itens no final do container
space-between: cria um espaçamento igual entre os itens do container
space-around: os espalamentos do meio são duas vezes maiores que o inicial e final


## Flex items

flex-grow: define a proporcionalidade de ccrescimento dos itens, respeitando o tamanho dos conteudos internos. 
Não funciona junto ao "justify-content" no container. 


flex-basis: é a propriedade que estabalece o tamanho inicial do item antes das distribuições de espaço restante dentro deles, usando como base o conteudo interno disposto
auto: caso o item não tenha tamanho, este sera propocional ao conteudo do item. 
px, %, em, ...: são valores  exatos previamente definidos. 
0 (zero): tera relação com a definição do flex-grow 


flex-shrink

É a propriedade que estabelece a capacidade  de redução ou compreensão  do tamanho de um item

flex 
Esta propriedade é uma atalho ou abreviação  de escrita para as propriedades grow, shrink e basis.


Order: 
Cria uma ordenação paralela para os itens atraves do CSS.
