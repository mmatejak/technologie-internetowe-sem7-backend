###Opis schematu bazy danych.

#####Client:

>Zawiera podstawowe dane o kliencie takie jak:

- id klienta
- imie
- nazwisko
- numer telefonu
- email
- id adresu (klient może mieć jeden adres)

#####Address:

>Zawiera dane adresowe klienta takie jak:

- id adresu
- kod pocztowy
- miasto
- ulica
- numer domu

#####Notification:

>Zawiera dane dotyczące zgłoszenia usługi takie jak:

- id zgłoszenia
- data zgłoszenia
- termin realizacji
- opis zgłoszenia
- id usługi (usługa może być w wielu zgłoszeniach)
- id klienta (klient może mieć wiele zgłoszeń)

#####Service:

>Zawiera dane dotyczące usług oferowanych przez serwis komputerowych:

- id usługi
- nazwe usługi
- cenę usługi


###SQL
```h2
    create table public.address (
       address_id bigint not null,
        post_code varchar(255),
        street varchar(255),
        street_number varchar(255),
        town varchar(255),
        primary key (address_id)
    )
    
    create table public.client (
       client_id bigint not null,
        email varchar(255),
        name varchar(255),
        phone_number varchar(255),
        surname varchar(255),
        address_address_id bigint,
        primary key (client_id)
    )
    
    create table public.notification (
       notification_id bigint not null,
        delivery_time timestamp,
        description varchar(255),
        notification_date_time timestamp,
        client_id_client_id bigint,
        service_id_service_id bigint,
        primary key (notification_id)
    )
    
    create table public.service (
       service_id bigint not null,
        price bigint,
        type varchar(255),
        primary key (service_id)
    )
    
    alter table public.client 
       add constraint FKe4ci7dwuckyom9m2v9l1wd3c1 
       foreign key (address_address_id) 
       references public.address
    
    alter table public.notification 
       add constraint FKiw0ftfusw86xj9649nx2fmfjt 
       foreign key (client_id_client_id) 
       references public.client
    
    alter table public.notification 
       add constraint FKaecl81s4cjffmtckj2st8af8 
       foreign key (service_id_service_id) 
       references public.service
```
