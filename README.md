# Фреймворк Spring (семинары)
### Урок 2. Основы Spring. Spring Boot

```java
/**
* Домашнее задание
* 
* Напрограммировать электронную очередь.
* 1. Класс TicketNumberGenerator - бин (синглтон), у которого есть метод createNewNumber()
* 1.1 Метод createNewNumber возвращает строки вида "Ticket #X", где X - UUID (UUID.randomUUID().toString())
* <p>
* Пример:
* TicketNumberGenerator generator = context.getBean(TicketNumberGenerator.class);
* System.out.println(generator.createNewNumber()); // "Ticket #b0b3a25d-2135-4b18-9dec-08d494b96b06"
* System.out.println(generator.createNewNumber()); // "Ticket #379c5673-50c3-4daf-a53f-a396a3d34535"
* System.out.println(generator.createNewNumber()); // "Ticket #b4cc4e55-69b2-4c49-867f-09735fea292a"
* <p>
* Создать класс Ticket (не бин!!!) с полями:
* 2.1. String number - номер тикета
* 2.2. LocalDateTime createdAt - дата создания
* 2.3. ... (любые другие поля)
* <p>
* Класс "Табло" - бин (синглтон), у которого есть поле ticketNumberGenerator
* и метод метод newTicket(), который создает объетк класса Ticket с значениями полей:
* 3.1 number - результат вызова TicketNumberGenerator#createNewNumber
* 3.2 createdAt - LocalDateTime.now()
* 3.3 ...
  */
```

### Урок 3. Использование Spring для разработки серверного приложения, на основе REST
```java
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
```
### Урок 4 Spring MVC. Использование шаблонизатора Thymeleaf
```java
/**
 * ВАЖНО!
 * 		Перед выполнением ДЗ предполагается, что ДЗ №3 выполнено (т.е. в проекте есть сущность Project).
 * 		Если это не реализовано - нужно сначала завершить ДЗ №3.
 *
 * 		1. Сделать страницу project-page.html по аналогии с timesheet-page.html
 * 		2. В timesheets-page в колонку "Проекты" добавить ссылку на проект
 * 		Для этого необходимо:
 * 		2.1 в TimesheetPageDto добавить поле projectId (для создания ссылки)
 * 		2.2 в timesheets-page в колонку "проекты" сделать гиперссылку (по аналогии с колонкой "перейти")
 */
```
### Урок 5 Spring Data для работы с базами данных
```java
/**
 * 1. Создать класс Employee - Сотрудник с полями
 * 1.1 Идентификтаор
 * 1.2 Имя (и фамилия)
 * 1.3 ...
 * 1.4 Создать контроллер-сервис-репозиторий для этой сущности
 *
 * 2. В timesheet добавить поле employee типа Employee (или employeeId тип Long)
 * 3. Создать ресурс /employees/{id}/timesheets - получить все таймшиты по сотруднику
 *
 * 4. ** Связываем Project <-> Employee отношением ManyToMany
 * 4.1 Т.е. на проекте может быть несколько сотрдников; один сотрудник может быть на нескольких проектах.
 */
```