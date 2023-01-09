DROP SCHEMA IF EXISTS patient_db;

CREATE SCHEMA patient_db;
USE patient_db;
   
create table patient(
	patient_id INT AUTO_INCREMENT,
	patient_name VARCHAR(50) not null,
	gender VARCHAR(10) not null,
	date_of_birth date not null,
	admission_date date not null,
	diagnosis VARCHAR(50) not null,
   CONSTRAINT ps_patient_id_pk PRIMARY KEY (patient_id)
);





INSERT INTO patient VALUES(1001,'Shivaji','Male', '1999-01-20',sysdate(),'Dialysis');
INSERT INTO patient VALUES(1002,'Soniya','Female', '1994-07-02',sysdate(),'Heart Surgey');
INSERT INTO patient VALUES(1003,'Sherlock','Male', '2000-09-18',sysdate(),'Dialysis');
INSERT INTO patient VALUES(1004,'Sheela','Female', '1996-10-16',sysdate(),'Tumour');


commit;

select * from patient;

