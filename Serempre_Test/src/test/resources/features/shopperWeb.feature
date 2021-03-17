#language: es

  Característica: registro de usuario
    Yo como usuario deseo validar el registro de los clientes
    para validar el correcto funcionamiento del aplciativo ShopperWeb

  Esquema del escenario: Registrar usuario consumidor
    Dado que el usuario ingresa a la pagina
    Cuando ingresa los datos de registro
      |<ciudad> |<nombre>   |<apellido>|<correoElectronico>|<dirección>|
    Entonces valida que el mensaje es <mensaje>
  Ejemplos:
  |ciudad  |nombre   |apellido  |correoElectronico   |dirección     |mensaje                         |
  |Bogotá  |MiNombre |MiApellido|micorreo@mail.com.co|Cra. 13 #96-67|¡Te has registrado exitosamente!|


