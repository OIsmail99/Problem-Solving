# Write your MySQL query statement below
-- Write a solution to find the average selling price for each product. average_price should be rounded to 2 decimal places. If a product does not have any sold units, its average selling price is assumed to be 0.
-- Return the result table in any order.
-- average selling price = selling prices / count(selling prices)

-- selling prices of each product
-- select u.product_id, sum((u.units * p.price)) as total_price
-- from UnitsSold u
-- join Prices p
-- on u.product_id = p.product_id and(u.purchase_date between p.start_date and p.end_date)
-- group by u.product_id;


select p.product_id, coalesce(round(sum((u.units * p.price)) / sum(u.units),2),0)  as average_price
from Prices p
left join UnitsSold u
on u.product_id = p.product_id and(u.purchase_date between p.start_date and p.end_date)
group by p.product_id;