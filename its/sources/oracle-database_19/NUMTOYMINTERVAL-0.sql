SELECT last_name, hire_date, salary,
       SUM(salary) OVER (ORDER BY hire_date 
       RANGE NUMTOYMINTERVAL(1,'year') PRECEDING) AS t_sal 
  FROM employees
  ORDER BY last_name, hire_date;