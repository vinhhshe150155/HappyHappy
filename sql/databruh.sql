go
drop database SWP391
CREATE DATABASE [SWP391]
go
use [SWP391]
CREATE TABLE userCommon(
userID int identity(1,1) primary key,
name nvarchar(50),
password  nvarchar(50),
email nvarchar(100) unique,
dob date,
sex int,
address nvarchar(200),
phone nvarchar(12) unique,
imgAvt nvarchar(1000) default 'https://iupac.org/wp-content/uploads/2018/05/default-avatar.png',
description nvarchar(1000),
status nvarchar(1000),
moneyLeft int,
createTime datetime default getDate(),
/*1 is mentor, 2 is mentee*/
role int,
)
CREATE TABLE mentor(
userID int primary key,
foreign key (userID) references userCommon(userID),
education nvarchar(200),
yearExperiment int,
intro nvarchar(1000),
imgAuthen1 nvarchar(1000),
imgAuthen2 nvarchar(1000),
authen int,
)
CREATE TABLE mentee(
userID int primary key,
foreign key (userID) references userCommon(userID),
)

CREATE TABLE subject(
subjectID int identity(1,1) primary key,
subjectName nvarchar(100),
status nvarchar(1000),
)

CREATE TABLE request(
requestID int identity(1,1) primary key,
userID int,
foreign key (userID) references userCommon(userID),
subjectID int,
foreign key (subjectID) references subject(subjectID),
moneyPerSlot int,
timePerSlot int,
startTime datetime,
endTime datetime,
description nvarchar(1000),
status int,
/*1 is off, 2 is onl*/
learnType int,
reqTime datetime default getDate()
)
CREATE TABLE requestSlotTime(
requestID int,
foreign key (requestID) references request(requestID),
slotFrom datetime,
slotTo datetime
)
CREATE TABLE course(
courseID int identity(1,1) primary key,
subjectID int,
foreign key (subjectID) references subject(subjectID),
menteeID int,
mentorID int,
foreign key (menteeID) references mentee(userID),
foreign key (mentorID) references mentor(userID),
slots int,
timePerSlot int,
moneyPerSlot int,
timeStart date,
timeEnd date,
/*1 is off, 2 is onl*/
learnType int,
status int,
description nvarchar(1000),
createTime datetime default getDate(),
)

CREATE TABLE major(
subjectID int,
foreign key (subjectID) references subject(subjectID),
mentorID int, 
foreign key (mentorID) references mentor(userID),
)

CREATE TABLE slot(
slotID int identity(1,1) primary key,
slotTimeFrom datetime,
slotTimeTo datetime,
courseID int,
foreign key (courseID) references course(courseID),
status int,
description nvarchar(1000),
)


CREATE TABLE bill(
billID int identity(1,1) primary key,
courseID int,
foreign key (courseID) references course(courseID),
userID int,
foreign key (userID) references userCommon(userID),
amount int,
billDate datetime,
description nvarchar(1000),
/*1 - Mentee to web, 2 - Web to mentor*/
billType int,
status int,
createTime datetime default getDate()
)

CREATE TABLE rating(
rateID int identity(1,1) primary key,
rateAmount int,
rateDescription nvarchar(1000),
rateTime datetime default getDate(),
mentorID int,
foreign key (mentorID) references mentor(userID),
menteeID int,
foreign key (menteeID) references mentee(userID),
)

CREATE TABLE notification(
notiID int identity(1,1) primary key,
userID int, 
foreign key (userID) references userCommon(userID),
content nvarchar(1000),
/*ex: 1 is message, 2 is new request, 3 is money...*/
notiType int,
status int,
notiTime datetime default getDate(),
)
CREATE TABLE admin(
id int identity(1,1) primary key,
username nvarchar(100),
password nvarchar(100),
role int,
description nvarchar(1000),
)

/*Sample database*/
INSERT INTO subject(subjectName) values ('Java')
INSERT INTO subject(subjectName) values ('C')
INSERT INTO subject(subjectName) values ('Kotlin')
INSERT INTO subject(subjectName) values ('SQL Server')
INSERT INTO subject(subjectName) values ('Python')
INSERT INTO subject(subjectName) values ('C#')
INSERT INTO subject(subjectName) values ('Ruby')
INSERT INTO subject(subjectName) values ('Android')
INSERT INTO userCommon(     
	   [name]
      ,[password]
      ,[email]
      ,[dob]
      ,[sex]
      ,[address]
      ,[phone]
      ,[description]
      ,[status]
      ,[moneyLeft]
      ,[role]) 
	  values ('test','test','test@gmai.com','2019-11-11',1,'Ha Noi', '034214312', 'Lmao','None', 99999, 1)
INSERT INTO mentor([userID]
      ,[education]
      ,[yearExperiment]
      ,[intro]
      ,[authen]) values (1,'fBt',8,'Uoa',0)