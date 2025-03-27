 Java RMI Client-Server Communication System
 
This system will use Java RMI (Remote Method Invocation) to facilitate communication between a client and a server. Each time a client sends a request, the server increments a unique identifier (ID) and returns it to the client.

🎯 Project Goals

Establish a Client-Server Communication System

The client will send requests to the server using Java RMI.

The server will process each request and respond accordingly.

Automatic ID Incrementing on the Server

Each request received will trigger an increment in the identifier (ID).

IDs must be unique and managed in a thread-safe manner.

Ensure Scalability & Security

Handle multiple clients concurrently.

Secure communication using authentication.

Implement logging for debugging and monitoring.

