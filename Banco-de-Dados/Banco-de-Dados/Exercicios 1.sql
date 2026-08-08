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











