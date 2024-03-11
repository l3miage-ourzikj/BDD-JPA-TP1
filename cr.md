
### Compte rendu 

##### Réponses aux questions 

### Question 1: Décrivez ce que vous observez en BD lorsque l'on déclare une classe comme ClassTestJPA

Dans ce cas étant donné qu'on est en mode create-drop, JPA va procéder à la création de la table correspondant à la classe
(sans avoir à valider quoique ce soit), par ailleurs, une fois le server éteint il va supprimer la table.

Il va donc procéder à sa création et on remarque ce qui suit:
 - Le nom de la table et les noms des attributs sont transformés en snake_case.
### Question 2: Quels sont les effets des propriétés ajoutées dans les @Column dans la classe ClassTestJPATwo ?
 D'une manière générale, les propriétés servent à fixer des **contraintes** sur les colonnes.
 
 plus précisement et en suivant les propriétés rajoutées dans notre cas:
 - **precision** -> le nombre de chiffres à après la virgule
 - **unique = true** -> contrainte d'unicité de la valeur dans le champs (colonne)

### Question 3: À votre avis, dans quels cas est-il nécessaire de mettre les annotations @Column ?
Il est nécessaire de mettre les annotation **@Column** lorsqu'on est en mode **validate** et donc on est obligé de bien détailler les types des attributs ainsi que leurs contraintes pour que JPA puisse le valider ou pas avec le schéma de la table existante.
Ou bien on rajoute l'annotation **@Column** lorsqu'on veut spécifier une **contrainte** même si on est sur un autre mode, en l'occurence **create-drop**.
   
