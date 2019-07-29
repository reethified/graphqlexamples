##GraphQL Node2

This node only contains a dummy resolver to provide annotate the supplied message with Hello.

Running this demo locally
-------------------------

    cd graphql-node2
    mvn clean install
    java -jar target/*.jar
    
Browse Graphql UI here- http://localhost:8444/bms/bms-graphiql

Query samples:

    {
               node2Hi(message:"hello world")
    }
    
RESULT

    {
      "data": {
        "node2Hi": "Hello:hello world"
      }
    }