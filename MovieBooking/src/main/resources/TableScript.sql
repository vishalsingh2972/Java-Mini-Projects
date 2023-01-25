DROP SCHEMA IF EXISTS movie_booking_db;

CREATE SCHEMA movie_booking_db;
USE movie_booking_db;
   
create table movie_booking(
	booking_id INT AUTO_INCREMENT,
	movie_name VARCHAR(50) not null,
	screen_name VARCHAR(50) not null,
	show_date date not null,
	no_of_seats INT not null,
	booking_amount DOUBLE not null,
	payment_type VARCHAR(20) not null,
	customer_phone_no VARCHAR(10) not null,
   CONSTRAINT ps_booking_id_pk PRIMARY KEY (booking_id)
);





INSERT INTO movie_booking VALUES(1001,'Sahoo','Sapphire',sysdate(),3,600,'Card',9867230861);
INSERT INTO movie_booking VALUES(1002,'Dhamaka','Turquoise',sysdate(),3,900,'Wallet',9867986861);
INSERT INTO movie_booking VALUES(1003,'18 pages','Rhombus',sysdate(),5,500,'NetBanking',9458230861);
INSERT INTO movie_booking VALUES(1004,'Khiladi','Sapphire',sysdate(),1,200,'Card',9809230861);




commit;

select * from movie_booking ;

