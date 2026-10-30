# Design Patterns — TP N°2 (Observer, Decorator, Composite)

Reprise de l'implémentation des patterns de l'Activité Pratique N°2.

---

## Pattern Observer (comportement)

Le pattern Observer définit une relation **un à plusieurs** entre objets : quand
l'état d'un objet (l'**observable**) change, tous les objets qui en dépendent (les
**observateurs**) sont notifiés et se mettent à jour automatiquement.

### Structure (`com.school.designpatterns.observer`)

- `Observable` : interface avec `subscribe`, `unsubscribe` et `notifyObservers`.
- `Observer` : interface avec une seule méthode `update(int state)` (interface fonctionnelle).
- `ObservableImpl` : détient une liste d'observateurs et un `state`.
  `setState(...)` appelle automatiquement `notifyObservers()`.
- `ObserverImpl1` : affiche le nouvel état.
- `ObserverImpl2` : stocke un historique et calcule la moyenne.
- `App` : démo — souscription, changement d'état, désinscription, observateur lambda.

### Push vs Pull

- **Push** : l'observable pousse l'état via `update(int state)`. Simple, mais
  l'observateur peut être submergé. C'est la variante implémentée ici.
- **Pull** : l'observable notifie sans envoyer l'état (`update(Observable)`),
  et c'est l'observateur qui récupère la valeur quand il le souhaite via
  `observable.getState()`. L'observateur garde le contrôle (le "robinet").

---

## Pattern Decorator (structure)

Le pattern Decorator permet d'**attacher dynamiquement des responsabilités
supplémentaires** à un objet, sans modifier son code source (ouvert à
l'extension, fermé à la modification). Il repose sur l'héritage **et** la
composition : un décorateur *est un* composant et *a un* composant, ce qui permet
de chaîner les objets.

### Structure (`com.school.designpatterns.decorator`)

- `composant.Boisson` : composant abstrait (`description`, `cout()`).
- `composant.Sumatra`, `Espresso`, `Deca` : composants concrets.
- `decorateur.DecorateurBoisson` : décorateur abstrait (détient un `Boisson`).
- `decorateur.Chocolat`, `Caramel`, `Chantilly`, `Noisette` : décorateurs concrets.
- `App` : démo — `new Noisette(new Chocolat(new Caramel(new Sumatra())))`.

Exemple : un café "Sumatra" (6.0) décoré par le chocolat (1.2), le caramel (0.8)
et la noisette (0.5) donne la description "Sumatra au caramel au chocolat à la
noisette" pour un coût total de 8.5.

---

## Exécution

```bash
mvn test          # lance les tests JUnit
mvn compile       # compile

mvn exec:java -Dexec.mainClass="com.school.designpatterns.observer.App"
mvn exec:java -Dexec.mainClass="com.school.designpatterns.decorator.App"
```
