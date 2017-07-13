# spring-core

1. Create a Product class with “pid, pname, price” and initialize the product object using bean configuration file. Get product object from the spring container and display the product information. 

Note: To display the product information do not write any extra method; instead use object class method. 

2. Create a Products class with “List<Product>” and Product with “pid, pname, price”. Create “n” number (any number of your choice) of products and add those products to the list and show the products information in ascending order of price.

Note: The product object creation and adding products to product list should be done using configuration file. 

3. Create an Employee class with “empno, ename, email, mobile, address”; address is of type class “Address” with the fields “street, city, state, country”. Get the employee object from the container and display details.

Note: Dependency injection should be done using constructor injection.

4. Create a DbConnection class with “drivername, username, password, url, getConnection()”. Set the properties of DbConnection and return DbConnection object when getConnection() is invoked. 

Note: Read the DbConnection properties from the properties file. Do not hardcode those values in configuration file. 

5. In a company there are three categories of employees Developer, Trainer and Trainee. There are rules that these three types of employees have to follow; however the rules are specific to each type of employee. 

a. Write a menu driven program based on user input (ie, category of employee) to display the rules for that category of employee.
b. Do not create object using new operator.
c. Make your application flexible so that additional categories can be added, based on future requirements.
