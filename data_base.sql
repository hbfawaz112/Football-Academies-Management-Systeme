/******************************LOG IN TABLE:******************************/
Create Table Log_in
(username varchar(30) PRIMARY KEY NOT NULL ,
 passwordd varchar(30)  NOT NULL,
)
Insert into Log_in values ('hbfawaz','12345678')

/****************************PLAYER TABLE*********************************/ 
 create table Player (
   PLAYER_ID            int    IDENTITY(1,1)              not null,
   NAME                  varchar(256)         null,
   DATE_OF_BIRTHDAY     date             null,
   PHONE_NUMBER         varchar(256)       null,
   ADRESSE              varchar(256)            null,
   BLOOD_TYPE           varchar(256)            null,
   POSITION             varchar(256)            null,
   SEX                  varchar(256)            null,
   DATE_OF_REGESTRATION date             null,
   DESCRIPTIONS          varchar(256)            null,
    primary key (PLAYER_ID)
)

/****************************COACH TABLE*********************************/ 
 
create table Coach (
   COACH_ID             int     IDENTITY(1,1)             not null,
   NAME           varchar(256)            null,
   PHONE_NUMBER                varchar(256)            null,
   ADRESSE              varchar(256)            null,
   SEX                  varchar(256)            null,
   DATE_OF_STARTING_TRAINIG date             null,
   EMAIL     varchar(256) null,
   primary key (COACH_ID)
)

  /****************************Event TABLE*********************************/ 

  create table Event(
  EVENT_ID int PRIMARY KEY IDENTITY(1,1) not null,
  EVENT_NAME VARCHAR(256) NOT NULL,
 STADIUM VARCHAR(256) NOT NULL,
 COACH_ID INT NOT NULL,
 AGE_CATEGORIE  INT NOT NULL,
 EVENT_DATETIME DATETIME NOT NULL,
 foreign key (COACH_ID) references Coach(COACH_ID) ON UPDATE CASCADE ON DELETE CASCADE
 )

/****************************Player_Payment_Requirment TABLE*********************************/ 
 
create table Player_Payment_Requirment(
ID_PAYMENT_REQUIRE  int primary key IDENTITY(1,1) NOT NULL,
PLAYER_ID int not null,
DATE_FROM date ,
DATE_TO date,
REQUIRE_AMOUNT float ,
foreign key(PLAYER_ID) references Player(PLAYER_ID) ON UPDATE CASCADE ON DELETE CASCADE
)

/****************************Player_Payment_Payed TABLE*********************************/ 

create table Player_Payment_Payed(
ID_PAYMENT_Payed int IDENTITY(1,1) NOT NULL,
PLAYER_ID int not null,
DATE_PAYED date,
WHAT_PAYED float,
foreign key(PLAYER_ID) references Player(PLAYER_ID) ON UPDATE CASCADE ON DELETE CASCADE
)


/****************************Coach_Payment TABLE*********************************/ 

create table Coach_Payment (
ID_PAYMENT   int IDENTITY(1,1) not null ,
  COACH_ID  int not null,
  DATE_OF_PAYMENT date not null,
  COACH_SALARY float not null,
  primary key (ID_PAYMENT) ,
  foreign key (COACH_ID) references Coach(COACH_ID) ON UPDATE CASCADE ON DELETE CASCADE
  )
 
