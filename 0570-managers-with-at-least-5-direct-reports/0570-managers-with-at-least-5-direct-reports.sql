# Write your MySQL query statement below
#Write a solution to find managers with at least five direct reports.
SELECT m.name
from employee e 
join employee m 
on m.id = e.managerId
group by m.id
having count(*) >= 5;