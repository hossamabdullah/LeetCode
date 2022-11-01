# Write your MySQL query statement below
select employee_id from
(select s.employee_id as employee_id from Employees as e
RIGHT JOIN  Salaries as s ON e.employee_id = s.employee_id
WHERE e.name is null
UNION
select e.employee_id as  employee_id from Employees as e
LEFT JOIN  Salaries as s ON e.employee_id = s.employee_id
WHERE s.salary is null) as emp_data
order by employee_id asc;