INSERT INTO ROLE(id, role) VALUES(1, 'USER');
INSERT INTO ROLE(id, role) VALUES(2, 'ADMIN');
INSERT INTO ROLE(id, role) VALUES(3, 'AGENT');
insert into USER(id, email, password,aktivan,role_id) values (1,'ja','$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG',true,1);
insert into USER(id, email, password,aktivan,role_id) values (2,'ja1','$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG',true,2);
insert into DODATNA_USLUGA(id , name) values (1, 'WiFi');
insert into DODATNA_USLUGA(id , name) values (2, 'Tv');
insert into DODATNA_USLUGA(id , name) values (3, 'Klima');
insert into DODATNA_USLUGA(id , name) values (4, 'Parking');
