Feature: Try all function available on Home page section

  @MainMenu
    Scenario Outline: See all menu options available
    Given I navigating on "www.etniadigital.com"
    Then I see the following <options>
    Examples:
    |options  |
    |home     |
    |nosotros |
    |portfolio|
    |servicios|
    |contacto |

  @MenuOptions
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
 
  @SocialBtns
   Scenario Outline: As a customer I try the diferent social buttons
   Given I navitaging on "www.etniadigital.com"
   When I click on <socialBtn>
   Then I go to the proper <webSite>
   Examples:
   |socialBtn     |webSite    |
   |Whatsapp Btn  |Whatsapp   |
   |Insta Btn     |Instagram  |
   |Fb Btn        |Facebook   |

  @HeroBtns
    Scenario Outline: As a customer I try the hero buttons
    Given I navigating on "www.etniadigital.com"
    When I click on <Hero Btn>
    Then I go to the proper <section> in the page
    Examples:
    |Hero Btn    |section          |
    |Escribinos! |ContactoSection  |
    |Conocenos   |NosotrosSection  |

  @MouseBtn
    Scenario: As a customer I want to try the mouse button
    Given I navigating on "www.etniadigital.com"
    When I click on the mouse button
    Then I go to the section nosotros
    And I can see the proper span