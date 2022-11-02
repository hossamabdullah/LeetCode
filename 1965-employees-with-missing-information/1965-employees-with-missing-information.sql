# Write your MySQL query statement below
(select s.employee_id as employee_id from Employees as e
RIGHT JOIN  Salaries as s ON e.employee_id = s.employee_id
WHERE e.name is null
UNION
select e.employee_id as  employee_id from Employees as e
LEFT JOIN  Salaries as s ON e.employee_id = s.employee_id
WHERE s.salary is null)
order by employee_id asc;