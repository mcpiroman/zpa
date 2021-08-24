SELECT department_name, CURSOR(SELECT salary, commission_pct 
   FROM employees e
   WHERE e.department_id = d.department_id)
   FROM departments d
   ORDER BY department_name;