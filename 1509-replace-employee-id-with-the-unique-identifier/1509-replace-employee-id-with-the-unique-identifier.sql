# Write your MySQL query statement below
select eu.unique_id, e.name 
from EmployeeUNI eu 
right join Employees e 
ON eu.id = e.id; 

--  | employeeUNI | employee name (all) 