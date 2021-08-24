SELECT LPAD(' ',2*(LEVEL-1)) || last_name org_chart, 
        employee_id, manager_id, job_id
    FROM employees
    START WITH job_id = 'AD_VP' 
    CONNECT BY PRIOR employee_id = manager_id; 