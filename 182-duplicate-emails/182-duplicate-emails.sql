# Write your MySQL query statement below

SELECT email 

FROM 
    (SELECT *,
row_number() OVER(PARTITION BY email ) AS rn
FROM Person)x

WHERE rn = 2