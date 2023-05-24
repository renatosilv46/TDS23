use AdventureWorks2012

SELECT * FROM sys.tables 

SELECT * FROM Production.ProductDocument
WHERE ProductID LIKE '%5';

SELECT * FROM PERSON.PERSON

SELECT * FROM Person.Person
WHERE BusinessEntityID = 5
OR BusinessEntityID = 111
OR BusinessEntityID = 23;

SELECT Weight AS Peso, ProductID AS IDdoProduto FROM Production.Product
WHERE Weight > '500'
AND Weight <= '700';

SELECT * FROM HumanResources.Employee
WHERE SalariedFlag = 1
AND MaritalStatus = 'M'
AND BirthDate <= '1983-01-01'




SELECT * FROM Person.EmailAddress
WHERE BusinessEntityID = 26

SELECT Person.Person.FirstName, Person.Person.LastName, Person.EmailAddress.EmailAddress
FROM Person.Person, Person.EmailAddress
WHERE Person.BusinessEntityID = EmailAddress.BusinessEntityID
AND Person.BusinessEntityID = 26

SELECT * FROM Production.Product

SELECT Count(ProductID) FROM Production.Product

SELECT Distinct Name FROM Production.Product

-- (QUAIS) EU POSSO USAR DISTINCT | (QUANTOS) EU POSSO USAR O COUNT.

SELECT *
FROM Person.Person
WHERE BusinessEntityID BETWEEN 1 AND 8;


SELECT BusinessEntityID
FROM Person.Person
WHERE BusinessEntityID IN ('1','5','6');


SELECT A.BusinessEntityID, B.ProductID FROM Person.Person A 
INNER JOIN Production.Product B ON B.ProductID = BusinessEntityID;

SELECT * FROM HumanResources.Employee
WHERE HireDate BETWEEN '2009/01/01' AND '2010/01/01'

SELECT * FROM Person.Person
WHERE FirstName LIKE 'R' -- (%) SERVE PARA DIZER QUE TEM TEXTO APÓS OU ANTES DO VALOR QUE EU COLOQUEI E (_) SERVE PARA EU DIZER QUE O TANTO DE _ QUE EU COLOCAR É EQUIVALENTE AO TOTAL DE CARACTER NO VALOR PESQUISADO.



SELECT Count(StandardCost) FROM PRODUCTION.Product
WHERE StandardCost > 1500;

SELECT Count(LastName) FROM PERSON.Person
WHERE LastName LIKE 'P%';

SELECT Count(DISTINCT City)  FROM PERSON.Address;





