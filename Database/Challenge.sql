--QUESTION 1
SELECT * FROM customer;


-- QUESTION 2
SELECT * FROM customer WHERE state = 'AZ';



-- QUESTION 3
SELECT * FROM invoice WHERE invoice_date< CURRENT_DATE - INTERVAL '6 months' ;


--QUESTION 4
SELECT * FROM track WHERE milliseconds < 180000;


-- QUESTION 5 
UPDATE customer 
SET country = 'USA' , address = NULL , city = NULL , state = NULL 
WHERE country != 'USA';


-- QUESTION 6

CREATE OR REPLACE FUNCTION total_spending(total_customer_id INT)
RETURNS NUMERIC
AS $$
DECLARE
    res NUMERIC;
BEGIN
    SELECT SUM(total)
    INTO res
    FROM invoice
    WHERE customer_id = total_customer_id;

    RETURN res;
END;
$$ LANGUAGE plpgsql;


--QUESTION 7 
--Given an employee_id + new_manager_id, create a stored procedure to update an Employee’s ReportsTo field.
--Prevent an employee reporting to themselves, reporting to a non-existence employee

CREATE OR REPLACE PROCEDURE upd_emp(p_employee_id INT, p_new_manager_id INT)
LANGUAGE plpgsql;
AS $$ 
BEGIN
    
    IF NOT EXISTS(
        SELECT 1
        FROM employee
        WHERE employee_id = p_employee_id


    )
    THEN RAISE EXCEPTION 'EMPLOYEE DOES NOT EXSIT';
    END IF;

    IF p_employee_id = p_new_manager_id THEN
        RAISE EXCEPTION 'An employee cannot report to themselves';
    END IF;


    IF NOT EXISTS (
        SELECT 1
        FROM employee
        WHERE employee_id = p_new_manager_id
    ) THEN
        RAISE EXCEPTION 'Manager does not exist';
    END IF;


    UPDATE employee
    SET reports_to = p_new_manager_id
    WHERE employee_id = p_employee_id;

END;
$$;

--QUESTION 8: Create a new schema: pets
--Create two related tables: Customer + Pets
--Demonstrate populating records into these tables

CREATE SCHEMA pets;
CREATE TABLE pets.customer
(   
    name VARCHAR(50),
    id INT PRIMARY KEY,
    spent NUMERIC

);

CREATE TABLE pets.PETS(
    name VARCHAR(50),
    type VARCHAR(50),
    color VARCHAR
    customer_id INT REFERENCES pets.customer(id)
);
