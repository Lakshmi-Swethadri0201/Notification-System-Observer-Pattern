Notification System

The purpose of this application is to get the details of a product order in a shop and broadcast 
the details of delivery to all the registered drivers. Incase of any updates in the product delivery
the drivers will be notified again.

#Features implemented

1.Design pattern used: Observer Pattern:
	I have used Observer pattern which will make it easier to broadcast the information to all the drivers.
This pattern makes it easier to communicate the request to all the drivers using one to many relationship
without having any dependency on the Subject(Shop Class).

2.Shop Class implements an interface Observable which has register, unregister and notifyAllObservers methods.
	Shop class maintains drivers list in order to allow registering, un Registering and notify the drivers. 
This is achieved by overriding the methods from the Obseravble interface. This makes it easier to add or remove driver 
objects in future providing flexibility to the code. Duplicated code is avoided by overriding the methods 
from observable interface and by overriding the observer interfaces update method.

3.VanDriver and TaxiDriver implements observer interface:
	Driver class is a parent class, VanDriver and TaxiDriver child classes extend this parent class. Thus common functionalities of Driver
functionality are in Driver class. VanDriver and TaxiDriver implements observer interface which have update method.

4.Order class: 
	User places an order from a specific shop, Once the order is placed, Shop receives order, process delivery request.
	
5.Delivery Request:
	Delivery request class contains deliveryRequest method to handle and process orders and then it sends notification to all corresponding drivers.
Drivers are notified with customer name and delivery address.

For testing purpose,

--> 2 shops walmart and target are created which are part of consortium.
--> 5 taxi and 2 van drivers are created
--> 4 taxi drivers and 1 can driver registered to walmart shop, 2 drivers registered to target shop
--> Once the walmart receives order,delivery  notification is sent to corresponding drivers.
--> Removing registered drivers from walmart, and then creating a new order, sends notification only to updated list of drivers.

Junit test cases are implemented accordingly.

Assumptions:

-->Product price, category, payment parts are not handled in the application.
-->Assuming there are only 2 shops in the consortium, walmart and target

Future implementation:

--> payment gateway, driver queues and nearest customer destination analysis etc can be incorporated.

Git RepoLink:
https://github.com/metcs/met-cs665-assignment-2-Lakshmi-Swethadri0201


# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the Main Java executable. 




# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




