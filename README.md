# xp4dev-logging

## Actuator
```
$ curl -X GET http://localhost:8080/actuator | jq .

{
  "_links": {
    "self": {
      "href": "http://localhost:8080/actuator",
      "templated": false
    },
    "health": {
      "href": "http://localhost:8080/actuator/health",
      "templated": false
    },
    "health-path": {
      "href": "http://localhost:8080/actuator/health/{*path}",
      "templated": true
    },
    "shutdown": {
      "href": "http://localhost:8080/actuator/shutdown",
      "templated": false
    },
    "loggers": {
      "href": "http://localhost:8080/actuator/loggers",
      "templated": false
    },
    "loggers-name": {
      "href": "http://localhost:8080/actuator/loggers/{name}",
      "templated": true
    }
  }
}
```

## Loggers
```
$ curl -X GET http://localhost:8080/actuator/loggers | jq .
$ curl -X GET http://localhost:8080/actuator/loggers/dev.xp4.article | jq .
$ curl -X GET http://localhost:8080/actuator/loggers/dev.xp4.article.tasks | jq .
```

## Loggers Change level
```
curl -X POST http://localhost:8080/actuator/loggers/ROOT \
--header "Accept: application/json" \
--header "Content-Type: application/json" \
--data-raw "{ \"configuredLevel\": \"ERROR\" }"  | jq .
```

```
$ curl -X GET http://localhost:8080/actuator/loggers/ROOT | jq .
{
  "configuredLevel": "ERROR",
  "effectiveLevel": "ERROR"
}
```
