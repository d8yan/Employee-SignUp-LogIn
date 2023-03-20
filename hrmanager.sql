CREATE SCHEMA HRMANAGER;
USE HRMANAGER;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userName` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `firstName` varchar(30) NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `emailAddress` varchar(30) NOT NULL,
  `hireDate` date NOT NULL,
  PRIMARY KEY (`id`)
)