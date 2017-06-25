
I have picked java since it has been almost 12 years of being Java developer.

//To run on your server, download the project from GitHub then in root directory of project type the following linux command
 ./mvnw spring-boot:run 

 
//To shutdown, use this linux command
curl -X POST localhost:8080/shutdown

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