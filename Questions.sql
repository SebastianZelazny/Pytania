create database pytania;

use pytania;

create table user (
ID_U int unique auto_increment primary key,
name varchar(30) not null,
surname varchar(30) not null
);

drop table user;
drop table scoore;
drop table questions;

create table scoore(
ID_C int unique auto_increment primary key,
ID_Us int ,
wynik varchar(10) not null,
foreign key (ID_us) references user(ID_U)
);

create table questions(
ID_P int unique auto_increment primary key,
Tresc varchar(200),
Odp_A varchar(50),
Odp_B varchar(50),
Odp_C varchar(50),
Odp_D varchar(50),
Odp_ok varchar(50),
Kat varchar(5)
);

Insert into user (name,surname) values ('Sebastian','Zelazny');
Insert into user (name,surname) value ('Krzysztof','Jaros');
Insert into user (name,surname) value ('Tomek','Kot');



