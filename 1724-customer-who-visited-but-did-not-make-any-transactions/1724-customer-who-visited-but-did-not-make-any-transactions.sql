# Write your MySQL query statement below
SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
FROM Visits v
WHERE v.visit_id NOT IN (select visit_id from Transactions)
GROUP BY v.customer_id;
-- ON v.visit_id = t.visit_id AND t.transaction_id IS NULL