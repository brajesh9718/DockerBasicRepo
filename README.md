# DockerBasicRepo
This repo created to store spring boot app to create there Image using Dockerfile or direct by mvn inbuilt command.


Case 1: Create docker image using Dockerfile 

  *command : docker build  -t   <Docker Image Name>  .
  
Case 2: Create docker image without using docker file (Spring boot support inbuild Docker so run below command)
  
  command : mvn spring-boot : build-image
  
  
Case 3: Run Build Docker Image 
  
  command : docker run -p 8080:8080 (any port can be config)  <image-name>/<image-id>
  

Case 4: Browse service using url 
  
     URI :  https://<docker-machine-ip>:<image/container-port>/api
  
  HINT: [when you start docker machine by docker tool it look like below ]
  
  **docker is configured to use the default machine with IP 192.168.99.100
For help getting started, check out the docs at https://docs.docker.com **
  

