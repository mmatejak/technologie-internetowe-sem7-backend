Opis schematu bazy danych.

Client:

Zawiera podstawowe dane o kliencie takie jak:

-id klienta
-imie
-nazwisko
-numer telefonu
-email
-id adresu (klient może mieć jeden adres)

Address:

Zawiera dane adresowe klienta takie jak:

-id adresu
-kod pocztowy
-miasto
-ulica
-numer domu

Notification:

Zawiera dane dotyczące zgłoszenia usługi takie jak:

-id zgłoszenia
-data zgłoszenia
-termin realizacji
-opis zgłoszenia
-id usługi (usługa może być w wielu zgłoszeniach)
-id klienta (klient może mieć wiele zgłoszeń)

Service:

Zawiera dane dotyczące usług oferowanych przez serwis komputerowych:

-id usługi
-nazwe usługi
-cenę usługi