# Hello Developer & Operator!

To build and run this simple application using *docker*
try in your terminal next few commands

## Build image

    $ docker build -t devops101 .

or alternatively

    $ ./gradlew bootBuildImage --imageName devops101

## Run container

    $ docker run -p 8080:8080 devops101:latest

## Future finish

    $ docker-compose up

### Milestones

* Author centric Activity monitoring
  * Backlog store Reading and Watching as Activity
* Recognize Active || Pasive && Pasive-Active states
* Bibliography collect references on sources on-line
* Bookmark keep by Receptionist serves Author(s)
  * Librerian record Article(s) of Author(s)