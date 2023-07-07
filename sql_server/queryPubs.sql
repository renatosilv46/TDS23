USE pubs 

SELECT * FROM sys.tables

	SELECT * FROM authors

SELECT  au_lname, 
	au_fname 
FROM authors ORDER BY au_fname DESC;

SELECT TOP 5 *
	FROM dbo.sales ORDER BY qty;


SELECT * FROM dbo.authors
WHERE state = 'CA'
AND contract = '0'
ORDER BY city;

SELECT SUM(qty) AS 'VENDAS TOTAIS'
FROM dbo.sales


SELECT au_id, au_lname, au_fname, phone, address, city, state, zip, contract FROM
authors WHERE au_fname LIKE 'a%'


SELECT authors.*, titleauthor.* FROM authors,titleauthor WHERE authors.au_id =
titleauthor.au_id


INSERT INTO titleauthor(au_id, title_id, au_ord, royaltyper)
VALUES(1172-32-1176, 'PS3333', '1', '100');


--É USADO PARA RETORNAR DADOS DISTINTOS...
SELECT DISTINCT au_id FROM titleauthor;








SELECT * FROM publishers
SELECT * FROM titles

--SELECT

--authors
--publishers
--titles

