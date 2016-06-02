create database bd_dota;
use bd_dota;

create table heroes(
	id int,
    nombre varchar(30),
    titulo varchar(30),
    ruta varchar(50),
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
    armadura double,
    regenV double,
    regenM double,
    nivelFue double,
    nivelAgi double,
    nivelInt double,
    isCalculado boolean,
    primary key(id),
    foreign key(idHeroe) references heroes(id)
);


/* 111 de 112 Héroes (Pit Lord aún no es oficialmente lanzado) */

insert into heroes values(1,'Abaddon','Lord of Avernus','abaddon');
insert into heroes values(2,'Razzil Darkbrew','Alchemist','alchemist');
insert into heroes values(3,'Kaldr','Ancient Apparition','ancient_apparition');
insert into heroes values(4,'Magina','Anti-Mage','anti-mage');
insert into heroes values(5,'Zet','Arc Warden','arc_warden');
insert into heroes values(6,'Mogul Khan','Axe','axe');
insert into heroes values(7,'Atropos','Bane','bane');
insert into heroes values(8,'Jinzakk','Batrider','batrider');
insert into heroes values(9,'Karroch','Beastmaster','beastmaster');
insert into heroes values(10,'Strygwyr','Bloodseeker','bloodseeker');

insert into heroes values(11,'Gondar','Bounty Hunter','bounty_hunter');
insert into heroes values(12,'Mangix','Brewmaster','brewmaster');
insert into heroes values(13,'Black Arachnia','Broodmother','broodmother');
insert into heroes values(14,'Rigwarl','Bristleback','bristleback');
insert into heroes values(15,'Bradwarden','Centaur Warruner','centaur_warruner');
insert into heroes values(16,'Nessaj','Chaos Knight','chaos_knight');
insert into heroes values(17,'Chen','Holy Knight','chen');
insert into heroes values(18,'Clinkz','Bone Fletcher','clinkz');
insert into heroes values(19,'Rattletrap','Clockwerk','clockwerk');
insert into heroes values(20,'Rylai','Crystal Maiden','crystal_maiden');

insert into heroes values(21,'Ishkafel ','Dark Seer','dark_seer');
insert into heroes values(22,'Dazzle','Shadow Priest','dazzle');
insert into heroes values(23,'Krobelus','Death Prophet','death_prophet');
insert into heroes values(24,'Disruptor','Stormcrafter','disruptor');
insert into heroes values(25,'Lucifer','Doom Bringer','doom_bringer');
insert into heroes values(26,'Davion','Dragon Knight','dragon_knight');
insert into heroes values(27,'Traxex','Drow Ranger','drow_ranger');
insert into heroes values(28,'Kaolin','Earth Spirit','earth_spirit');
insert into heroes values(29,'Raigor','Earthshaker','earthshaker');
insert into heroes values(30,'Elder Titan','Worldsmith','elder_titan');

insert into heroes values(31,'Xin','Ember Spirit','ember_spirit');
insert into heroes values(32,'Aiushtha','Enchantress','enchantress');
insert into heroes values(33,'Darchrow','Enigma','enigma');
insert into heroes values(34,'Darkterror','Faceless Void','faceless_void');
insert into heroes values(35,'Aurel','Gyrocopter','gyrocopter');
insert into heroes values(36,'Huskar','Sacred Warrior','huskar');
insert into heroes values(37,'Karl','Invoker','invoker');
insert into heroes values(38,'Io','Wisp','io');
insert into heroes values(39,'Jakiro','Twin-Head Dragon','jakiro');
insert into heroes values(40,'Yurnero','Juggernaut','juggernaut');

insert into heroes values(41,'Ezalor','Keeper of the Light','keeper_of_the_light');
insert into heroes values(42,'Kunkka','Admiral','kunkka');
insert into heroes values(43,'Tresdin','Legion Commander','legion_commander');
insert into heroes values(44,'Leshrac','Tormented Soul','leshrac');
insert into heroes values(45,'Ethreain','Lich','lich');
insert into heroes values(46,'Naix','Lifestealer','lifestealer');
insert into heroes values(47,'Lina','Slayer','lina');
insert into heroes values(48,'Lion','Demon Witch','lion');
insert into heroes values(49,'Sylla','Lone Druid','lone_druid');
insert into heroes values(50,'Luna','Moon Rider','luna');

insert into heroes values(51,'Banehallow ','Lycanthrope','lycanthrope');
insert into heroes values(52,'Magnus','Magnoceros','magnus');
insert into heroes values(53,'Medusa','Gorgon','medusa');
insert into heroes values(54,'Meepo','Geomancer','meepo');
insert into heroes values(55,'Mirana','Princess of the Moon','mirana');
insert into heroes values(56,'Aqualisk','Morphling','morphling');
insert into heroes values(57,'Slithice','Naga Siren','naga_siren');
insert into heroes values(58,'Tequoia','Nature Prophet','nature_prophet');
insert into heroes values(59,'Roundjere','Necrophos','necrophos');

