# Write your MySQL query statement below
-- If the customer's preferred delivery date is the same as the order date, then the order is called immediate. The first order of a customer is the order with the earliest order date that the customer made. It is guaranteed that a customer has precisely one first order. 
-- Write a solution to find the percentage of immediate orders in the first orders of all customers, rounded to 2 decimal places.

-- getting the first order of each customer
with first_orders as(
select customer_id,
min(order_date) as first_order
from Delivery
group by customer_id
)
select ROUND(AVG(order_date = customer_pref_delivery_date) * 100, 2) as immediate_percentage
from Delivery
join first_orders 
on first_orders.customer_id = Delivery.customer_id 
and Delivery.order_date = first_orders.first_order;