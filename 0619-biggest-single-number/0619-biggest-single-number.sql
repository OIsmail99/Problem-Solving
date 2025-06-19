# Write your MySQL query statement below
with duplicate_numbers as(
    select num, count(*) as ctn from MyNumbers
    group by num
    having ctn > 1
)
select max(num) as num 
from MyNumbers
where num not in (select num from duplicate_numbers);