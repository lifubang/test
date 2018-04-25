FROM docker.acmcoder.com/public/maven:3.5.3-jdk-8
COPY ./* /usr/src/mymaven/
WORKDIR /usr/src/mymaven
RUN mvn package
CMD mvn