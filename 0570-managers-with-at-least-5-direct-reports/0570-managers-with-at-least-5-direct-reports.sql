# Write your MySQL query statement below
#Write a solution to find managers with at least five direct reports.
SELECT mgr.name
from employee emp 
inner join employee mgr 
on mgr.id = emp.managerId
group by mgr.id
having count(*) >= 5;