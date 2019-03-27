GraphQL demo using Sprint Boot and Spring JPA
=======

This demo uses following libraries-

- Spring Boot
- H2 Database for persistant
- Spring JPA
- GraphQL Java

Running the demo locally
---

    git clone https://github.com/reethified/graphqlexamples.git
    cd graphqlexamples
    mvn clean install
    java -jar target/*.jar
    
Browse Graphql UI here- http://localhost:8443/bms/bms-graphiql

Query samples:

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


Database configuration
-------

You can also connect to H2 DB UI to query tables:  http://localhost:8443/bms/h2
Refer to application property file for more details on h2 database.

####This demo also contains-
- How to use scalar like Date e.t.c

        SchemaClassScannerError: Unable to match type definition (TypeName{name='int'}) with java type (int): No TypeDefinition for type name int

