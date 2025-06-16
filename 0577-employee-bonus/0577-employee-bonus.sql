-- # Write your MySQL query statement below
-- select e.name, b.bonus
-- from Employee e
-- left join Bonus b
-- ON e.empId = b.empId and b.bonus < 1000;

-- select e.name, b.bonus
-- from employee e left join bonus b on e.empid = b.empid
-- where b.bonus < 1000 or bonus is null










select e.name, b.bonus
from Employee e
left join Bonus b
on e.empId = b.empId
where bonus < 1000 or bonus is null;

