CREATE TABLE departments_t 
   (d_no    NUMBER,
    mgr_ref REF employees_typ SCOPE IS employees_obj_t);

CREATE TABLE departments_t (
    d_no NUMBER,
    mgr_ref REF employees_typ 
       CONSTRAINT mgr_in_emp REFERENCES employees_obj_t);