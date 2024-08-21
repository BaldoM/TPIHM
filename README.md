# Application de Gestion des Tâches

## Description

L'**Application de Gestion des Tâches** est une application de bureau conçue pour permettre aux utilisateurs de gérer efficacement leurs tâches quotidiennes. L'application est développée en Java en utilisant **JavaFX** pour l'interface utilisateur et **MySQL** comme base de données pour stocker les informations relatives aux tâches. Le projet est développé et géré dans **IntelliJ IDEA**.

## Fonctionnalités

- **Création de tâches** : Les utilisateurs peuvent créer de nouvelles tâches en définissant un titre, une description, une date d'échéance, et un statut.
- **Mise à jour des tâches** : Les utilisateurs peuvent modifier les détails d'une tâche existante.
- **Suppression des tâches** : Les utilisateurs peuvent supprimer des tâches qui ne sont plus nécessaires.
- **Affichage des tâches** : Les tâches sont listées avec leurs détails, permettant une visualisation claire des éléments à accomplir.
- **Filtrage et tri** : Les tâches peuvent être filtrées et triées par date d'échéance, statut, etc.
- **Connexion à une base de données** : L'application se connecte à une base de données MySQL pour stocker et récupérer les informations des tâches.

## Prérequis

Avant de pouvoir exécuter l'application, vous devez avoir les éléments suivants installés sur votre machine :

- **Java Development Kit (JDK)** 8 ou supérieur
- **JavaFX SDK** (inclus avec les versions récentes du JDK)
- **MySQL** (ou un autre SGBD compatible)
- **IntelliJ IDEA** (version Community ou Ultimate)

## Installation

1. **Cloner le dépôt** :
    ```bash
    git clone https://github.com/BaldoM/TPIHM.git
    ```

2. **Configurer la base de données** :
    - Créez une base de données MySQL.
    - Exécutez le script SQL fourni dans le fichier `consultation.sql` pour créer les tables nécessaires.

3. **Configurer le projet dans IntelliJ IDEA** :
    - Ouvrez le projet dans IntelliJ IDEA.
    - Configurez le chemin du SDK Java et JavaFX si nécessaire.
    - Modifiez le fichier `application.properties` pour y entrer vos identifiants de connexion MySQL.

4. **Exécuter l'application** :
    - Compilez et exécutez le projet depuis IntelliJ IDEA.

## Utilisation

1. **Lancement de l'application** :
    - À partir d'IntelliJ IDEA, exécutez le fichier `Main.java`.
    - L'application démarrera et l'interface utilisateur s'affichera.

2. **Gestion des tâches** :
    - Utilisez l'interface pour ajouter, mettre à jour, supprimer et afficher les tâches.

## Contribuer

Les contributions sont les bienvenues ! Pour proposer des modifications, veuillez :

1. Forker le dépôt.
2. Créer une branche pour votre fonctionnalité (`git checkout -b ma-nouvelle-fonctionnalité`).
3. Committer vos modifications (`git commit -am 'Ajout de ma nouvelle fonctionnalité'`).
4. Push la branche (`git push origin ma-nouvelle-fonctionnalité`).
5. Ouvrir une Pull Request.

## Auteurs

- **Baldo MWAMBA** - *Développeur principal* - [Profil GitHub](https://github.com/BaldoM)

## License

Ce projet est sous licence MIT - voir le fichier [LICENSE](LICENSE) pour plus de détails.
