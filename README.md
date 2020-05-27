# Relatorios-vendas

 Sistema de an�lise de dados de venda que ir� importar lotes de arquivos e produzir 
 um relat�rio baseado em informa��es presentes no mesmo.
 Existem 3 tipos de dados dentro dos arquivose eles podem ser distinguidos pelo seu 
 identificador que estar� presente na primeira coluna de cada linha, onde o separador de 
 colunas � o caractere ��.
 
 Dados do vendedors dados do vendedor possuem o identificador 001e seguem o seguinte formato: 
 - 001�CPF�Name�Salary
 
 Dados do clienteOs dados do cliente possuem o identificador 002 e seguem o seguinte formato: 
 - 002�CNPJ�Name�Business Area
 
 Dados de vendaOs dados de venda possuem o identificador 003e seguem o seguinte formato: 
 - 003�Sale ID�[Item ID-Item Quantity-Item Price]�Salesman name
 
 ## Exemplo de conte�do total do arquivo:
 - 001�1234567891234�Pedro�50000
 - 001�3245678865434�Paulo�40000.99
 - 002�2345675434544345�Jose da Silva�Rural
 - 002�2345675433444345�Eduardo Pereira�Rural
 - 003�10�[1-10-100,2-30-2.50,3-40-3.10]�Pedro
 - 003�08�[1-34-10,2-33-1.50,3-40-0.10]�Paulo
 
 ## Execu��o.
 Para rodar o sistema basta apanas colocar arquivo teste.txt com layout padr�o dentro do diret�rio **HOMEPATH/data/in** apos execu��o o relatorio sera salvo no direto de saida
**HOMEPATH/data/in**.

No arquivo de sa�da o sistema dever� possuir os seguintes dados:
- Quantidade de clientes no arquivo de entrada
- Quantidade de vendedores no arquivo de entrada
- ID da venda mais cara
- O pior vendedor
 
 ## Problemas
Poderia adiantar que o problema mais comum visto � em rela��o cobertura de teste e leitura e grava��o dos relat�rios.

