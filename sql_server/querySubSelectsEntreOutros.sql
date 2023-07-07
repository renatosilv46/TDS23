use AdventureWorks2012

SELECT FirstName, MiddleName, Title FROM Person.Person
WHERE Title = 'Mr.'
AND MiddleName IS NOT NULL
UNION
SELECT FirstName,Title, MiddleName FROM Person.Person
WHERE MiddleName = 'a'
AND Title IS NOT NULL
ORDER BY FirstName ASC;

SELECT A.FirstName, A.HireDate, B.FirstName, B.HireDate
FROM Employees A, Employees B
WHERE DATEPART(YEAR, A.HireDate) = DATEPART(YEAR, B.HireDate);

USE AdventureWorks2012

SELECT AVG(TotalDue) AS VENDAS, DATEPART(MONTH, OrderDate) AS MÊS
FROM SALES.SalesOrderHeader
GROUP BY DATEPART(MONTH, OrderDate)
ORDER BY 2

SELECT AVG(TotalDue) AS VENDAS, DATEPART(YEAR, OrderDate) AS MÊS
FROM SALES.SalesOrderHeader
GROUP BY DATEPART(YEAR, OrderDate)
ORDER BY 2;

SELECT ProductID, ListPrice FROM Production.Product 
WHERE ListPrice >(SELECT AVG(ListPrice) FROM Production.Product)
ORDER BY 2;


