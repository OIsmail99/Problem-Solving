# Write your MySQL query statement
delete p2
from Person p1 
inner join Person p2
on p1.email = p2.email and p1.id < p2.id;