insert into heroes values(60,'Balanar','Night Stalker','night_stalker');
insert into heroes values(61,'Anubarak','Nyx Assassin','nyx_assassin');
insert into heroes values(62,'Aggron Stonebreak','Ogre Magi','ogre_magi');
insert into heroes values(63,'Purist Thunderwrath','Omniknight','omniknight');
insert into heroes values(64,'Nerif','Oracle','oracle');
insert into heroes values(65,'Harbinger','Outworld Devourer','outworld_devourer');
insert into heroes values(66,'Mortred','Phantom Assassin','phantom_assassin');
insert into heroes values(67,'Azwraith','Phantom Lancer','phantom_lancer');
insert into heroes values(68,'Icarus','Phoenix','phoenix');
insert into heroes values(69,'Azgalor','Pit Lord','pit_lord');

insert into heroes values(70,'Puck','Faerie Dragon','puck');
insert into heroes values(71,'Pudge','Butcher','pudge');
insert into heroes values(72,'Pugna','Oblivion','pugna');
insert into heroes values(73,'Akasha','Queen of Pain','queen_of_pain');
insert into heroes values(74,'Razor','Lightning Revenant','razor');
insert into heroes values(75,'Riki','Stealth Assassin','riki');
insert into heroes values(76,'Rubick','Grand Magus','rubick');
insert into heroes values(77,'Crixalis','Sand King','sand_king');
insert into heroes values(78,'Eredar','Shadow Demon','shadow_demon');
insert into heroes values(79,'Nevermore','Shadow Fiend','shadow_fiend');

insert into heroes values(80,'Rhasta','Shadow Shaman','shadow_shaman');
insert into heroes values(81,'Nortrom','Silencer','silencer');
insert into heroes values(82,'Dragonus','Skywrath Mage','skywrath_mage');
insert into heroes values(83,'Slardar','Slithereen Guard','slardar');
insert into heroes values(84,'Slark','Nightcrawler','slark');
insert into heroes values(85,'Kardel Sharpeye','Sniper','sniper');
insert into heroes values(86,'Mercurial','Spectre','spectre');
insert into heroes values(87,'Barathrum','Spirit Breaker','spirit_breaker');
insert into heroes values(88,'Raijin','Storm Spirit','storm_spirit');
insert into heroes values(89,'Sven','Rogue Knight','sven');

insert into heroes values(90,'Squee, Spleen and Spoon','Techies','techies');
insert into heroes values(91,'Lanaya','Templar Assassin','templar_assassin');
insert into heroes values(92,'Terrorblade','Demon Marauder','terrorblade');
insert into heroes values(93,'Leviathan','Tidehunter','tidehunter');
insert into heroes values(94,'Rizzrak','Timbersaw','timbersaw');
insert into heroes values(95,'Boush','Tinker','tinker');
insert into heroes values(96,'Tiny','Stone Giant','tiny');
insert into heroes values(97,'Rooftrellen','Treant Protector','treant_protector');
insert into heroes values(98,'Jahrakal','Troll Warlord','troll_warlord');
insert into heroes values(99,'Ymir','Tusk','tusk');

insert into heroes values(100,'Dirge','Undying','undying');
insert into heroes values(101,'Ulfsaar','Ursa Warrior','ursa_warrior');
insert into heroes values(102,'Shendelzare','Vengeful Spirit','vengeful_spirit');
insert into heroes values(103,'Lasale Deathbringer','Venomancer','venomancer');
insert into heroes values(104,'Viper','Netherdrake','viper');
insert into heroes values(105,'Necrolic','Visage','visage');
insert into heroes values(106,'Demnok Lannik','Warlock','warlock');
insert into heroes values(107,'Skitskurr','Weaver','weaver');
insert into heroes values(108,'Lyralei','Windranger','windranger');
insert into heroes values(109,'Auroth','Winter Wyvern','winter_wyvern');
insert into heroes values(110,'Zharvakko','Witch Doctor','witch_doctor');
insert into heroes values(111,'Ostarion','Wraith King','wraith_king');
insert into heroes values(112,'Zeus','Lord of Heaven','zeus');




