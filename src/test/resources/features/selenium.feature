# new feature
# Tags: optional
#language: fr

Fonctionnalité: : Site Selenium


  Règle: L'utilisateur est deja sur la page webdriver
    Contexte: Un utilisateur se rend sur le site selenium
      Soit Un utilisateur se rend sur le site selnium "https://selenium.dev"
      Quand il clique sur le webdriver
      Alors il arrive sur la page du webdriver

    @dem
    Scénario: Un utilisateur se rend sur le site selenium
      Quand il clique sut le lien getting strated
      Alors il arrive sur la page getting started
      Quand il clique sur le lien de telechargement du nav
      Alors il arrive sur la page du telechargement
      Et il verifie que le contenue du titre est egal au "Downloads"