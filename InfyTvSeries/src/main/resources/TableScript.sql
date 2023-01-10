DROP SCHEMA IF EXISTS infy_tv_db;

CREATE SCHEMA infy_tv_db;
USE infy_tv_db;
   
create table user(
    registration_id INT AUTO_INCREMENT,
	user_name VARCHAR(50) not null,
	email VARCHAR(50) not null,
	reg_date date not null,
	series_type VARCHAR(50) not null,
	series_name VARCHAR(50) not null,
	
	
   CONSTRAINT ps_registration_id_pk PRIMARY KEY (registration_id)
);





INSERT INTO user VALUES(1001,'Mark Wood','Markwood29@infy.com',sysdate(),'Hindi','Doremon');

INSERT INTO user VALUES(1002,'Glen Phillips','Glenphillips34@gmail.com',sysdate(),'English','Pokemon');



commit;

select * from user;

