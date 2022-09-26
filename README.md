# WebAppCRUD
==About==

CRUD database web app.
==Development==

The app was developed using Eclipse IDE, Spring-MVC, Hibernate 5, Tomcat 9, C3PO library, MYSQL workbench.

==Development Process==

	First Phase:
First thing first was to create the database using MYSQL workbench including tables, relationships and dummy data.
Tables: 7 tables but for this stage of the project not all of them have been used.

Next step was to configure the project servlet.xml (xml), creating necessary beans for hibernate, c3po and database data source and adding support for loading ccs files.

Then a testing servlet was created in order to test the DB connection.

And lastly to create a controller class and JSP class to test that everything goes as it should be.

	The second phase:
Create all the POJO java classes and map them to database tables using hibernate and spring annotations.

Next was to create DAO and Service interface alongside their implementation and JSP files .

	Last phase:
And lastly, create the business logic and connect everything :).
