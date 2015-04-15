# hod-embedded

Description:
===========
[Takipi](https://app.takipi.com/) - tester . 
web application run with tomcat .

Requirements:
==========
* Java ( >=1.6 )
* maven

To Run: 
==========
```
export MAVEN_OTS="-agentlib:TakipiAgent"
mvn complie package 
mvn tomcat7:run
```

brows to http://localhost:8080/hod-embedded/FirstServlet
make sure [Takipi](https://app.takipi.com/) caught this exception.
