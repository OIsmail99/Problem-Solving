# Write your MySQL query statement below
with sol as (select class, count(student) as num_of_students
from Courses
group by class
having num_of_students >= 5)
select class from sol; 
