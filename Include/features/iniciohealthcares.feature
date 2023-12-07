Feature: Iniciar sesión en CURA Healhcare Service de Katalon
  Esta plantilla se utilizara para el archivo feature

  Scenario: Inicio healthcare
    Given Ingresar al navegador
    And Ingresar a la pagina web
    And Doy click al boton de ingreso
    When Tomo e inserto los datos
    And Click en boton de ingreso de datos
    Then Seleccionar una instalacion
    And Seleccionar programa Medicaid
    And Ingreso la fecha del covid
    And Click en el boton y cerrar