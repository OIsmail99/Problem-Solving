# Write your MySQL query statement below
# get the max salary for each department
# join on it
select d.name as Department, e.name as Employee, e.salary as Salary from
Employee e join Department d ON e.departmentId = d.id 
WHERE e.salary
= (select max(e2.salary) from Employee e2 where e2.departmentId = e.departmentId);