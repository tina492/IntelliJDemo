Feature: Daily tasks

  Scenario Outline: Visiting websites
    Given  I am visiting in "<website>"
    When I access "<page>"
    Then I am greeted with "<message>"
    Examples:
    | website  | page            | message      |
    | Amazon   | wwww.amazon.es  | Compra!      |
    | Google   | www.google.es   | Busque!      |
    | Gmail    | www.gmail.com   | Correo       |
    | El Pais  | wwww.elpais.com | Lea noticias |