# Comp-Sci-Notes-10-18-2021

```java
// some code
var a = new ArrayList<String>();
String[] strings = {"good", "bad", "ugly", "CS2334"};
a.addAll(strings); //incompatible types

List<String> l = Arrays.asList(strings); // variable T has incompatible bounds
List<String> grades = a; // somehow works lol

HashMap<String, ArrayList<String>> hm = new HashMap<>();

```
