# groupe7PFE

# Pour Lancer avec Docker
Verifier que URI de la db dans application.properties du backend soit bien : mongodb://mongo:27017/projetPFE.
Si sous windows avoir docker desktop facilite le lancement.
```bash
  docker compose up --build
  ```

Pour peupler la base de données, utilisez la route suivante après avoir démarré les containers :
```bash
GET localhost:8080/api/addInDB
```


# Projet Full-Stack Angular et Java

Ce projet est une application web full-stack comprenant un front-end développé avec Angular et un back-end en Java. La base de données utilisée est MongoDB en local.

## Prérequis

Avant de commencer, assurez-vous d'avoir les outils suivants installés sur votre machine :

### Back-end
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Java JDK 21+](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/)

### Front-end
- [Node.js et npm](https://nodejs.org/)
- [Angular CLI](https://angular.io/cli) : Installez-le via npm avec la commande suivante :
  ```bash
  npm install -g @angular/cli
  ```

### Base de données
- [MongoDB Community Server](https://www.mongodb.com/try/download/community) : Installez et configurez une base de données locale.

## Installation

### 1. Clonez le projet

```bash
git clone https://github.com/Robert-Ailenei-vinci/groupe7PFE.git
cd groupe7PFE
```

### 2. Configuration de la base de données

Assurez-vous que MongoDB est en cours d'exécution sur votre machine.

- La base de données sera accessible en local.
- Le projet utilise par défaut l'URI suivante : `mongodb://localhost:27017/projetPFE`. Modifiez cela dans le fichier de configuration si nécessaire.

Pour peupler la base de données, utilisez la route suivante après avoir démarré le back-end :
```bash
GET localhost:8080/api/addInDB
```

### 3. Back-end

#### Étapes :
1. Ouvrez le projet back-end dans IntelliJ IDEA.
2. Assurez-vous que les dépendances Maven sont téléchargées.
3. Lancez l'application depuis la classe principale contenant `public static void main`.
4. Par défaut, le back-end est accessible à l'adresse suivante :
   ```
   http://localhost:8080
   ```

### 4. Front-end

#### Étapes :
1. Ouvrez le répertoire `frontEnd` dans Visual Studio Code.
2. Installez les dépendances npm :
   ```bash
   npm install
   ```
3. Lancez le front-end avec Angular CLI :
   ```bash
   ng serve
   ```
4. Par défaut, le front-end est accessible à l'adresse suivante :
   ```
   http://localhost:4200
   ```

## Fonctionnalités

- **Route API pour peupler la base de données** :
  - Méthode : GET
  - URL : `http://localhost:8080/api/addInDB`

## Structure du projet

```
groupe7PFE
├── backend
│   ├── src
│   │   └── main
│   │       ├── java
│   │       └── resources
├── frontend
│   ├── src
│   │   ├── app
│   │   └── assets  
└── README.md
```

## Auteur

- **Nom de l'auteur** : [Robert-Ailenei-vinci, rafael-millor-vinci, nicoco19, Steedlan, Simon-Bosseler-vinci
Simon-Bosseler-vinci, dimitri-danloy-vinci]

