# new feature
# Tags: optional
#language: fr

Fonctionnalité: Un étudiant remplie et valide le formulaire d'inscription

  Scénario: Un étudiant remplie et valide le formulaire d'inscription
    Soit Un étudiant sur le site "https://demoqa.com/login"
    Quand il saisit son userName "User"
    Et il saisit son password "Name"
    Et il clique sur le bouton login
    Alors le message d'erreur "Invalid username or password!" apparait en rouge
    
  Plan du Scénario: Un étudiant remplie et valide le formulaire d'inscription
    Soit Un étudiant sur le site <url>
    Quand il saisit son userName <username>
    Et il saisit son password <password>
    Et il clique sur le bouton login
    Alors le message d'erreur <message> apparait en rouge
    Exemples:
    | url                       | username | password | message                         |
    |"https://demoqa.com/login" | "User"   | "Name"   | "Invalid username or password!" |


  Scénario: