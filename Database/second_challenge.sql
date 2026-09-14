--Question 1. Get all invoice ids with the customers first name, last name, and the invoice total
SELECT invoice.invoice_id,customer.first_name,customer.last_name,invoice.total
FROM invoice
JOIN customer
ON invoice.customer_id = customer.customer_id;

--Question 2.Print the invoice id, customer's first name, and invoice total. But only if the invoice is over $30.
SELECT invoice.invoice_id,customer.first_name,invoice.total
FROM invoice
JOIN customer
ON invoice.customer_id = customer.customer_id
WHERE invoice.total > 30;


-- Question 3. Get all the invoices for USA customers in the last 6 months. Use a CTE. 
WITH usa AS (
    SELECT
        invoice.*,
        customer.first_name,
        customer.last_name,
        customer.country
    FROM customer
    JOIN invoice
        ON invoice.customer_id = customer.customer_id
    WHERE customer.country = 'USA'
      AND invoice.invoice_date >= CURRENT_DATE - INTERVAL '6 months'
)

SELECT *
FROM usa;