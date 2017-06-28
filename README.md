# Expedia Hotel Offers

### To run the application on Linux or Bash shell on Windows
1. Install [java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
1. define JAVA_HOME path variable [here](https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/)
1. Install [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
1. Download the project from GitHub 
```
git clone https://github.com/alturany/ExpediaHotelOffers.git
```
5. Execute this Maven command to run the server 
```
./mvnw spring-boot:run
``` 
6. Execute this command to shut-down the server  
```
curl -X POST localhost:8080/shutdown
```
### Alternativly 
1. Install [java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or [Java 8 JRE](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)
1. Install [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
1. Download the project from GitHub 
```
git clone https://github.com/alturany/ExpediaHotelOffers.git
```
4. Execute this command In project's root directory
```
java -jar ./target/offerservice-0.0.1.jar
```
