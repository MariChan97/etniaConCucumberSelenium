Feature: Test all function available on servicios section

@CardsAndPopUps
Scenario Outline: Validate click on pop ups
Given I am navigating on servicios
When I click the <card>
Then the <popUp> is displayed
Examples:
|card         |popUp        |
|Diseño C     |Diseño   P   |
|Desarrollo C |Desarrollo P |
|Edicion C    |Edicion P    |
|Fotografia C |Fotografia P |

@DiseñoCard
Scenario Outline: Validate the text and button are displayed
Given I am navigatin on servicios
When I am insdide the <card>
Then i can see the <labels>
And the Presupuesto button works
|card       |labels              |
|diseño     |desafios creativos..|
|desarrollo |think different ..  |
|edicion    |arte digital..      |
|fotografia |ojo y corazon..     |

@PresupuestoBtn
Scenario: Validate presupuesto button functionality
Given I am navigating on servicios
When I click on Presupuesto button
Then the page goes down to contacto section