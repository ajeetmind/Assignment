dotnet build ./webapp
dotnet run --project ./webapp 
curl http://localhost:5000


dotnet publish -c Release ./webapp


docker build -t componentb:v1 .




docker run --name componentb --publish 8082:80 --detach componentb:v1
curl http://localhost:8082


#Delete the running webapp container
docker stop componentb
docker rm componentb


docker image ls componentb:v1

docker rmi componentb:v1

helm install testa helm-charts