set search_path to sistema_pedidos_professor;

-- subquery

select * from produto 
where valor_unitario = (select max(valor_unitario) from produto);

select * from produto
where valor_unitario = (select min(valor_unitario) from produto);

-- subquery dentro do select

select 
	c.nome as cliente,
	(
		select 
			count(pe.cliente_id)
		from pedido pe
		where pe.cliente_id = c.id_cliente		
	) as total_pedidos
from cliente c;

-- Exercicio 1
select 
	ca.nome,
	(
		select
			count(pr.categoria_id)
		from produto pr
		where pr.categoria_id = ca.id_categoria
	) as total_produto_categoria
from categoria ca;

-- Exercicio 2
select 
	c.nome as cliente,
	(
		select 
			sum(dp.valor_unitario * dp.quantidade)
		from pedido pe
		inner join detalhe_pedido dp
			on pe.id_pedido = dp.pedido_id
		where c.id_cliente = pe.cliente_id
	) as total_gasto
from cliente c;

-----
-- from
select *
from (
	select 
		categoria_id,
		round(avg(valor_unitario), 2) as media
	from produto
	group by categoria_id
) as resumo
where media < 100;

--Exercicio 3 - Tabela Derivada
select *
from (
		select 
			pe.cliente_id as "Numero cliente",
			c.CPF as "CPF",
			c.nome as "Cliente", 
			count(pe.cliente_id) as "Total pedidos"
		from cliente c
		inner join pedido pe
			on c.id_cliente = pe.cliente_id
		group by 
			pe.cliente_id,
			c.cpf,
			c.nome
		order by pe.cliente_id asc
	) as relatorio;
	

-- Usando IN -> lista in ('valores', 'valores')
-- clientes que nao compraram

select * from cliente
where id_cliente not in(
	select cliente_id 
	from pedido
);






















