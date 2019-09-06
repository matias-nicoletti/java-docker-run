# Dockerized Kotlin Console Application example using Gradle

### Build
Gradle build
```
./gradlew build
```
Build docker image:
```
docker build -t java-docker-run .
```

### Running

Specify jvm params after image name
```
docker run java-docker-run param1 param2
```
Expected output
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.7.RELEASE)

2019-09-06 17:33:47.916  INFO 1 --- [           main] c.m.j.JavaDockerRunApplicationKt         : Starting JavaDockerRunApplicationKt on 37c1510cac3b with PID 1 (/app.jar started by root in /)
2019-09-06 17:33:47.921  INFO 1 --- [           main] c.m.j.JavaDockerRunApplicationKt         : No active profile set, falling back to default profiles: default
2019-09-06 17:33:48.983  INFO 1 --- [           main] c.m.j.JavaDockerRunApplicationKt         : Started JavaDockerRunApplicationKt in 2.009 seconds (JVM running for 2.938)
STARTING THE APPLICATION
Hello World! parameters: param1, param2
APPLICATION FINISHED
```


