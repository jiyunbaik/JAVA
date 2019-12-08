Create an application for a party supply store based in Niagara Falls. The owner receives orders from both Canadian and USA clients. 
•	Canadian clients use metric system for their orders (meters, kilos, liters, kilometers) while USA clients use imperial system (feet, pounds, gallons, miles). 
•	Canadian clients pay in CAD dollars and USA clients use USD
The store is based in Canada and has the following initial inventory:
•	Ribbons – yellow, red, blue, purple, green, 20 m of each, 2 CAD/meter
•	Candy – lemon, strawberry, raspberry, 10 kg of each, 5 CAD/kilogram
•	Juice – orange, apple, grape, mango, 15 l of each, 3 CAD/liter
There is a delivery charge for every order – distance to destination in km (every km is $1 extra)
Create a class Store that would keep inventory and process orders. 
It will use static methods of a utility class named Converter for conversion between metric and imperial systems as well as currency conversion.
The application should accept orders from clients one by one. For each order the following information is required:
•	Client’s name
•	Country (USA or Canada)
•	Color of ribbon and length
•	Type of candy and weight
•	Type of juice and volume
•	Distance for delivery
Create a class Order for recording this information. For every order pass an object of class Order to class Store for processing.
The store should update its inventory after every order and present the client with the final bill in appropriate currency (including delivery charge). 
 
In case of insufficient stock for any item in the order the client will be sold the remaining stock and notified. For example, the client orders 5 lbs of lemon candy, however there are only 0.9 kg of lemon candy left in the store. 
The client will be billed for 0.9 kg and notified “We have only 2 lbs of lemon candy left for you order”.
