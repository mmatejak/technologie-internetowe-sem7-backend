insert into SERVICE (ID, CREATED_DATE_TIME, LAST_MODIFIED_DATE_TIME, VERSION, PRICE, TYPE)
values (1, CURRENT_DATE, CURRENT_DATE, 1, 100, 'WEZWANIE_ASSISTANCE'),
       (2, CURRENT_DATE, CURRENT_DATE, 1, 150, 'ZGLOSZENIE_KOLIZJI');

insert into ADDRESS (ID, CREATED_DATE_TIME, LAST_MODIFIED_DATE_TIME, VERSION, POST_CODE, STREET, STREET_NUMBER, TOWN)
values (1, CURRENT_DATE, CURRENT_DATE, 1, '05-240', 'Warszawska', '1', 'Tłuszcz'),
       (2, CURRENT_DATE, CURRENT_DATE, 1, '05-200', 'Słoneczna', '2', 'Wołomin'),
       (3, CURRENT_DATE, CURRENT_DATE, 1, '05-220', 'Ossowska', '3', 'Zielonka');

insert into CLIENT (ID, CREATED_DATE_TIME, LAST_MODIFIED_DATE_TIME, VERSION, EMAIL, NAME, PHONE_NUMBER, SURNAME,
                    ADDRESS_ID)
values (1, CURRENT_DATE, CURRENT_DATE, 1, 'qwe1@wp.pl', 'Jurij', 'asd', 'Owsienko', 1),
       (2, CURRENT_DATE, CURRENT_DATE, 1, 'qwe2@wp.pl', 'Jurij', 'asd', 'Owsienko', 1),
       (3, CURRENT_DATE, CURRENT_DATE, 1, 'qwe3@wp.pl', 'Jurij', 'asd', 'Owsienko', 2),
       (4, CURRENT_DATE, CURRENT_DATE, 1, 'qwe4@wp.pl', 'Jurij', 'asd', 'Owsienko', 2),
       (5, CURRENT_DATE, CURRENT_DATE, 1, 'qwe5@wp.pl', 'Jurij', 'asd', 'Owsienko', 3);

insert into NOTIFICATION (ID, CREATED_DATE_TIME, LAST_MODIFIED_DATE_TIME, VERSION, DELIVERY_TIME, DESCRIPTION,
                          CLIENT_ID, SERVICE_ID)
values (1, CURRENT_DATE, CURRENT_DATE, 1, CURRENT_DATE, 'qwe', 1, 1),
       (2, CURRENT_DATE, CURRENT_DATE, 1, CURRENT_DATE, 'qwe', 1, 2),
       (3, CURRENT_DATE, CURRENT_DATE, 1, CURRENT_DATE, 'qwe', 2, 1),
       (4, CURRENT_DATE, CURRENT_DATE, 1, CURRENT_DATE, 'qwe', 2, 1),
       (5, CURRENT_DATE, CURRENT_DATE, 1, CURRENT_DATE, 'qwe', 3, 2),
       (6, CURRENT_DATE, CURRENT_DATE, 1, CURRENT_DATE, 'qwe', 3, 1),
       (7, CURRENT_DATE, CURRENT_DATE, 1, CURRENT_DATE, 'qwe', 4, 1),
       (8, CURRENT_DATE, CURRENT_DATE, 1, CURRENT_DATE, 'qwe', 5, 2);
