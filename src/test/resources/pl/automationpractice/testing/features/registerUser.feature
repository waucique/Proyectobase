# language: es

Característica: Registrar usuario

  Escenario: Registro exitoso
    Dado que estoy en automation practice
    Cuando registro la información del usuario
      | email | firstName | lastName | password | day | month | year | company | address | address2 | city | state | zipCode | country | homePhone | mobilePhone |
      | william@testing.es | William | Camilo | William.123* | 5 | May | 1993 | SQA | Clle 89b 117 21  | int 25 | Bogota | Alaska | 12345 | United States | 16363564 | 3233215432 |
    Entonces debo verificar mensaje de registro