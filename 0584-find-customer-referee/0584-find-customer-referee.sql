# Write your MySQL query statement below
-- != or <> (not equal to) removes the nulls
select name from Customer where referee_id != 2 or referee_id is null;