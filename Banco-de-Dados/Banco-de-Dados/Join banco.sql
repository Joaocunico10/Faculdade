set search_path to sistema_pedidos;

select count(*) from cliente;

select sum(valor_unitario) from detalhes_pedido;

select round(avg(valor_unitario), 2) as media_produto from produto;

select min(valor_unitario) as produto_mais_barato,
	max(valor_unitario) as produto_mais_caro from produto;

select categoria_id as categoria,
	min(valor_unitario) as mais_barato,
	max(valor_unitario) as mais_caro
from produto
group by categoria_id
order by categoria_id desc;

select 
	cliente.nome as  cliente,
	pedido.id_pedido,
	pedido.data_pedido
from cliente
inner join pedido
	on cliente.id_cliente = pedido.cliente_id;

select
	c.nome as nome_categoria,
	p.nome as produto
from categoria c
inner join produto p
	on c.id_categoria = p.categoria_id;

select 
	c.nome as cliente,
	p.valor as total_compra
from cliente as c -- tabela esquerda
left join pedido p -- tabela direita
	on c.id_cliente = p.cliente_id;

select 
	c.nome as cliente,
	pedido.data_pedido
from cliente as c
left join pedido
	on c.id_cliente = pedido.cliente_id;

select 
	c.nome as categoria,
	p.nome as produto
from categoria c
left join produto p
	on c.id_produto = p.cliente_id;



















	