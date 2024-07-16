# Spring Boot User API

Este proyecto es una aplicación Spring Boot que proporciona una API para enviar una lista de usuarios a la vista en formato JSON. La API incluye endpoints para obtener detalles de un usuario y una lista de usuarios. Esto es útil para servir datos a un frontend en aplicaciones web.

## Características

- **API RESTful**: La aplicación expone varios endpoints para obtener información de usuarios.
- **DTO (Data Transfer Object)**: Utiliza DTOs para transferir datos de usuario.
- **Formato JSON**: Los datos se envían en formato JSON, lo que facilita la integración con frontend modernos.

## Endpoints

### Obtener Lista de Usuarios

- **URL**: `http://localhost:8090/api/list`
- **Método**: `GET`
- **Descripción**: Devuelve una lista de usuarios en formato JSON.
- **Ejemplo de Respuesta**:
  ```json
  [
    {
      "firstName": "David",
      "lastName": "Erazo"
    },
    {
      "firstName": "Sebastian",
      "lastName": "Chicaiza"
    },
    {
      "firstName": "Juan",
      "lastName": "Erazo"
    }
  ]