/****************************Academy_Balance TABLE*********************************/ 

  Create table Academy_Balance
  (
    ID int primary key not null,
	MONEY_IN float not null,
	MONEY_OUT float not null,
  )
  Insert into Academy_Balance values(1,0,0)
  
  /**************Equipment payment table******************************/


  Create Table Equipment_Payment
  (
    DESCRIPTION VARCHAR(30),
	AMOUNT float )

	select * from Equipment_Payment
	drop table Equipment_Payment




  /*************************************************SELECT QUERYES:***********************************************************************/

  select * from  Log_in
  
  select * from Player
 
  Select * from Coach

  select * from Event

  select * from Player_Payment_Requirment

  select * from Player_Payment_Payed

  select * from  Coach_Payment

  select * from Academy_Balance
  /*************************************************DROP TABLES**************************************************************/

  drop table Academy_Balance

  drop table Coach_Payment
  
  drop table  Player_Payment_Payed

  drop table Player_Payment_Requirment
  
  drop table Event

  drop table Coach

  drop table Player

  /**********************************************some data*********************************/

  Insert into Player (NAME,DATE_OF_BIRTHDAY,PHONE_NUMBER,ADRESSE,BLOOD_TYPE,POSITION,SEX ,DATE_OF_REGESTRATION,DESCRIPTIONS ) Values ('Hussein Bassam','2000-05-04','76722357','Tenine_Aljanoub','A+','Midfielder','Male','2020-01-04','no_description')
   Insert into Player (NAME,DATE_OF_BIRTHDAY,PHONE_NUMBER,ADRESSE,BLOOD_TYPE,POSITION,SEX ,DATE_OF_REGESTRATION,DESCRIPTIONS ) Values ('Hassein Bassam','2000-05-04','76752312','Tenine_Aljanoub','B+','Attacker','Male','2020-01-10','no_description')
 Insert into Player (NAME,DATE_OF_BIRTHDAY,PHONE_NUMBER,ADRESSE,BLOOD_TYPE,POSITION,SEX ,DATE_OF_REGESTRATION,DESCRIPTIONS ) Values ('Ftme Abbis','2001-08-21','76346337','Haris_Aljanoub','O-','Midfielder','Female','2020-01-04','no_description')
 Insert into Player (NAME,DATE_OF_BIRTHDAY,PHONE_NUMBER,ADRESSE,BLOOD_TYPE,POSITION,SEX ,DATE_OF_REGESTRATION,DESCRIPTIONS ) Values ('Mhmd Khd','1999-11-28','70325631','Shahbiyye_Aljanoub','AB+','Midfielder','Male','2020-01-29','no_description')
 
/**********************************************************some tests**********************************************/

 
	/***************************************************************/


	  /*        FOR SHOW PAYMENTS   */
	  ----------------------------------


	/* la njib sum amount  la kel id */
  create view ShowAllAm
  as
  select  PLAYER_ID as id ,REQUIRE_AMOUNT as am
  from Player_Payment_Requirment

   create view ShowSingleAmId
  as
  select id as idd , SUM(am) as SumReqAmount
  from ShowAllAm 
  group by id


  /* la njib sum payed la kel id */
    create view ShowAllPayed
  as
  select  PLAYER_ID as id ,WHAT_PAYED as wp
  from Player_Payment_Payed


  create view ShowSinglePayedPlayer
  as
  select id as idd , SUM(wp) as SumPayed
  from ShowAllPayed 
  group by id
  
  
  create view AllDetailsPlayerMoney  /* tafasil masari w id : elo w 3leh */
  as
  select ShowSinglePayedPlayer.idd as PLAYER_ID ,SumPayed as SumPayed , SumReqAmount as SumReqAmount
  from ShowSingleAmId , ShowSinglePayedPlayer
  where ShowSingleAmId.idd = ShowSinglePayedPlayer.idd
      
 
/* date*/
create view ShowAllDetailsDate
  as
  select PLAYER_ID as PLAYER_ID , MIN(DATE_FROM) as DATE_FROM , MAX(DATE_TO) as DATE_TO
  from Player_Payment_Requirment
  GROUP BY PLAYER_ID
	      
/* what we want */
  create view Ostoura
  as
  select ShowAllDetailsDate.PLAYER_ID as PLAYER_ID , MIN(DATE_FROM) as DATE_FROM , MAX(DATE_TO) as DATE_TO ,SumPayed as SumPayed , SumReqAmount as SumReqAmount
  from ShowAllDetailsDate ,AllDetailsPlayerMoney
  where ShowAllDetailsDate.PLAYER_ID = AllDetailsPlayerMoney.PLAYER_ID
  group by ShowAllDetailsDate.PLAYER_ID , SumPayed ,  SumReqAmount
  
  
  select * from Ostoura
  select * from Player_Payment_Requirment
  select * from Player_Payment_Payed

/*****************************************************************************************************/
	
	
	  
	  
	  
	      

    
  
  



