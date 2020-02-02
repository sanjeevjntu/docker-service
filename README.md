## Building the docker image using Dockerfile
docker build -f Dockerfile -t docker-service-image .

## Check your image
docker images

# run the docker
docker run -p 8085:8080