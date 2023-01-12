
DROP SCHEMA IF EXISTS lottery_system_db;
 CREATE SCHEMA lottery_system_db;
 USE lottery_system_db;

 create table participant(
    participant_id INT AUTO_INCREMENT,
    name VARCHAR(20) not null,
    age INT not null,
    mail_id VARCHAR(50) not null,
    contact_no BIGINT not null,
    coupon_number VARCHAR(6) not null,
    winning_amount INT not null,
     CONSTRAINT ps_participant_id_pk PRIMARY KEY (participant_id)
    );
    
INSERT INTO participant VALUES(1001,'Steffen',21, 'steffan21@infy.com', 7895490369,'ABC123',23000);
INSERT INTO participant VALUES(1002,'Harry Brook',29, 'harry29@infy.com', 7859309732,'XYZ234',27000);
INSERT INTO participant VALUES(1003,'Reece Topley',19, 'reece19@yahoo.com', 8932870369,'RTY678',34890);    

    

commit;
select * from participant;