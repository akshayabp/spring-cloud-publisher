FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN apk update && apk add bash
RUN mkdir -p /usr/local/vehicle_locator_spring_cloud_publisher
ADD @project.build.finalName@.jar /usr/local/vehicle_locator_spring_cloud_publisher/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
EXPOSE 8082