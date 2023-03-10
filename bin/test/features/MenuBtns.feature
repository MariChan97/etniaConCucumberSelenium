Feature: Try with all the main menu options

  @MainMenu
  Scenario Outline: Click on main menu buttons
    Given I navigate to "www.etniadigital.com"
    And I click on "<MenuOption>"
    Then I assert that the page goes to the correct section because i see the proper "<span>"
    Examples:
      | menuOption        | Span                     |
      | nosotrosButton    | Sobre Nosotros           |
      | portfolioButton   | Algunos De               |
      | serviciosButton   | Servivios                |
      | contactoButton    | Conectá con tu comunidad |