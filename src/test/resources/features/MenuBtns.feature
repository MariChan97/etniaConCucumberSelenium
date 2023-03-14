Feature: Try with all the main menu options

  @MainMenu
  Scenario Outline: Click on main menu buttons
    Given I navigating on "www.etniadigital.com"
    When  I click on <mainMenuOption>
    Then I assert the page goes to the correct "<span>"
    Examples:
 | mainMenuOption    | Span                     |
 | nosotrosButton    | Sobre Nosotros           |
 | portfolioButton   | Algunos De               |
 | serviciosButton   | Servivios                |
 | contactoButton    | Conectá con tu comunidad |