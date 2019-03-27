#GraphQL demo using Sprint Boot and Spring JPA
-----

This demo uses following libraries-

- Spring Boot
- H2 Database for persistant
- Spring JPA
- GraphQL Java

#Running the demo locally
---

    git clone https://github.com/reethified/graphqlexamples.git
    cd graphqlexamples
    mvn clean install
    java -jar target/*.jar
    
Browse Graphql UI here- http://localhost:8443/bms/bms-graphiql

#Query samples:

- Create a book entry using mutation

        mutation {
          save(isbn: "100", title: "test", pubYear: "2018-01-01", price: 10)
        }
    
- View all books 

        {
          allBooks {
            title
            pubYear
            price
          }
        }


#Database configuration
---


You can also connect to H2 DB UI to query tables:  http://localhost:8443/bms/h2

    H2 database is enabled using below properties:
    spring.datasource.url=jdbc:h2:file:~/test
    spring.datasource.username=sa
    spring.datasource.password=
    spring.datasource.driver-class-name=org.h2.Driver
    
    # Show or not log for each sql query
    spring.jpa.show-sql = true
    
    # Hibernate ddl auto (create, create-drop, update)
    spring.jpa.hibernate.ddl-auto = update
    
    # Naming strategy
    spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy
    
    # Use spring.jpa.properties.* for Hibernate native properties (the prefix is
    # stripped before adding them to the entity manager)
    
    # The SQL dialect makes Hibernate generate better SQL for the chosen database
    spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.H2Dialect


####This demo also contains-
- How to use scalar like Date e.t.c

    SchemaClassScannerError: Unable to match type definition (TypeName{name='int'}) with java type (int): No TypeDefinition for type name int

