INSERT INTO ROLE(id, role) VALUES(1, 'USER');
INSERT INTO ROLE(id, role) VALUES(2, 'ADMIN');
INSERT INTO ROLE(id, role) VALUES(3, 'AGENT');
insert into USER(id, email, password,aktivan,role_id) values (1,'ja','$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG',true,1);
insert into USER(id, email, password,aktivan,role_id) values (2,'ja1','$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG',true,2);
insert into DODATNA_USLUGA(id , name) values (1, 'WiFi');
insert into DODATNA_USLUGA(id , name) values (2, 'Tv');
insert into DODATNA_USLUGA(id , name) values (3, 'Klima');
insert into DODATNA_USLUGA(id , name) values (4, 'Parking');
insert into NASELJENO_MESTO(id, naziv) values (1,'Novi Sad');
insert into NASELJENO_MESTO(id, naziv) values (2,'Beograd');
insert into ZAUZETOST(id,pocetak,kraj) values (1, parsedatetime('2018-03-22','yyyy-MM-dd'),parsedatetime('2018-04-22','yyyy-MM-dd'));
insert into ZAUZETOST(id,pocetak,kraj) values (2, parsedatetime('2018-05-22','yyyy-MM-dd'),parsedatetime('2018-06-22','yyyy-MM-dd'));
insert into KATEGORIJA(id,naziv) values (1,'prva');
insert into KATEGORIJA(id,naziv) values (2,'druga');
insert into TIP_SMESTAJA(id,tip) values (1,'soba');
insert into TIP_SMESTAJA(id,tip) values (2,'kuca');
insert into SMESTAJ(id,kapacitet,kategorija_id,naseljenomesto_id,tip_smestaja_id) values (1,3,1,1,1);
insert into SMESTAJ(id,kapacitet,kategorija_id,naseljenomesto_id,tip_smestaja_id) values (2,4,2,2,2);
insert into SMESTAJ_DODATNE_USLUGE values (1,1);
insert into SMESTAJ_DODATNE_USLUGE values (1,2);
insert into SMESTAJ_DODATNE_USLUGE values (2,3);
insert into SMESTAJ_DODATNE_USLUGE values (2,4);
insert into SMESTAJ_ZAUZETO values (1,1);
insert into SMESTAJ_ZAUZETO values (2,2);