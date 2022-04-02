## Версия 1
Запуск в контейнере ужа скомпилированного jar файла

1. `gradle build`
2. `docker build ./ -t my/java-docker:1`
3. `docker run -i my/java-docker:4`