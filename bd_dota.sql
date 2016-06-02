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
insert into estadisticas values(null,10,1,200,50,290,23,24,18,3.36,3.36,0.01,2.4,3,1.7,false);


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