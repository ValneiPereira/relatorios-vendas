# Relatorios-vendas

 Sistema de análise de dados de venda que irá importar lotes de arquivos e produzir 
 um relatório baseado em informações presentes no mesmo.
 Existem 3 tipos de dados dentro dos arquivose eles podem ser distinguidos pelo seu 
 identificador que estará presente na primeira coluna de cada linha, onde o separador de 
 colunas é o caractere “ç”.
 
 Dados do vendedors dados do vendedor possuem o identificador 001e seguem o seguinte formato: 
 - 001çCPFçNameçSalary
 
 Dados do clienteOs dados do cliente possuem o identificador 002 e seguem o seguinte formato: 
 - 002çCNPJçNameçBusiness Area
 
 Dados de vendaOs dados de venda possuem o identificador 003e seguem o seguinte formato: 
 - 003çSale IDç[Item ID-Item Quantity-Item Price]çSalesman name
 
 ## Exemplo de conteúdo total do arquivo:
 - 001ç1234567891234çPedroç50000
 - 001ç3245678865434çPauloç40000.99
 - 002ç2345675434544345çJose da SilvaçRural
 - 002ç2345675433444345çEduardo PereiraçRural
 - 003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro
 - 003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo
 
 ## Execução.
 Para rodar o sistema basta apanas colocar arquivo teste.txt com layout padrão dentro do diretório **HOMEPATH/data/in** apos execução o relatorio sera salvo no direto de saida
**HOMEPATH/data/in**.

No arquivo de saída o sistema deverá possuir os seguintes dados:
- Quantidade de clientes no arquivo de entrada
- Quantidade de vendedores no arquivo de entrada
- ID da venda mais cara
- O pior vendedor
 
 ## Problemas
Poderia adiantar que o problema mais comum visto é em relação cobertura de teste e leitura e gravação dos relatórios.

