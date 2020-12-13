## Brief 2 : Gestion des employés Java

## Contexte :

Développer une application qui implémente le code ci-joint et qui permet la gestion des employés
d’une maison d’optique

Développez les classes nécessaires pour le fonctionnement du programme ci-dessous
public class DriverJobs {
public static void main(String[] argv) {
Personne[] personnes = new Personne[2];
personnes[0] = new Medecin("Maher",31);
personnes[1] = new Opticienne("Iman",33);
for (int i = 0; i < personnes.length; i++)
personnes[i].afficher();
}
Exemple d’exécution :

- Je suis Maher, j’ai 31 ans et je travaille en tant que médecin !
- Je suis Iman, j’ai 33 ans et je travaille en tant que opticienne !

## Compétences visées :

Développer la partie back-end d’une interface utilisateur web
