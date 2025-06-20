# Write your MySQL query statement below
select r.contest_id, 
ROUND(count(r.user_id) / (select count(*) from Users) * 100,2) as percentage
from Register r
left join Users u
on u.user_id = r.user_id
group by r.contest_id
order by percentage desc, r.contest_id asc;

-- select r.contest_id, (count(r.user_id) / count(u.user_id)) * 100 as percentage
-- from Register r
-- left join Users u
-- on u.user_id = r.user_id
-- group by r.contest_id; 