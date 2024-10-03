@Carrito
Feature: Compra de un articulo con Tarjeta de Credito
  Yo como usuario de la tienda DemoGuru99
  Quiero comprar un articulo con una tarjeta de credito
  Para ahorrar tiempo en hacer un tramite personal

  @Carrito1
  Scenario: Compro una sola vez
    Given que accedo a la pagina DemoGuru
    When doy click en generar tarjeta
    #And capturo los datos de la tarjeta
    #And selecciono la cantidad de productos al carrito y le doy comprar
    #Then ingreso los datos de la tarjeta
