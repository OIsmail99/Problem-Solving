# Write your MySQL query statement below
select p.product_name, 
sum(unit) as unit
from Products p
join Orders o
on p.product_id = o.product_id and o.order_date between "2020-02-1" and "2020-02-29"
group by p.product_id
having unit >= 100;