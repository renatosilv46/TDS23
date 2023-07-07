USE AdventureWorks2012;

SELECT * FROM Person.Person;


--Select para retornar com a letra maiúscula(UPPER) ou minúscula(LOWER);
SELECT UPPER(FirstName), LOWER(LastName) FROM Person.Person;


--LENGTH(LEN)
SELECT FirstName, LEN(FirstName) AS 'QTDE DE CARACTERES' FROM Person.Person
WHERE LEN(FirstName) <= 2;

SELECT SUBSTRING(FirstName,2,1) as PrimeiroNome FROM Person.Person
WHERE SUBSTRING(FirstName,2,1) = '.'
ORDER BY PrimeiroNome DESC;

SELECT ProductNumber, REPLACE(ProductNumber,'-','-2023-') FROM Production.Product;


SELECT FirstName, MiddleName, LastName FROM Person.Person


CREATE VIEW Nomes AS 
SELECT FirstName, MiddleName, LastName FROM Person.Person
WHERE Title = 'Mr.';

CREATE OR ALTER VIEW Nomes AS 
SELECT FirstName, MiddleName, LastName FROM Person.Person
WHERE Title = 'Ms.';


SELECT * FROM Nomes
ORDER BY 3 DESC;

SELECT A.FirstName, B.EmailAddress FROM Person.Person A 
INNER JOIN Person.EmailAddress B ON B.BusinessEntityID = A.BusinessEntityID;


CREATE VIEW NomeEmail AS 
SELECT A.BusinessEntityID,A.FirstName, B.EmailAddress FROM Person.Person A 
INNER JOIN Person.EmailAddress B ON B.BusinessEntityID = A.BusinessEntityID;

SELECT * FROM Nomes;
DROP VIEW Nomes;






