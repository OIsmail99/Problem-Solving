# Write your MySQL query statement below
-- Write a solution to find the number of times each student attended each exam.
-- Return the result table ordered by student_id and subject_name.
SELECT s.student_id, s.student_name, sub.subject_name, count(e.student_id) as attended_exams
FROM Students s
CROSS JOIN Subjects sub
LEFT JOIN Examinations e
ON s.student_id = e.student_id and sub.subject_name = e.subject_name
GROUP BY 1,2,3
order by 1,3;







