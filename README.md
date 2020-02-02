docker build -f Dockerfile -t docker-service-image .
docker images

# run the docker
docker run -p 8085:8080