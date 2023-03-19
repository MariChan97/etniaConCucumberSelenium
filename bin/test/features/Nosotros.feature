Feature: Test all function on nosotros section

@Buttons
Scenario Outline: Validate the correct function of the buttons
Given I navigating on nosotros section
When I click on the <button>
Then the page does the correct <behaviour>
Examples:
|button       |behaviour               |
|portfolio    |go to portfolio         |
|brochure PDF |download a PDF file     |

@LogoBtn
Scenario: Validate the correct function of logo button
Given I navigating on nosotros section
When I click on the logo button
Then the page goes up to Home

@Labels
Scenario Outline: Validate all labels are displayed
Given I navigating on nosotros section
Then I can see te following <Labels>
Examples:
|Labels         |
|Sobre Nosotros |
|Sin Certezas   |
|Con Ingenio    |
|Y Creatividad  |
|Ya Sos Parte   |

@Paragraphs
Scenario Outline: Validate all text is displayed
Given I am on nosotros section
Then I can see all <text> is displayed
Examples:
|text                    |
|Un equipo apasionado... |
|Nos enfocamos en...     |

