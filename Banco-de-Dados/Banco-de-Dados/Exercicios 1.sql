--Lista Joins Basicos - 1

--Exercicio 1
/*
nome produto
categoria produto
*/
set search_path to sistema_pedidos_professor;

select 
	ca.id_categoria,
	ca.nome,
	pr.nome
from categoria ca
inner join produto pr
	on ca.id_categoria = pr.categoria_id
order by ca.nome, pr.nome asc;

/*Exercicio 2
Liste todos os pedidos mostrando o nome do cliente, CPF, e-mail e a data do pedido
(apenas dia, mês e ano).*/
select 
	cl.nome,
	cl.cpf,
	cl.email,
	pe.data_pedido
from cliente cl
inner join pedido pe
	on pe.cliente_id = cl.id_cliente
order by cl.nome asc;

/*3. Para cada pedido, mostre quais produtos foram comprados e a quantidade adquirida.*/
select
	pr.nome as "Nome Produto",
	dp.quantidade as "Qtd Adquirida"
from produto pr
inner join detalhe_pedido dp
	on pr.id_produto = dp.produto_id;

/*4. Liste todos os clientes, o id do pedido e o ano do pedido, inclusive aqueles que nunca
realizaram pedidos. Para clientes sem pedidos, exiba a mensagem "Cliente sem
pedido" nos campos ao invés de null.

c.id, 
id pedido
ano pedido

left join
where pedidos = null = "Cliente sem pedido"
*/	

select 
	c.id_cliente,
	c.nome,
	coalesce(pe.id_pedido::TEXT, 'Cliente sem pedido') as id_pedido,
	coalesce(extract(year from pe.data_pedido)::TEXT, 'Cliente sem pedido') as ano_pedido
from cliente c
left join pedido pe
	on c.id_cliente = pe.cliente_id;

/*5. Liste todos os produtos que nunca foram vendidos.*/
select 
	*
from produto
left join detalhe_pedido dp
	on dp.produto_id = produto.id_produto
where dp.produto_id is null
order by produto.id_produto;

/*6. Liste todos os produtos indicando a quantidade total vendida. Produtos sem venda
devem aparecer com valor 0.

left join
*/
select
	pr.nome,
	coalesce((dp.quantidade), 0) as "Qtd Comprada",
	coalesce((dp.valor_unitario), 0) as "Valor pago",
	coalesce((dp.quantidade * dp.valor_unitario), 0) as "Total gasto"
from produto pr
left join detalhe_pedido dp
	on  pr.id_produto = dp.produto_id
group by pr.id_produto, pr.nome, dp.quantidade, dp.valor_unitario
order by "Total gasto" desc;

/*7. Calcule o valor total de cada pedido.*/
select
	pr.nome,
	coalesce((dp.quantidade * dp.valor_unitario), 0) as "Total Pedido"
from produto pr
inner join detalhe_pedido dp
	on pr.id_produto = dp.produto_id
order by pr.nome asc;

/*8. Liste todos os produtos vendidos mostrando o nome do produto e a quantidade total
comercializada.*/

select 
	pr.nome,
	sum(dp.quantidade) as "Qtd Vendida"
from produto pr
inner join detalhe_pedido dp
	on dp.produto_id = pr.id_produto
group by pr.nome
order by pr.nome asc;

/*9. Exiba a média de preço dos produtos por categoria.*/
select 
	ca.id_categoria,
	ca.nome,
	round(avg(pr.valor_unitario), 2) as "Media Preco por Categoria"
from categoria ca
inner join produto pr
	on pr.categoria_id = ca.id_categoria
group by ca.id_categoria, ca.nome
order by ca.id_categoria asc;

/*10. Mostre quantos produtos existem em cada categoria.*/
select
	ca.id_categoria,
	ca.nome, 
	count(pr.categoria_id) as "Total de produtos por categoria"
from categoria ca
inner join produto pr
	on pr.categoria_id = ca.id_categoria
group by ca.id_categoria, ca.nome
order by ca.id_categoria;

/*11. Exiba os consumidores que realizaram mais de 2 pedidos.*/

select
	c.id_cliente,
	c.nome,
	count(pe.id_pedido) as "Qtd pedidos"
from cliente c
inner join pedido pe
	on pe.cliente_id = c.id_cliente
group by c.id_cliente, c.nome
having count(pe.id_pedido) > 2;

/*12. Liste os pedidos que possuem menos de três produtos diferentes.

id_pedido
count produto
from pedido pe
join dp
 on id_pe = dp_id

*/

select
	pe.id_pedido,
	count(distinct dp.produto_id) as "Qtd produtos"
from pedido pe
inner join detalhe_pedido dp
	on dp.pedido_id = pe.id_pedido
group by pe.id_pedido
having count(distinct dp.produto_id) < 3;

/*13. Exiba a categoria com o maior número de produtos cadastrados.
ca.id
count categoria_id

*/
select
	ca.id_categoria,
	ca.nome,
	count(pr.categoria_id) as "Total Produtos"
from categoria ca
inner join produto pr
	on pr.categoria_id = ca.id_categoria
