## Версия 1
Запуск в контейнере ужа скомпилированного jar файла

1. `gradle build`
2. `docker build ./ -t my/java-docker:1`
3. `docker run -i my/java-docker:1`

## Версия 2 c jib
1. `gradle jibDockerBuild --image=my/java-docker:2jib`
2. `docker run -i my/java-docker:2jib`