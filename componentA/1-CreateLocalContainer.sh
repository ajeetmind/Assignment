mvn install

docker build -t componenta:v1 .


docker run --name componenta --publish 8081:8081 --detach componenta:v1
curl http://localhost:8081


docker stop componenta
docker rm componenta


docker image ls componenta:v1


ocker rmi componenta:v1