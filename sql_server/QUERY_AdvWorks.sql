USE AdventureWorks2014

SELECT * FROM SYS.tables

SELECT * FROM Person.Person;
SELECT * FROM Person.Password;
SELECT * FROM Person.Address;


SELECT A.FirstName, B.PasswordHash, C.AddressLine1 FROM Person.Person A
INNER JOIN Person.Password B ON B.BusinessEntityID = A.BusinessEntityID
INNER JOIN Person.Address C ON C.AddressID = B.BusinessEntityID
WHERE A.FirstName LIKE '%ron%'
ORDER BY A.FirstName












