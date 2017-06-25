# ExpediaHotelOffers

To run on your local machine
1) Install java 8 JDK, http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2) define JAVA_HOME path variable, https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/
3) Install Git, https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
4) download the project from GitHub 
git clone https://github.com/alturany/ExpediaHotelOffers.git
5) from Git Bash command line in root directory of project use the following command

Linux command: ./mvnw spring-boot:run 

6) to shut-down the server 

linux command: curl -X POST localhost:8080/shutdown