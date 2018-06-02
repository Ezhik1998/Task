SELECT  SUM(Users_num) AS Total_users_quantity
FROM mobile_operator.tariff;

SELECT * FROM tariff ORDER BY Month_fee;

SELECT Name, Month_fee FROM tariff WHERE Internet_traffic BETWEEN 1000 AND 3000;