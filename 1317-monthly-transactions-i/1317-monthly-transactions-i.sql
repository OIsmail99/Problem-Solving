# Write your MySQL query statement below
select date_format(trans_date, '%Y-%m') as month,
country,
count(*) as trans_count, -- check
sum(case when state="approved" then 1 else 0 end) as approved_count, -- check
sum(amount) as trans_total_amount, -- check
coalesce(sum(case when state="approved" then amount end), 0) as approved_total_amount 
from Transactions
group by month, country;