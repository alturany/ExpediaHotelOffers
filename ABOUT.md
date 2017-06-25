
I have picked java since it has been almost 12 years of being Java developer.

To run on your local machine
1) Install java 8 JDK, http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2) define JAVA_HOME path variable, https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/
3) Install Git, https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
4) download the project from GitHub 
git clone https://github.com/alturany/ExpediaHotelOffers.git
5) from Git Bash command line in root directory of project type the following command
Linux command: ./mvnw spring-boot:run 
Windows command: mvnw.cmd spring-boot:run
 
if you run the project from eclipse then you need to shut-down the server using this linux command
curl -X POST localhost:8080/shutdown

Heroku link
https://expedia-hotel-offer2.herokuapp.com/ 

Notes:

1) localization should be done 

2) I have invested in crafting a generic URI builder

3) used Spring APIs to simplify my code as much as possible

4) used layers to separate concerns 

4) no previous experience in
    1)Maven
    2)Git
    3)Spring
    4)Rest services
    5)Jackson JSON
    6)ThymeLeaf
    7)bootstrap
 Since I had no experience in almost all used technologies, that has leaded to:
 a) it took me much more longer time than your estimation.
 b) basic scenarios testing has been done; no in depth testing.
 c) search form is primitive, date picker should has been used instead of date fields
 d) results page is very primitive.
 
