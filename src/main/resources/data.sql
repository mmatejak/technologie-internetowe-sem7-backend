insert into SERVICE (ID, PRICE, TYPE) values
(1,100,'CZYSZCZENIE_PC'),
(2,150,'DIAGNOZA'),
(3,200,'NOWY_PC');

insert into ADDRESS (ID, POST_CODE, STREET, STREET_NUMBER, TOWN) VALUES
(1,'05-240','Warszawska','1','Tłuszcz'),
(2,'05-200','Słoneczna','2','Wołomin'),
(3,'05-220','Ossowska','3','Zielonka');

insert into CLIENT (ID, EMAIL, NAME, PHONE_NUMBER, SURNAME, ADDRESS_ID) VALUES
(1,'qwe@wp.pl','Jurij','asd','Owsienko',1),
(2,'qwe@wp.pl','Jurij','asd','Owsienko',1),
(3,'qwe@wp.pl','Jurij','asd','Owsienko',2),
(4,'qwe@wp.pl','Jurij','asd','Owsienko',2),
(5,'qwe@wp.pl','Jurij','asd','Owsienko',3);

insert into NOTIFICATION (ID, DELIVERY_TIME, DESCRIPTION, CREATION_DATE_TIME, CLIENT_ID, SERVICE_ID) VALUES
(1,'2019-12-16 15:37:44.000000','qwe','2019-12-16 15:37:44.000000',1,1),
(2,'2019-12-16 15:37:44.000000','qwe','2019-12-16 15:37:44.000000',1,2),
(3,'2019-12-16 15:37:44.000000','qwe','2019-12-16 15:37:44.000000',2,3),
(4,'2019-12-16 15:37:44.000000','qwe','2019-12-16 15:37:44.000000',2,1),
(5,'2019-12-16 15:37:44.000000','qwe','2019-12-16 15:37:44.000000',3,2),
(6,'2019-12-16 15:37:44.000000','qwe','2019-12-16 15:37:44.000000',3,3),
(7,'2019-12-16 15:37:44.000000','qwe','2019-12-16 15:37:44.000000',4,1),
(8,'2019-12-16 15:37:44.000000','qwe','2019-12-16 15:37:44.000000',5,2);