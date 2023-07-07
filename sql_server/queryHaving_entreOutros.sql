USE AdventureWorks2012

--
SELECT Count(Color), ListPrice FROM Production.Product
WHERE Color = 'Red'
AND ListPrice Between 500 AND 1000
Group By ListPrice


SELECT * FROM Production.Product
WHERE Name LIKE '%ROAD%';


SELECT TOP 10 * FROM Sales.SalesOrderDetail ORDER BY LineTotal DESC;

SELECT * FROM Sales.SalesOrderDetail;

SELECT TOP 10 AVG(Linetotal) FROM Sales.SalesOrderDetail;



SELECT FirstName, Count(FirstName) AS Qtde FROM PERSON.Person
GROUP BY FirstName;



SELECT SpecialOfferID, SUM(UnitPrice)  AS 'TOTAL VENDAS' FROM Sales.SalesOrderDetail
GROUP BY SpecialOfferID
ORDER BY 'TOTAL VENDAS';



SELECT SpecialOfferID, SUM(UnitPrice) FROM Sales.SalesOrderDetail
GROUP BY SpecialOfferID
ORDER BY SUM(UnitPrice) DESC;




SELECT ProductID, Count(ProductID) FROM SALES.SalesOrderDetail
GROUP BY ProductID;




SELECT Color, AVG(ListPrice) FROM Production.product
--WHERE Color = 'Silver' 
GROUP BY Color;

SELECT MiddleName, COUNT(MiddleName) FROM Person.Person
GROUP BY MiddleName
ORDER BY MiddleName;


SELECT ProductID, AVG(OrderQty) FROM Sales.SalesOrderDetail
GROUP BY ProductID;


SELECT TOP 10 ProductID, SUM(Linetotal) FROM Sales.SalesOrderDetail
GROUP BY ProductID
ORDER BY SUM(LineTotal) DESC;

SELECT ProductID, Count(ProductID)AS QTDE, AVG(OrderQty) AS MEDIA
FROM Production.WorkOrder
GROUP BY ProductID;



SELECT FirstName, Count(FirstName) FROM Person.Person
WHERE FirstName LIKE '%A%'
GROUP BY FirstName 
HAVING Count(FirstName) > 10;

-- Having condição para grupos e where condição para campos de tabelas.

SELECT ProductID, SUM(LineTotal) 
FROM Sales.SalesOrderDetail
GROUP BY ProductID
HAVING SUM(LineTotal) BETWEEN 162000 AND 500000;

SELECT ProductID, AVG(LineTotal) AS	'Total de vendas' FROM Sales.SalesOrderDetail
GROUP BY ProductID
Having AVG(LineTotal) < 1000;



