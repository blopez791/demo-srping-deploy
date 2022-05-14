## DESPLIEGUE DE APPS SPRING BOOT EN HEROKU

Crear archivo `system.properties` en el proyecto con el siguiente contenido

```
java.runtime.version=18
```

1. Crear cuenta en heroku y github
2. Tener git en el ordenador
   1. configurar credenciales en git
3. Subir el proyecto a Github desde Intellij IDEA usando la opcion VCS -> Share project on GiHub
4. Desde Heroku, crear app y elegir GitHub y buscar el repositorio subido
5. Habilitar deploy automatico y ejecutar el Deploy