mvn clean install -DskipTests

mvn spring-boot:run

mvn test

Stop in mac:

kill `lsof -i -n -P | grep TCP | grep 8080 | tr -s " " "\n" | sed -n 2p`


