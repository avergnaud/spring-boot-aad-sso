# spring-boot-aad-sso

```
podman container run -it --rm --name demo-sso-web-local -v ${pwd}:/usr/src/demo-sso-web-local -w /usr/src/demo-sso-web-local -p 8080:8080 maven:3.9-eclipse-temurin-17-alpine sh
```

puis
```
mvn clean package
```

puis
```
mvn spring-boot:run
```