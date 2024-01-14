CREATE TABLE `web_customer` (
  `cust_id` int(3) NOT NULL,
  `cust_name` varchar(45) DEFAULT NULL,
  `join_date` date DEFAULT NULL,
  `credit_score` double DEFAULT NULL,
  PRIMARY KEY (`cust_id`)
);


INSERT INTO `web_customer` VALUES (101,'Ramesh K','2018-10-28',245.67),(102,'Kiran','2018-11-04',80.75);