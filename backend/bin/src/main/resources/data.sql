INSERT INTO ROLE(id, role) VALUES(1, 'USER');
INSERT INTO ROLE(id, role) VALUES(2, 'ADMIN');
INSERT INTO ROLE(id, role) VALUES(3, 'AGENT');
insert into USER(id, email, ime, password, prezime, aktivan,role_id) values (1,'ja','Michael','$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG','Balack',true,1);
insert into USER(id, email, password,aktivan,role_id) values (2,'ja1','$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG',true,2);
insert into DODATNA_USLUGA(id , name) values (1, 'WiFi');
insert into DODATNA_USLUGA(id , name) values (2, 'Tv');
insert into DODATNA_USLUGA(id , name) values (3, 'Klima');
insert into DODATNA_USLUGA(id , name) values (4, 'Parking');
insert into NASELJENO_MESTO(id, naziv) values (1,'Novi Sad');
insert into NASELJENO_MESTO(id, naziv) values (2,'Beograd');
insert into ZAUZETOST(id,pocetak,kraj) values (1, parsedatetime('2018-03-22','yyyy-MM-dd'),parsedatetime('2018-04-22','yyyy-MM-dd'));
insert into ZAUZETOST(id,pocetak,kraj) values (2, parsedatetime('2018-05-22','yyyy-MM-dd'),parsedatetime('2018-06-22','yyyy-MM-dd'));
insert into KATEGORIJA(id,name) values (1,'prva');
insert into KATEGORIJA(id,name) values (2,'druga');
insert into TIP_SMESTAJA(id,name) values (1,'soba');
insert into TIP_SMESTAJA(id,name) values (2,'kuca');
insert into SMESTAJ(id,address,kapacitet,name,opis,kategorija_id,naseljenomesto_id,tip_smestaja_id,agent_id) values (1,'Ilije Ognjanovica 10',3,'Hotel Mediteraneo','This property is 14 minutes walk from the beach. Quietly located close to Dunavski Park in the heart of Novi Sad Hotel Mediteraneo offers spaciousair-conditioned rooms with free Wi-Fi and cable TV',1,1,1,1);
insert into SMESTAJ(id,address,kapacitet,name,opis,kategorija_id,naseljenomesto_id,tip_smestaja_id,agent_id) values (2,'Petrovaradinska Tvrdjava',4,'Hotel Leopold I','This property is 9 minutes walk from the beach. Situated on the right bank of the Danube, in the very heart of Petrovaradin Fortress, Hotel Leopold I offers luxurious accommodation in a Baroque-style building with views on the Danube and Novi Sad',2,2,2,1);
insert into SMESTAJ_DODATNE_USLUGE values (1,1);
insert into SMESTAJ_DODATNE_USLUGE values (1,2);
insert into SMESTAJ_DODATNE_USLUGE values (2,3);
insert into SMESTAJ_DODATNE_USLUGE values (2,4);
insert into SMESTAJ_ZAUZETO values (1,1);
insert into SMESTAJ_ZAUZETO values (2,2);
insert into REZERVACIJA(id,cena,datum_dolaska,datum_odlaska,izvrsena,smestaj_id,user_id) values (1,3000,parsedatetime('2018-03-22','yyyy-MM-dd'),parsedatetime('2018-04-22','yyyy-MM-dd'),false,1,1);
insert into TERMIN(id,mesec,price) values (1,'1','2000');
insert into TERMIN(id,mesec,price) values (2,'2','3000');
