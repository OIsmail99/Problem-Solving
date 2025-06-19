# Write your MySQL query statement below
select p.project_id, ROUND(sum(e.experience_years) / count(e.experience_years), 2) AS average_years
from Project p
inner join Employee e
on p.employee_id = e.employee_id
group by p.project_id;