# Hello Developer & Operator!

To build and run this simple application using *docker*
try in your terminal next few commands

## Build image

    $ ./gradlew bootJar
    $ docker build -t devops101 .

or alternatively

    $ ./gradlew bootBuildImage --imageName devops101

## Run container

    $ docker run -p 8080:8080 devops101:latest