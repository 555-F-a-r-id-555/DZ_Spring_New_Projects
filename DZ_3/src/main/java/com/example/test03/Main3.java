package com.example.test03;

/**
 * 1. Повторить все, что на семниаре
 * 2. В объект timesheet в поле createdAt должно подставляться текущее время на стороне сервера!
 * Т.е. не клиент присылает, а севрер устанавливает.
 * 3. Создать отдельный контроллер для проектов (поле Timesheet.project)
 * 3.1 Создать класс Project с полями id, name
 * 3.2 Создать CRUD-контроллер для класса Project, сервис и репозиторий
 * 3.3 В ресурсе Timesheet поле project изменить на projectId
 * 3.4 При создании Timesheet проверять, что project с идентификатором projectId существует
 *
 * * 4. Создать ресурс /projects/{id}/timesheets - загрузить таймашиты для конкретного проекта
 * ** 5. Создать ресурс /timesheets?createdAtAfter=2024-07-04
 *       - ручка для получения всех таймшитов, которые созданы ПОСЛЕ указанного параметра.
 *       Аналогично createdAtBefore
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main3 {

	public static void main(String[] args) {
		SpringApplication.run(Main3.class, args);
	}

}
