FROM openjdk:11
RUN mkdir -p /app/
COPY ./build/libs/grocery*.jar /app/grocery.jar
WORKDIR /app
EXPOSE 6061
#ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://quirky_hofstadter/test", "-jar","grocery.jar"]
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongocontainer/test","-jar","grocery.jar"]

#ENTRYPOINT ["java", "-jar", "grocery.jar"]



