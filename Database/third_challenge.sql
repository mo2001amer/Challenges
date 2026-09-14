--1 Create a new table called record_logs
--   Fields: log_id, record_id, field_changed, last_update, old_value, new_value
CREATE TABLE record_logs(
    log_id SERIAL PRIMARY Key,
    record_id INT,
    field_changed VARCHAR(100),
    last_update DATE,
    old_value TEXT,
    new_value TEXT



)






--Create a trigger that tracks changes to customer records and logs the changes in our new table
CREATE OR REPLACE FUNCTION log_customer_changes()
RETURNS TRIGGER
AS $$
BEGIN

    IF OLD.first_name <> NEW.first_name THEN
        INSERT INTO record_logs
        (record_id, field_changed, last_update, old_value, new_value)
        VALUES
        (OLD.customer_id, 'first_name', CURRENT_TIMESTAMP, OLD.first_name, NEW.first_name);
    END IF;

    IF OLD.last_name <> NEW.last_name THEN
        INSERT INTO record_logs
        (record_id, field_changed, last_update, old_value, new_value)
        VALUES
        (OLD.customer_id, 'last_name', CURRENT_TIMESTAMP, OLD.last_name, NEW.last_name);
    END IF;

    IF OLD.country <> NEW.country THEN
        INSERT INTO record_logs
        (record_id, field_changed, last_update, old_value, new_value)
        VALUES
        (OLD.customer_id, 'country', CURRENT_TIMESTAMP, OLD.country, NEW.country);
    END IF;

    RETURN NEW;

END;
$$ LANGUAGE plpgsql;