/* Estadísticas de cada héroe */
insert into estadisticas values(null,1,1,200,50,310,23,17,21,1.38,0.25,0.01,2.7,1.5,2,false);
insert into estadisticas values(null,2,1,200,50,295,25,11,25,1.54,0.25,0.01,1.8,1.2,1.8,false);
insert into estadisticas values(null,3,1,200,50,295,18,20,25,1.8,0.25,0.01,1.4,2.2,2.6,false);
insert into estadisticas values(null,4,1,200,50,315,22,22,15,2.08,0.25,0.01,1.2,2.8,1.8,false);
insert into estadisticas values(null,5,1,200,50,295,24,15,24,0,0.25,0.01,2.3,1.8,2.6,false);
insert into estadisticas values(null,6,1,200,50,290,25,20,18,1.8,3,0.01,2.5,2.2,1.6,false);
insert into estadisticas values(null,7,1,200,50,310,22,22,22,3.52,0.25,0.01,2.1,2.1,2.1,false);
insert into estadisticas values(null,8,1,200,50,290,23,15,24,2.1,2,0.01,2.4,1.5,2.5,false);
insert into estadisticas values(null,9,1,200,50,310,23,18,16,4.52,0.25,0.01,2.2,1.6,1.9,false);
insert into estadisticas values(null,10,1,200,50,290,23,24,18,3.36,0.25,0.01,2.4,3,1.7,false);

insert into estadisticas values(null,11,1,200,50,315,17,21,19,5.94,0.75,0.01,1.8,3,2,false);
insert into estadisticas values(null,12,1,200,50,300,23,22,14,2.52,0.75,0.01,2.9,1.95,1.25,false);
insert into estadisticas values(null,13,1,200,50,290,22,17,14,3.38,0.25,0.01,2.2,1.8,2.8,false);
insert into estadisticas values(null,14,1,200,50,295,17,18,18,2.52,0.25,0.01,2.5,2.2,2,false);
insert into estadisticas values(null,15,1,200,50,300,23,15,15,3.1,0.25,0.01,3.8,2,1.6,false);
insert into estadisticas values(null,16,1,200,50,325,20,14,16,3.96,0.25,0.01,2.9,2.1,1.2,false);
insert into estadisticas values(null,17,1,200,50,300,23,15,21,1.1,0.25,0.01,1.5,2.1,2.8,false);
insert into estadisticas values(null,18,1,200,50,300,15,22,16,2.08,0.25,0.01,1.6,3.3,1.55,false);
insert into estadisticas values(null,19,1,200,50,315,24,13,17,1.82,0.25,0.01,2.9,2.3,1.3,false);
insert into estadisticas values(null,20,1,200,50,280,16,16,16,1.24,0.25,0.01,1.7,1.6,2.9,false);

insert into estadisticas values(null,21,1,200,50,300,22,12,25,6.68,0.25,0.01,2.3,1.2,2.7,false);
insert into estadisticas values(null,22,1,200,50,305,16,21,27,1.94,0.25,0.01,1.85,1.7,3.4,false);
insert into estadisticas values(null,23,1,200,50,280,18,14,20,2.96,0.75,0.01,1.9,1.4,3,false);
insert into estadisticas values(null,24,1,200,50,300,19,15,22,1.1,0.25,0.01,1.9,1.4,2.5,false);
insert into estadisticas values(null,25,1,200,50,290,26,11,13,0,0.25,0.01,3.2,0.9,2.1,false);
insert into estadisticas values(null,26,1,200,50,290,19,19,15,3.66,0.25,0.01,2.8,2.2,1.7,false);
insert into estadisticas values(null,27,1,200,50,300,17,22,15,0.64,0.25,0.01,1.9,1.9,1.4,false);
insert into estadisticas values(null,28,1,200,50,295,21,17,18,3.38,0.25,0.01,2.9,1.5,2.1,false);
insert into estadisticas values(null,29,1,200,50,310,22,12,16,2.68,0.25,0.01,2.9,1.4,1.8,false);
insert into estadisticas values(null,30,1,200,50,315,24,14,23,2.96,0.25,0.01,2.3,1.5,1.6,false);

insert into estadisticas values(null,31,1,200,50,310,19,22,20,1.08,0.75,0.01,2,1.8,1.8,false);
insert into estadisticas values(null,32,1,200,50,335,16,19,16,0.66,0.25,0.01,1,1.8,2.8,false);
insert into estadisticas values(null,33,1,200,50,300,17,14,20,3.96,0.25,0.01,2.1,1,3.4,false);
insert into estadisticas values(null,34,1,200,50,300,23,23,15,3.94,0.75,0.01,1.6,2.65,1.5,false);
insert into estadisticas values(null,35,1,200,50,315,18,24,19,4.36,0.25,0.01,1.8,2.8,2.1,false);
insert into estadisticas values(null,36,1,200,50,300,21,15,18,1.8,0.25,0.01,2.4,1.4,1.5,false);
insert into estadisticas values(null,37,1,200,50,280,17,14,16,1.8,0.25,0.01,1.7,1.9,4,false);
insert into estadisticas values(null,38,1,200,50,295,17,14,23,0,0.25,0.01,1.9,1.6,1.7,false);
insert into estadisticas values(null,39,1,200,50,290,25,10,28,2.4,0.25,0.01,2.3,1.2,2.8,false);
insert into estadisticas values(null,40,1,200,50,305,20,26,14,3.64,0.75,0.01,1.9,2.4,1.4,false);


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