![image](https://github.com/Je18/JavaProject_Militaire/assets/96494194/045e30e1-6600-4486-b2a3-d2acd129a947)

🪖 TP Final : MILITAIRE :

Créer un projet JAVA nommé permettant de gérer une liste de militaires en respectant les principes de conception abordés dans ce cours.

	- Un militaire est caractérisé par un code, nom, prénom et une date de début de carrière.
	- Un militaire peut être un professionnel caractérisé par un nombre d’année de formation.
	- Un militaire peut être un réserviste caractérisé par un nombre d’intervention.

Exercice 1 : Modèle

	-	Créer les classes schématisant le modèle ci-dessus : Héritage, Constructeur, Getters, Setters

Exercice 2 : IHM

	Ecrire l’interface IHM en mode console permettant d’afficher par choix multiples.
	Le code de cette interface sera stocké dans une classe nommée « Main »
		1- Ajouter un professionnel
		2- Supprimer un professionnel
		3- Lister les professionnels existants
		4- Ajouter un réserviste
		5- Supprimer un réserviste
		6- Lister les réservistes existants
		7- Lister les militaires existants en mettant en évidence la fonction (Professionnel ou Réserviste)
	- Faites votre choix (1, 2, 3) :
		Quand l’utilisateur a fait son choix (1, 2, 3) :
	
			-	Traitement 1 : 
	 				- Le système affiche « Saisir le code, nom, prénom, date de début de carrière et nombre d’année de formation : »
					-	L’utilisateur saisi alors ses données
					-	Les données sont ajoutées à votre application.
		 
			-	Traitement 2 : 
	 				-	Le système affiche « Saisir le code : ».
					-	L’utilisateur saisie 0002
		 
			-	Traitement 3 : 
	 				-	Liste tous les professionnels les uns en dessous des autres. Créer des objets via des valeurs en dur dans le code pour le moment dans un objet de type ArrayList.
				Code, Nom, prénom, Date début carrière, Nombre d’année formation
					-	Nota : utiliser une fonction toString() qui sera redéfinie pour chaque classe fille.

			-	Traitement 4 : Idem pour les réservistes (Cf Traitement 1)
	 
			-	Traitement 5 : Idem pour les réservistes (Cf Traitement 2)
	 
			-	Traitement 6 : Idem pour les réservistes (Cf Traitement 3)
	 
			-	Traitement 7 : Exemple d’affichage attendu :
					-	Pestana Cyril formé pendant 8 ans
					-	Chuz Robby a effectué 7 interventions
					-	ORTI Chris formé pendant 6 ans
Exercice 3 : Optimisation

	-	Traitement A : Contrôler que le code saisi par l’utilisateur n’existe pas pour un militaire.
	Un message sera envoyé à l’utilisateur.
 
	-	Traitement B : Lors de la suppression, si le code saisi par l’utilisateur n’existe pas, un message est envoyé à l’utilisateur.
 
	-	Traitement C : Trier la liste des militaires par ordre croissant sur le code.
