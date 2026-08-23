
set search_path to sistema_pedidos;

/*EXERCICIOS SUBQUERY

Exercicio 1
1. Liste todos os pedidos cujo valor total seja maior que a média dos pedidos.*/
SELECT *
FROM detalhe_pedido dp
WHERE dp.valor_unitario > (
    SELECT 
		AVG(dp.valor_unitario) 
    FROM detalhe_pedido dp
)
order by dp.valor_unitario asc;

/*Exercicio 2
2. Liste o nome de cada cliente e o valor total gasto por ele.*/
SELECT 
    c.nome,
    (
        SELECT SUM(dp.valor_unitario * dp.quantidade)
        FROM pedido pe
        INNER JOIN detalhe_pedido dp
            ON dp.pedido_id = pe.id_pedido
        WHERE pe.cliente_id = c.id_cliente
    ) AS total_gasto
FROM cliente c;

-- Exercicio 3
-- 3. Crie uma tabela derivada com a quantidade de pedidos realizados por cliente.
select 
	*
from (
	select
	c.id_cliente,
	c.nome,
	count(pe.id_pedido) as qtd_pedidos
	from pedido pe
	inner join cliente c
		on c.id_cliente = pe.cliente_id
	group by c.id_cliente
	order by c.id_cliente asc
) as quantidade_pedidos;

-- Exercicio 4
-- 4. Crie uma tabela derivada com a quantidade de produtos por categoria.
select *
from (
	select 
		ca.id_categoria,
		ca.nome,
		count(pr.categoria_id) as total_categoria
	from categoria ca
	inner join produto pr
		on pr.categoria_id = ca.id_categoria
	group by ca.id_categoria
	order by total_categoria desc
);

-- Exercicio 5
-- 5. Liste todos os produtos que já foram vendidos.

select 
	pr.nome,
	pr.valor_unitario,
	(
		select
			coalesce(sum(dp.quantidade), 0) as total_vendido
		from detalhe_pedido dp
		where dp.produto_id = pr.id_produto
	) as total_vendido
from produto pr
where exists(
	select 1	
	from detalhe_pedido dp
		where dp.produto_id = pr.id_produto
)
order by total_vendido desc;

-- Exercicio 6
-- 6. Liste o nome de cada produto e o total de unidades vendidas, exibindo apenas os produtos que já foram vendidos.

select 
	pr.nome,
	(
		select 
			coalesce(sum(dp.quantidade), 0) as total_vendido
		from detalhe_pedido dp
		where dp.produto_id = pr.id_produto
	)
from produto pr
where exists(
	select 1	
	from detalhe_pedido dp
		where dp.produto_id = pr.id_produto
);

-- Exercicio 7
-- 7. Liste o nome de cada cliente e a quantidade de pedidos realizados, exibindo apenas aqueles com mais de 5 pedidos.

select
	c.nome,
	(
		select
			count(pe.cliente_id)
		from pedido pe
		where pe.cliente_id = c.id_cliente
	) as total_de_pedidos
from cliente c
where(
	select 
		count
			(pe.cliente_id)
		from pedido pe
		where pe.cliente_id = c.id_cliente
) > 5
order by total_de_pedidos asc;


















