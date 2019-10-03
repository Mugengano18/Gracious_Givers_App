create database gracious;

\c gracious

create table volunteer(id serial primary key,name varchar,email varchar,phone varchar,Message varchar,time timestamp);
create table donator(id serial primary key,name varchar,email varchar,phone varchar,donations varchar,time timestamp);
 create database gracious_test with template gracious;