# Write your MySQL query statement below
with oners as(
    select employee_id, count(*) as ctn
    from Employee
    group by employee_id
    having ctn = 1
)
select employee_id, department_id
from Employee
where primary_flag="Y" or employee_id in (select employee_id from oners);