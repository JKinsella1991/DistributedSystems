CREATE TABLE orders (
orderID int NOT NULL AUTO_INCREMENT,
date DATE NOT NULL,
custFName varchar(20) NOT NULL,
custSName varchar(20) NOT NULL,
custID int NOT NULL,
carReg varchar(20) NOT NULL,
dateFrom varchar(20) NOT NULL,
dateTo varchar(20) NOT NULL,
PRIMARY KEY(orderID)
);

INSERT INTO orders (orderID, date, custFName, custSName, custID, carReg, dateFrom, dateTo)
VALUES (1, CURDATE(), "John", "Smith", 125, "98-D-18565", "23-08-2018", "28-08-2018");