group by ca.id_categoria, ca.nome
order by count(pr.categoria_id) desc;


set search_path to sistema_pedidos_professor;

/*14. Mostre os produtos que foram vendidos em mais de 3 pedidos diferentes.*/

select
	pr.id_produto,
	pr.nome,
	count(distinct dp.pedido_id) as "Qtd Pedidos"
from produto pr
inner join detalhe_pedido dp
	on dp.produto_id = pr.id_produto
group by pr.id_produto, pr.nome
having count(distinct dp.pedido_id) > 3;

/*15. Liste o nome de cada cliente, a quantidade total de itens comprados e o valor total
gasto.

c.nome
count(dp.quantidade)
qtd * valor_unitario

*/

select
	c.id_cliente,
	c.nome as "Nome Cliente",
	sum(dp.quantidade) as "Quantidade Total Comprada",
	sum(dp.quantidade * dp.valor_unitario) as "Total gasto"
from cliente c
inner join pedido pe
	on pe.cliente_id = c.id_cliente
inner join detalhe_pedido dp
	on dp.pedido_id = pe.id_pedido
group by c.id_cliente
order by c.id_cliente asc;

/*16. Exiba cada categoria informando:
• quantidade de produtos cadastrados;
• quantidade total vendida;
• faturamento da categoria.

ca.nome
count(pr.categoria_id)
dp.qtd
qtd * valor categoria
*/

select
	ca.id_categoria,
	ca.nome as "Categoria",
	count(pr.categoria_id) as "Total Produtos Categoria",
	coalesce(sum(dp.quantidade), 0) as "Qtd Total Vendida",
	coalesce(sum(dp.quantidade * dp.valor_unitario), 0) as "Total Faturado"
from categoria ca
left join produto pr
	on ca.id_categoria = pr.categoria_id
left join detalhe_pedido dp
	on dp.produto_id = pr.id_produto
group by ca.id_categoria
order by "Total Faturado" desc;

/*17. Liste os clientes, número do pedido, nome do produto, quantidade e valor total do item
que compraram produtos da categoria 'Pet Shop & Bem-Estar Animal'.

c.id
c.nome
pe.id
pr.nome
dp.qtd and qp.valor_unico
where ca.id = 8 ou having ca.id = 8

*/

select
	ca.id_categoria as "Categoria",
	ca.nome as "Nome Categoria",
	c.id_cliente,
	c.nome as "Nome Cliente",
	pe.id_pedido as "Numero pedido",
	pr.nome as "Nome Produto",
	dp.quantidade as "Quantidade",
	dp.valor_unitario as "Valor Unitario",
	dp.quantidade * dp.valor_unitario as "Total gasto"
from cliente c
inner join pedido pe
	on c.id_cliente = pe.cliente_id
inner join detalhe_pedido dp
	on dp.pedido_id = pe.id_pedido
inner join produto pr
	on pr.id_produto = dp.produto_id
inner join categoria ca
	on ca.id_categoria = pr.categoria_id
where ca.id_categoria = 8
order by c.nome asc;

/*18. Exiba os 5 produtos mais vendidos, informando também a categoria de cada produto.
ca.id
ca.nome
sum(dp.qtd)

join pr ca.id
join dp

*/

select
	ca.id_categoria,
	ca.nome as "Nome Categoria",
	pr.nome,
	sum(dp.quantidade) as "Total Vendido"
from categoria ca
inner join produto pr
	on ca.id_categoria = pr.categoria_id
inner join detalhe_pedido dp
	on dp.produto_id = pr.id_produto
group by ca.id_categoria, pr.nome
order by "Total Vendido" desc
limit 5;

/*19. Para cada categoria, exiba o produto mais caro cadastrado, mostrando o nome da
categoria, o nome do produto e seu preço.

ca.id
ca.nome
pr.nome
pr.valor_unitario,
max(pr.valor)
*/

select
	ca.id_categoria,
	ca.nome as "Nome categoria",
	pr.nome as "Nome Produto",
	pr.valor_unitario as "Valor Mais Caro"
from categoria ca
inner join produto pr
	on ca.id_categoria = pr.categoria_id
where pr.valor_unitario = (
	select 
		max(pr.valor_unitario)
	from produto pr
	where pr.categoria_id = ca.id_categoria
)
order by ca.id_categoria asc;

/*20. Exiba o nome de cada produto, sua categoria, a quantidade total vendida e o
faturamento gerado por esse produto.

ca.nome
pr.nome
sum(dp.qtd)
qtd * valor

*/

select 
	ca.nome as "Nome Categoria",
	pr.nome as "Nome Produto",
	sum(dp.quantidade) as "Qtd Vendida",
	sum(dp.quantidade * dp.valor_unitario) as "Faturamento Total"
from categoria ca
inner join produto pr
	on pr.categoria_id = ca.id_categoria
inner join detalhe_pedido dp
	on pr.id_produto = dp.produto_id
group by ca.nome, pr.nome
order by "Faturamento Total" desc;



































































set search_path to sistema_pedidos_professor;