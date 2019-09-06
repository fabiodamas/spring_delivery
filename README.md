# spring_delivery
Delivery de comida em Spring (Baseado no livro de Spring Boot)


<h3> Passos para execução no docker: </h3>
* Criação do container
mvn -DskipTests clean package docker:build

* Execução
docker run -p 8080:8080 greendogdelivery:latest

* Gerenciador de Containers
docker run -d -p 9000:9000 -v /var/run/docker.sock:/var/run/docker.sock portainer/portainer