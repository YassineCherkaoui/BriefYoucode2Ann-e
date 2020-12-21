## Application Gestion Des Ustensiles

![utilisateur](https://assets.afcdn.com/story/20190205/1331223_w980h638c1cx3171cy2378.jpg)

## Contexte du projet

Il convient de modéliser les objets de la collection avec une hiérarchie de 5 classes comme indiqué dans la liste ci-dessous. Ecrivez le code de cette hiérarchie de classes, y compris les variables d'instance et les constructeurs. La méthode main du programme Test ci-dessous vous montre la façon d'appeler les constructeurs des classes qui sont instanciables.

1. Chaque Ustensile a une année de fabrication. Un Ustensile est soit une Assiette, soit une Cuillère. Il n'est pas possible d'instancier la classe Ustensile.
2. Une Assiette est soit une AssietteRonde, soit une AssietteCarree. Il n'est pas possible d'instancier la classe Assiette.
3. Chaque AssietteRonde à un rayon qui est une valeur double.
4. Chaque AssietteCarree à un cote qui est une valeur double.
5. Chaque Cuillère à une longueur qui est une valeur double. Comptage Complétez le code de la méthode afficherCuilleres pour qu'elle calcule et affiche le nombre d'objets de type Cuillere qui sont stockés dans le tableau us. Surface totale Complétez le code de la méthode afficherSurfaceAssiettes pour qu'elle calcule et affiche la somme des surfaces de toutes les assiettes stockées dans le tableau us, c'est-à-dire les assiettes rondes et les assiettes carrées. Il sera nécessaire de compléter la hiérarchie des classes avec des méthodes de calcul de surface. Evitez de dupliquer inutilement des instructions. La surface d'une assiette se calcule comme suit: 1.AssietteRonde : 3.14 _ rayon _ rayon 2.AssietteCarree : cote \* cote Valeur totale des ustensiles Complétez le code de la méthode afficherValeurTotale pour qu'elle calcule et affiche la somme des valeurs de tous les ustensiles stockés dans le tableau us. Il sera nécessaire de compléter la hiérarchie des classes avec des méthodes de calcul de valeur. La valeur d'un ustensile se calcule comme suit:
6. Cuillere et AssietteRonde : Si l'ustensile a moins de 50 ans, il vaut 0 Dhs. Sinon, il vaut 1 Dh pour chaque année qu'il a de plus de 50 ans, c'est-à-dire (2011 - année - 50). Par exemple, une AssietteRonde ou une Cuillere fabriquée en 1943 vaut 18 Dhs.
7. AssietteCarree : 5 fois la valeur qu'elle aurait eue en étant ronde (car les assiettes carrées sont plus rares). Par exemple, une AssietteCarree fabriquée en 1943 vaut 5 \* 18 Dhs Base de Données (Mysql) : Créer une base de données avec un nom de votre Choix qui contient 3 tables (AssietteRonde, AssietteCarree, Cuillere )
   1)- L’utilisateur peut ajouter 2 enregistrements pour chaque table dans la base de donnes
   2)- l’utilisateur peut modifier l’année de Ustensile

## HOW TO RUN !!

```bash
    # how to run
    1. Run Xampp
    2. Go to http://localhost/phpmyadmin
    3. Create database called ustensiles
    4. Import Database [Database_file]
    5. Go to consol (CMD)
    6. Write the following commande :
        "java -jar (location of jar file + \Application.jar)"
    7. Example : java -jar C:\Users\yassi\Desktop\Application.jar

    ## Enjoy

```
