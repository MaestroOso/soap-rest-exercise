create table User(
	fullname varchar(100),
	code varchar(100),
	documentType varchar(100),
	documentNumber varchar(100)
);

create table Creditcard(
	token varchar(100),
	number varchar(100),
	expDate varchar(100),
	franchise varchar(100)
);

create table Movement(
	amount decimal(10,10),
	date date,
	type varchar(100)
);