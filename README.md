1.  Start the server

gradle bootrun


2.  call the API

GET http://localhost:8080/api/test

3.  review logs (note no logs)

4.  comment out line 10 (@Component) in AResponseInterceptor.java

5.  restart app server

6.  call API as above

7.  review logs
