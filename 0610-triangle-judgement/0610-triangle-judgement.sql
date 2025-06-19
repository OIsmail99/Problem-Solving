# Write your MySQL query statement below
-- the triangle inequality states that for any triangle, the sum of the lengths of any two sides must be greater than or equal to the length of the remaining side.
select x, y, z, 
case when (x + y) > z and (x+z) > y and (y+z) > x then "Yes" else "No" end as triangle
from Triangle;