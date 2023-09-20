# Инструкция по запуску
Для запуска проекта необходимо убедиться что на машине установлена java версии 17 и maven.
Далее в командной строке из корня проекта выполнить команду `mvn exec:java -Dexec.mainClass="com.example.demo.DemoApplication"`
## Эндпоинты
### GET /ok
Сервер вернет строку "OK!"
### POST /person
Запрос должен содержать json с параметрами "first_name", "last_name" и "year_of_birth"

Сервер вернет ответ в виде json с параметрами "full_name" и "age"
