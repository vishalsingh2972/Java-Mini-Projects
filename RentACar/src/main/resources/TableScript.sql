DROP SCHEMA IF EXISTS car_rental_db;

CREATE SCHEMA car_rental_db;
USE car_rental_db;
   
create table rental(
	rental_id INT AUTO_INCREMENT,
	car_type VARCHAR(20) not null,
	booking_start_date date not null,
	duration INT not null,
	customer_name VARCHAR(50) not null,
	mobile_number BIGINT not null,
	
   CONSTRAINT ps_rental_id_pk PRIMARY KEY (rental_id)
);





INSERT INTO rental VALUES(1001,'Electric',sysdate(), 22,'Richard' ,7895490369);
INSERT INTO rental VALUES(1002,'Manual',sysdate(), 28,'Reece Topley', 8906587239);
INSERT INTO rental VALUES(1003,'Electric',sysdate(), 26,'Glen Maxwell', 6579083456);
INSERT INTO rental VALUES(1004,'Automatic',sysdate(), 14,'Andrew Tye',9873478075);
INSERT INTO rental VALUES(1005,'Manual',sysdate(), 3,'Ross Taylor',6540983458);
INSERT INTO rental VALUES(1006,'Automatic',sysdate(), 18,'Richard', 8924894885);



commit;

select * from rental;

