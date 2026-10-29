# Write your MySQL query statement below
select  eun.unique_id , e.name
from Employees e left join EmployeeUNI eun
on e.id=eun.id;