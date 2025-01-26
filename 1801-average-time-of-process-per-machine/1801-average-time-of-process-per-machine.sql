# Write your MySQL query statement below
select machine_id, 
ROUND(
    avg(case when activity_type='end' then timestamp end)-
    avg(case when activity_type='start' then timestamp end), 
    3) 
    as processing_time
from Activity
group by machine_id
-- average of end timestamps - average of start timestamps == average processing time == end - start / number of processes.