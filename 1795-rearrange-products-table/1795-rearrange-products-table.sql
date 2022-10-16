# Write your MySQL query statement below
select product_id,  if(store1 is not null, 'store1', null) as store, sum(store1) as price from Products where store1 is not null group by product_id, store
union
select product_id,  if(store2 is not null, 'store2', null) as store, sum(store2) as price from Products where store2 is not null group by product_id, store
union
select product_id,  if(store3 is not null, 'store3', null) as store, sum(store3) as price from Products where store3 is not null group by product_id, store;