SELECT last_name, department_name 
   FROM employees@remote, departments
   WHERE employees.department_id = departments.department_id;