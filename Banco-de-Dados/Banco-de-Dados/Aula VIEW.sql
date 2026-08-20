
set search_path to sistema_pedidos_professor;

--------------------------------
-- Por que usar views?
--------------------------------
-- Tabelas "Virtuais"
-- Otimizacao para consultas

create view vw_itens_categoria 
as 
select 
	c.nome as categoria,
	(
		select
			count(p.id_produto)
		from produto p
		where p.categoria_id = c.id_categoria
	) as total_itens
from categoria c;

select * from vw_itens_categoria;

select categoria from visao_categoria_itens;
where total_itens < 10;

---------------------------
-- atualiza automaticamente
---------------------------

insert into produto(nome, valor_unitario, categoria_id)
values('Pijama Azul P', 69.60,12), ('Pijama Rosa P', 74.10,12), ('Pijama Rosa G', 74.10,12);

-----------------------------
-- ALTER VIEW
-----------------------------

alter view vw_itens_categoria rename to visao_categoria_itens;

alter view visao_categoria_itens rename column total_itens to 


-- EXERCICIO VIEW
create view vw_vendas
as
select
	c.id_cliente,
	c.nome,
	pe.data_pedido,
	sum(dp.quantidade * dp.valor_unitario) as valor_compra
from cliente c
inner join pedido pe
	on pe.cliente_id = c.id_cliente
inner join detalhe_pedido dp
	on dp.pedido_id = pe.id_pedido
group by c.nome, c.id_cliente, pe.data_pedido
order by c.id_cliente asc;

select * from vw_vendas;

drop view vw_vendas;

--------------------------------------
-- Por que usar view materializadas?
--------------------------------------
-- performanca
-- resulta fica armazenado
-- porem nao atualiza

create materialized view mv_vendas
as 
select 
	c.nome as categoria,
	(
		select
			count(p.id_produto)
		from produto p
		where p.categoria_id = c.id_categoria
	) as total_itens
from categoria c;

select * from mv_vendas;

refresh materialized view mv_vendas;

-- EXERCICIO MATERIALIZED VIEW
create materialized view mv_unidades_vendidas
as
select
	pr.nome,
	(
		select
			sum(dp.produto_id)
		from detalhe_pedido dp
		where dp.produto_id = pr.id_produto
	) as qtd_vendidas
from produto pr;

select * from mv_unidades_vendidas;










	