CREATE DATABASE AulaJOIN
USE AulaJOIN

CREATE TABLE A(
ID int,
Nome VARCHAR(10)
);

CREATE TABLE B(
Id int,
NOME VARCHAR(10)
);

INSERT INTO A(ID, NOME)
VALUES(4, 'Monitor');

INSERT INTO B(ID, NOME)
VALUES(4, 'Samurai');

SELECT * FROM A;
SELECT * FROM B;


SELECT * FROM A
LEFT OUTER JOIN B
ON A.Nome = B.NOME


SELECT * FROM A
LEFT OUTER JOIN B
ON A.Nome = B.NOME
WHERE B.NOME IS NULL;


USE AdventureWorks2012

SELECT ProductID, Name, ProductNumber FROM Production.Product
WHERE Name LIKE '%CHAI%'
UNION
SELECT ProductID, Name, ProductNumber FROM Production.Product
WHERE Name LIKE '%DECAL%'
ORDER BY NAME DESC


SELECT A.BusinessEntityID, A.FirstName, A.LastName, B.EmailAddress, C.JobTitle FROM Person.Person A
INNER JOIN PERSON.EmailAddress B
ON A.BusinessEntityID = B.BusinessEntityID
INNER JOIN HumanResources.Employee C
ON A.BusinessEntityID = C.BusinessEntityID
WHERE C.JobTitle LIKE '%DESI%';





SELECT A.Name, A.ListPrice, B.Name FROM Production.Product A
INNER JOIN Production.ProductSubcategory B 
ON B.ProductSubcategoryID = A.ProductSubcategoryID;


SELECT * FROM PERSON.PersonPhone
SELECT * FROM PERSON.PhoneNumberType

SELECT A.BusinessEntityID, B.PhoneNumberTypeID, A.PhoneNumber, B.Name, C.FirstName AS 'PRIMEIRO NOME', C.LastName AS 'ULTIMO NOME'
FROM Person.PersonPhone A
INNER JOIN Person.PhoneNumberType B ON B.PhoneNumberTypeID = A.PhoneNumberTypeID
INNER JOIN Person.Person C ON C.BusinessEntityID =  A.BusinessEntityID;

  
SELECT A.BusinessEntityID, A.FIRSTNAME, A.LASTNAME, B.CreditCardID, C.emailAddress FROM Person.Person A
INNER JOIN Sales.PersonCreditCard B ON B.BusinessEntityID = A.BusinessEntityID
INNER JOIN Person.EmailAddress C  ON C.BusinessEntityId = A.BusinessEntityID;


SELECT A.BusinessEntityID, A.FIRSTNAME, A.LASTNAME, B.CreditCardID, C.emailAddress FROM Person.Person A
LEFT JOIN Sales.PersonCreditCard B ON B.BusinessEntityID = A.BusinessEntityID
INNER JOIN Person.EmailAddress C  ON C.BusinessEntityId = A.BusinessEntityID
WHERE B.CreditCardID IS NULL
AND C.EmailAddress IS NULL;

SELECT * FROM Production.Product
ORDER BY ListPrice DESC

SELECT AVG(LISTPRICE) FROM Production.Product


SELECT ProductID, ListPrice FROM Production.Product
WHERE ListPrice > 438.6662


SELECT ProductID, ListPrice FROM Production.Product
WHERE ListPrice > (SELECT AVG(LISTPRICE) FROM Production.Product)

SELECT * FROM Person.Person

SELECT * FROM HumanResources.Employee
WHERE JobTitle = 'Design Engineer';

SELECT FirstName, LastName,BusinessEntityID FROM Person.Person
WHERE BusinessEntityID IN(SELECT BusinessEntityID FROM HumanResources.Employee
						  WHERE JobTitle = 'Design Engineer')

SELECT A.FirstName, B.JobTitle FROM Person.Person A 
INNER JOIN HumanResources.Employee B ON A.BusinessEntityID = B.BusinessEntityID
WHERE JobTitle = 'Design Engineer';
