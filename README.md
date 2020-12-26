# spring-bean-scope
  1. Singleton
  2. Prototype
  3. Request
  4. Session
  5. Application
  6. Websocket
  
Note - No "Global Session" scope. Spring removed this scope with the 5.x release. No support for portlet.

1. singleton – only one instance of the spring bean will be created for the spring container. This is the default spring bean scope. While using this scope, make        sure bean doesn’t have shared instance variables otherwise it might lead to data inconsistency issues.

2. prototype – A new instance will be created every time the bean is requested from the spring container.

3. request – This is same as prototype scope, however it’s meant to be used for web applications. A new instance of the bean will be created for each HTTP request.

4. session – A new bean will be created for each HTTP session by the container.

5. The application scope creates the bean instance for the lifecycle of a ServletContext and the websocket scope creates it for a particular WebSocket session.
