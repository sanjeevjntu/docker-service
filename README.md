## Building the docker image using Dockerfile
docker build -f Dockerfile -t docker-service-image .

## Check your image
docker images

# run the docker
docker run -p 8085:8080 docker-service-image

# description:
port redirection of docker container happens from the exposed container port 8085 
to the app port 8080