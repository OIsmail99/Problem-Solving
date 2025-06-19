# Write your MySQL query statement below
select (
select salary as SecondHighestSalary 
from Employee
where salary < (
select max(salary) as highestSalary
from Employee)
order by salary desc
limit 1) as SecondHighestSalary
from dual;