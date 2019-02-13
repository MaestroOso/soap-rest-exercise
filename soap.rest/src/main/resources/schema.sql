create table soapuser(
	username varchar(100) not null,
	password varchar(100) not null,
	primary key(username)
);

create table User(
	fullname varchar(100),
	code varchar(100),
	documentType varchar(100),
	documentNumber varchar(100)
);

create table CreditCard(
	token varchar(100),
	number varchar(100),
	expDate date,
	franchise varchar(100)
);

create table Movement(
	amount decimal(10,10),
	date varchar(100),
	type varchar(100)
);