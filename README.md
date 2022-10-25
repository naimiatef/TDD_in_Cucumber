# TDD (Test Driven Development)
- Le TDD est une méthode de conception basée sur les tests proposée par Kent Beck.
- Le TDD est un processus de développement itératif: Chaque itération commence par un ensemble de tests écrits pour une nouvelle fonctionnalité. Ces tests sont censés échouer au début de l’itération car il n’y aura pas de code d’application correspondant aux tests. Dans la phase suivante de l’itération, le code d’application est écrit avec l’intention de réussir tous les tests écrits précédemment dans l’itération. Une fois que le code d’application est prêt, les tests sont exécutés.
## Avantages du TDD
- Le test unitaire prouve que le code fonctionne réellement
- Peut piloter la conception du programme
- Le refactoring permet d’améliorer la conception du code
- Suite de tests de régression de bas niveau
- Testez d’abord réduisez le coût des bugs
- si vous écrivez votre code après votre test, ce code est plus facile à tester.
## Inconvénients du TDD
- Le développeur peut le considérer comme une perte de temps
- Le test peut être ciblé sur la vérification des classes et des méthodes et non sur ce que le code devrait vraiment faire
- Le test fait partie de la surcharge de maintenance d’un projet
- Repasser le test lorsque les exigences changent
- Si nous devions résumer cela comme des phases dans le processus de développement, nous pourrions écrire comme suit :
### Phase 1 (définition des exigences)
#### Exigence 1 : La calculatrice doit avoir la capacité d’ajouter deux nombres.
- Test 1: Étant donné deux nombres de nombres positifs (10 et 20), la calculatrice devrait être capable d’additionner les deux nombres et de nous donner le résultat correct (30)
- Test 2: Étant donné deux nombres négatifs (-10 et -20), la calculatrice devrait être capable d’additionner les deux nombres et de nous donner le résultat correct (-30)
### Phase 2 : Exécution des tests
- Dans cette phase, nous allons simplement exécuter nos tests. Faisons-le un par un
- Tentative 1: Lorsque nous exécutons nos tests pour la première fois, nous obtenons un message d’erreur
- Cette erreur indique clairement que la méthode Add n’est pas présente dans la classe Calculator. En détail, vous pouvez voir dans cette capture d’écran
### Phase 3 : Ajout/Refactorisation de code
- Après l’échec du test à l’étape précédente, nous allons prendre une action logique et nous allons simplement ajouter une méthode appelée Ajouter dans notre classe Calculatrice et lui faire retourner 0 pour le moment. 
- Maintenant, notre classe de calculatrice ressemblera à quelque chose comme ceci
```
public class Calculator {	
	public int Add(int number1, int number2)
	{		
		return 0;
	}
}
```
- Avec ce changement, nous allons passer à l’étape suivante qui consiste à réexécuter nos tests. Ce qui n’est rien d’autre que la phase 2 mentionnée plus tôt.
### Les résultats des deux tests sont :
 ```  java.lang.AssertionError: La somme de deux nombres négatifs est incorrecte attendue:<-30> mais était:<0> à org.junit.Assert.fail(Assert.java:88) ```
- Maintenant, avec cet échec de test, nous concluons que l’ajout de deux nombres positifs et négatifs ne se produit pas correctement. En fonction de l’échec du test, nous ajouterons juste assez de code pour que ces deux tests réussissent. Ce faisant, nous passons à la phase suivante, qui est la phase 3. Cette phase est déjà décrite plus tôt. Je vais juste vous montrer à quoi ressemblera le code de notre calculatrice après cette phase
```
public class Calculator {
	public int Add(int number1, int number2)
	{		
		return (number1 + number2);
	}	
}
```
- Nous allons maintenant exécuter nos tests Phase 2. Les résultats des tests après ce changement feront passer tous nos tests. Une fois tous les tests réussis, nous conclurons que notre itération est terminée.
# Le résumer en une figure peut être fait comme ceci:
### Les étapes du TDD :
- Écrire un test rouge
- Écrire le code le plus simple pour que le test soit vert
- Supprimer la duplication (code/test) et améliorer la lisibilité. C’est la phase du refactoring.
<div>
<img src="https://user-images.githubusercontent.com/7100940/197822513-46a664e8-aa05-4299-9b15-590fff75c288.png">
     </div>

- Écrivez un test unitaire qui échoue. 🔴
- Écrivez le code qui permet de réussir le test.
- Nettoyez le code tout en gardant les tests en succès. 🔶
- Écrivez le prochain test et recommencez ! 🔄
- Les tests qui échouent sont décrits comme rouges. Comme dans les feux de circulation, le rouge vous dit de vous arrêter et de faire fonctionner votre code.🚦
- Quand le test est réussi, on passe au vert. Le vert vous dit de faire du refactoring. Cela signifie simplement que vous essayez de rendre votre code plus lisible et/ou plus élégant sans changer son comportement.
