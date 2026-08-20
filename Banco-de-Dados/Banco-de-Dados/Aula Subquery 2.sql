set search_path to sistema_pedidos_professor;

-- subconsulta nao correlacionada
-- produtos abaixo da media
select * from produto 
where valor_unitario < (
	select avg(valor_unitario) from produto
);

-- subconsulta correlacionada
select 
	c.nome as categoria,
	(
		select count(*) from produto p
		where p.categoria_id = c.id_categoria -- c pertence a cliente "Consulta Externa"
	) as total_itens
from categoria c;

-- correlacionado
select
	c.nome as cliente,
	(
		select count(*) from pedido p
		where c.id_cliente = p.cliente_id -- esta na tabela cliente consulta externa
	) as total_pedidos
from cliente c;

-- operador EXISTS
--Operador de comparacao
--Verifica se existe uma linha correspondente

select * from categoria c
where exists ( -- se existe linha correspondente
	select 1 from produto p
	where c.id_categoria = p.categoria_id
);

-- NOT EXISTS
select * from categoria c
where not exists ( -- se existe linha correspondente
	select 1 from produto p
	where c.id_categoria = p.categoria_id
);

--
select * from categoria c
where c.id_categoria in (
select p.categoria_id
from produto p);

-- Exercicio Listar todos os produtos que nunca foram vendidos

select 
	*
from produto p
where not exists (
		select 1
		from detalhe_pedido dp
		where dp.produto_id = p.id_produto
);

-- ANY
--Operador de comparacao
-- se pelo menos um valor deu true

select * from produto 
where valor_unitario > any --pelo menos 1
(
	select 
		valor_unitario
	from produto
	where categoria_id = 14 -- valor unitario > 1500 ou > 4500
);

-- Desaffio exists
-- Liste os produtos onde preco seja maior que pelo menos um produto da categoria = 1

select * from produto
where valor_unitario > any --pelo menos 1
(
	select 
		valor_unitario
	from produto
	where categoria_id = 1
);


-- ALL
-- todas as condicoes precisam ser true

select * from produto
where valor_unitario > all
(
	select 
		valor_unitario
	from produto
	where categoria_id = 1
);

-- Liste todos os produtos cujo preco seja menor que todos oa produtos da categoria 5

select * from categoria;

select * from produto
where valor_unitario > all
(
	select 
		valor_unitario
	from produto
	where categoria_id = 5 
);








































