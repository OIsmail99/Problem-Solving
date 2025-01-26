# Write your MySQL query statement below
#find the number of times each student attended each exam.
SELECT s.student_id, s.student_name, sub.subject_name, count(e.subject_name) as attended_exams
FROM Students s join Subjects sub
left join examinations e on s.student_id = e.student_id AND sub.subject_name = e.subject_name
group by 1,3
order by 1,3;

