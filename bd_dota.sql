create database bd_dota;
use bd_dota;

drop database bd_dota;

create table heroes(
	id int,
    nombre varchar(30),
    titulo varchar(30),
    imagen varchar(50),
    audio varchar(50),
    primary key(id)
);

create table estadisticas(
	id int auto_increment,
    idHeroe int,
    nivel int,
    vida int,
    mana int,
    velocidad int,
    fuerza double,
    agilidad double,
    inteligencia double,
    regenV double,
    regenM double,
    nivelFue double,
    nivelAgi double,
    nivelInt double,
    isCalculado boolean,
    primary key(id),
    foreign key(idHeroe) references heroes(id)
);

/* (id,'Nombre','Titulo','imagen.png','audio.wav')*/

insert into heroes values(1,'Abaddon','Lord of Avernus','abaddon.png','abaddon.wav');
insert into heroes values(2,'Razzil Darkbrew','Alchemist','alchemist.png','alchemist.wav');
insert into heroes values(3,'Kaldr','Ancient Apparition','ancient_apparition.png','ancient_apparition.wav');
insert into heroes values(4,'Magina','Antimage','antimage.png','antimage.wav');
insert into heroes values(5,'Zet','Arc Warden','arc_warden.png','arc_warden.wav');
insert into heroes values(6,'Mogul Khan','Axe','axe.png','axe.wav');
insert into heroes values(7,'Atropos','Bane Elemental','bane.png','bane.wav');
insert into heroes values(8,'Jinzakk','Batrider','batrider.png','batrider.wav');
insert into heroes values(9,'Karroch','Beastmaster','beastmaster.png','beastmaster.wav');
insert into heroes values(10,'Strygwyr','Bloodseeker','bloodseeker.png','bloodseeker.wav');

insert into heroes values(11,'Gondar','Bounty Hunter','bounty_hunter.png','bounty_hunter.wav');
insert into heroes values(12,'Mangix','Brewmaster','brewmaster.png','brewmaster.wav');
insert into heroes values(13,'Black Arachnia','Broodmother','broodmother.png','broodmother.wav');
insert into heroes values(14,'Rigwarl','Bristleback','bristleback.png','bristleback.wav');
insert into heroes values(15,'Bradwarden','Centaur Warruner','centaur.png','centaur.wav');
insert into heroes values(16,'Nessaj','Chaos Knight','chaos_knight.png','chaos_knight.wav');
insert into heroes values(17,'Chen','Holy Knight','chen.png','chen.wav');
insert into heroes values(18,'Nombre','Titulo','imagen.png','audio.wav');
insert into heroes values(19,'Nombre','Titulo','imagen.png','audio.wav');
insert into heroes values(20,'Nombre','Titulo','imagen.png','audio.wav');

insert into heroes values(21,'Nombre','Titulo','imagen.png','audio.wav');
insert into heroes values(22,'Nombre','Titulo','imagen.png','audio.wav');
insert into heroes values(23,'Nombre','Titulo','imagen.png','audio.wav');
insert into heroes values(24,'Nombre','Titulo','imagen.png','audio.wav');
insert into heroes values(25,'Nombre','Titulo','imagen.png','audio.wav');
insert into heroes values(26,'Nombre','Titulo','imagen.png','audio.wav');
insert into heroes values(27,'Nombre','Titulo','imagen.png','audio.wav');
insert into heroes values(28,'Nombre','Titulo','imagen.png','audio.wav');
insert into heroes values(29,'Nombre','Titulo','imagen.png','audio.wav');
insert into heroes values(30,'Nombre','Titulo','imagen.png','audio.wav');



/* Estadísticas de cada héroe */

/* (id,idHeroe,nivel,vida,mana,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false) */

insert into estadisticas values(null,1,1,200,50,310,23,17,21,0.25,0.01,2.7,1.5,2,false);
insert into estadisticas values(null,2,1,200,50,295,25,11,25,0.25,0.01,1.8,1.2,1.8,false);
insert into estadisticas values(null,3,1,200,50,295,18,20,25,0.25,0.01,1.4,2.2,2.6,false);
insert into estadisticas values(null,4,1,200,50,315,22,22,15,0.25,0.01,1.2,2.8,1.8,false);
insert into estadisticas values(null,5,1,200,50,295,24,15,24,0.25,0.01,2.3,1.8,2.6,false);
insert into estadisticas values(null,6,1,200,50,290,25,20,18,3,0.01,2.5,2.2,1.6,false);
insert into estadisticas values(null,7,1,200,50,310,22,22,22,0.25,0.01,2.1,2.1,2.1,false);
insert into estadisticas values(null,8,1,200,50,290,23,15,24,2,0.01,2.4,1.5,2.5,false);
insert into estadisticas values(null,9,1,200,50,310,23,18,16,0.25,0.01,2.2,1.6,1.9,false);
insert into estadisticas values(null,10,1,200,50,290,23,24,18,0.25,0.01,2.4,3,1.7,false);

insert into estadisticas values(null,11,1,200,50,315,17,21,19,0.75,0.01,1.8,3,2,false);
insert into estadisticas values(null,12,1,200,50,300,23,22,14,0.75,0.01,2.9,1.95,1.25,false);
insert into estadisticas values(null,13,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,14,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,15,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,16,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,17,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,18,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,19,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,20,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);

insert into estadisticas values(null,21,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,22,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,23,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,24,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,25,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,26,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,27,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,28,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,29,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);
insert into estadisticas values(null,30,1,200,50,velocidad,fuerza,agilidad,inteligencia,regenV,regenM,nivelFue,nivelAgi,nivelInt,false);


create table habilidades(
	id int auto_increment,
    nombre varchar(25),
    esPasiva boolean,
    mana int,
    recarga int,
    primary key(id)
);

/* Objetos */
create table objetos(
	id int auto_increment,
    nombre varchar(50),
    precio int,
    fuerza int,
    agilidad int,
    inteligencia int,
    descripcion varchar(255),
    primary key(id)
);

/* Progreso actual: 3 de 158 (1,89%) */
insert into objetos values(null, 'Corazón de Tarrasque', 5500, 45,0,0,null);
insert into objetos values(null, 'Mariposa', 5775, 0,30,0,null);
insert into objetos values(null, 'Guadaña de Vyse', 5650, 10,10,35,null);

create table heroeCargado(
	isCargado boolean
);