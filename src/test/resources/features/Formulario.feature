@Novus
Feature: Automatización de Formulario

  @Formulario
  Scenario Outline: Ingreso de Datos
    Given ingreso a la pagina de NovusTechnology
    And ingreso los datos del formulario
      | Nombre | Apellido | Pasatiempos | Género    |
      | York   | Correa   | Deportes    | Masculino |
    And ingresamos el numero de telefono y correo electronico "<CorreoElectronico>"
    And seleccionamos "<Departamento>" y la primera ciudad
    And seleccionamoslos comandos de selenium y cargamos una imagen
    Then hacemos click en el boton enviar y valida el mensaje "Información Personal"
    Examples:
      | CorreoElectronico   | Departamento |
      | yorkcorrea@test.com | LIMA         |


    @Error
    Scenario: Validar mensaje de error
      Given ingreso a la pagina de NovusTechnology
      And valido el mensaje de error "Este campo es obligatorio"


    @Toast
    Scenario: Comprobar Toast de la pagina NovusTechnology
      Given ingreso a la pagina de NovusTechnology
      When doy click al Toast
      Then valido que se muestre el Toast

     @Alerta
     Scenario: Comprobar Alerta de la pagina NovusTechnology
       Given ingreso a la pagina de NovusTechnology
       #When me posiciono en la parte inferior de la web
       Then valido que al aceptar se abra una nueva ventana y si hago click en cancelar no haga nada

    @Csv
    Scenario: INgreso datos mediante CSV
      Given ingreso a la pagina de NovusTechnology
      Then ingresamos la data










