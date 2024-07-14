1. 200 OK: Успешный запрос.

```java
return ResponseEntity.ok(ответ);
```
2. 201 Created: Успешное создание ресурса.

```java
return ResponseEntity.status(HttpStatus.CREATED).body(ответ);
```

3. 204 No Content: Успешный запрос, но без содержимого.
```java
return ResponseEntity.noContent().build();
```

4. 400 Bad Request: Некорректный запрос.

```java
return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ошибка);
```

5. 401 Unauthorized: Неавторизован.

```java
return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ошибка);
```

6. 403 Forbidden: Доступ запрещен.

```java
return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ошибка);
```

7. 404 Not Found: Ресурс не найден.

```java
return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ошибка);
```

8. 500 Internal Server Error: Внутренняя ошибка сервера.

```java
return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ошибка);
```

Примеры использования:
```java
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/ok")
    public ResponseEntity<String> getOk() {
        return ResponseEntity.ok("Запрос выполнен успешно");
    }

    @PostMapping("/create")
    public ResponseEntity<String> createResource(@RequestBody MyResource resource) {
        // логика создания ресурса
        return ResponseEntity.status(HttpStatus.CREATED).body("Ресурс создан");
    }

    @GetMapping("/bad-request")
    public ResponseEntity<String> getBadRequest() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Некорректный запрос");
    }
    
}
```
