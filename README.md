# Pattern Observer

Reprise de l'implémentation du pattern Observer (Activité Pratique N°2).

## Objectif

Le pattern Observer (comportement) définit une relation **un à plusieurs** entre
objets : quand l'état d'un objet (l'**observable**) change, tous les objets qui en
dépendent (les **observateurs**) sont notifiés et se mettent à jour automatiquement.

## Structure

- `Observable` : interface avec `subscribe`, `unsubscribe` et `notifyObservers`.
- `Observer` : interface avec une seule méthode `update(int state)` (interface fonctionnelle).
- `ObservableImpl` : détient une liste d'observateurs et un `state`.
  `setState(...)` appelle automatiquement `notifyObservers()`.
- `ObserverImpl1` : affiche le nouvel état.
- `ObserverImpl2` : stocke un historique et calcule la moyenne.
- `App` : démo — souscription, changement d'état, désinscription, observateur lambda.

## Push vs Pull

Deux variantes existent pour la notification :

- **Push** : l'observable pousse l'état vers l'observateur via
  `update(int state)`. Simple, mais l'observateur peut être submergé de
  notifications. C'est la variante implémentée ici.
- **Pull** : l'observable notifie sans envoyer l'état (`update(Observable)`),
  et c'est l'observateur qui récupère la valeur quand il le souhaite via
  `observable.getState()`. L'observateur garde le contrôle (le "robinet").

## Exécution

```bash
mvn test          # lance les tests JUnit
mvn compile       # compile

mvn exec:java -Dexec.mainClass="com.school.designpatterns.observer.App"
```
