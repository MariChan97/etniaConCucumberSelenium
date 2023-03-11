Feature: Try with all the main menu options

  @MainMenu
  Scenario Outline: Click on main menu buttons
    Given I navigating on "www.etniadigital.com"
    When  I click on <mainMenuOption>
    Then I assert that the page goes to the correct "<span>"
    Examples:
      | mainMenuOption    | span                 |
      | Nosotros          | spanSobreNosotros    |
      | Portfolio         | spanAlgunosDe        |
      | Servicios         | spanServicios        |
      | Contacto          | spanConectaComunidad |