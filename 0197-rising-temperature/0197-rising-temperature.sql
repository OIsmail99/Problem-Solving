# Write your MySQL query statement below
-- select id as Id from Weather w 
-- where w.temperature > (
--     select wi.temperature from Weather wi 
--     where DATEDIFF(wi.recordDate,w.recordDate) = 1
--     );

SELECT w.id AS Id 
FROM Weather w 
WHERE w.temperature > (
    SELECT wi.temperature 
    FROM Weather wi 
    WHERE DATEDIFF(w.recordDate, wi.recordDate) = 1
);