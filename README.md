# Schrodinger
Schrodinger had a cat. If the Java programming language had existed in 1935, then he may well have had a boolean (or some other Java construct). Fast forward to the 21st Century and here we have Schrodinger, a Java library that provides a new generic type, `Schrodinger`.

## Usage
Once Schrodinger is in the Maven Central repository, the easiest way to use Schrodinger will be to add it as a maven dependency.

```xml
<dependency>
    <groupId>com.lawrenceweetman</groupId>
    <artifactId>schrodinger</artifactId>
    <version>1</version>
</dependency>
```

### Generic Type
The main new element offered by Schrodinger is a generic type, `Schrodinger`. A Schrodinger can be initialised in a "Closed" state. In this closed state, the Schrodinger evaluates to TRUE, FALSE or any other Schrodinger object (regardless of the enclosed type). This is because in the multiverse of the Schrodinger generic type, any uninitialised object could - in theory - be *any* object!

```java
Schrodinger<String> schrodingerString = new Schrodinger<String>();
Schrodinger<Integer> schrodingerInteger = new Schrodinger<Integer>();

assertTrue(schrodingerString.isTrue());
assertTrue(schrodingerString.isFalse());
assertTrue(schrodingerString.equals(schrodingerInteger));
```

As a developer, the only way to be sure that you know exactly what a Schrodinger represents would be to explicitly set it to an instance of your specified type... Metaphorically "open the box", if you will.

```java
Schrodinger<String> schrodingerString = new Schrodinger<String>();
Schrodinger<Integer> schrodingerInteger = new Schrodinger<Integer>();

schrodingerString.set("Hello World!");
schrodingerInteger.set(1);

assertFalse(schrodingerString.isTrue());
assertFalse(schrodingerString.isFalse());
assertFalse(schrodingerString.equals(schrodingerInteger));
```

Obviously, if you set one of the Schrodingers explictly but not the other, then the other Schrodinger object could still match anything (including your current Schrodinger) as the `Integer` Schrodinger does in the following example:

```java
Schrodinger<String> schrodingerString = new Schrodinger<String>();
Schrodinger<Integer> schrodingerInteger = new Schrodinger<Integer>();

schrodingerString.set("Hello World!");

assertFalse(schrodingerString.isTrue());
assertFalse(schrodingerString.isFalse());

assertTrue(schrodingerInteger.isTrue());
assertTrue(schrodingerInteger.isFalse());
assertTrue(schrodingerInteger.equals(schrodingerString));
```

### Schrodinger's Boolean
Schrodinger's Boolean is declared as a convenience type, `SchrodingerBoolean`. It can take one of three states: `CLOSED`, `TRUE` or `FALSE`.

In the Closed state, SchrodingerBoolean works in the same way as a closed generic Schrodinger of type "Boolean".

```java
SchrodingerBoolean schrodingerBoolean = SchrodingerBoolean.CLOSED;
Schrodinger<String> schrodingerString = new Schrodinger<String>();

assertTrue(schrodingerBoolean.isTrue());
assertTrue(schrodingerBoolean.isFalse());
assertTrue(schrodingerBoolean.equals(schrodingerString));
```

In the TRUE or FALSE states, SchrodingerBoolean works in the same way as a normal boolean (or, for that matter, the same way as a "set" generic Schrodinger of type "Boolean"!).

```java
Schrodinger<String> schrodingerString = new Schrodinger<String>();

SchrodingerBoolean schrodingerBoolean = SchrodingerBoolean.TRUE;

assertFalse(schrodingerBoolean.isFalse());
assertTrue(schrodingerBoolean.isTrue());
assertTrue(schrodingerBoolean.equals(schrodingerString));

schrodingerString.set("Hello World!");

assertFalse(schrodingerBoolean.equals(schrodingerString));
```

## Contributors

- [Lawrence Weetman](https://github.com/lawrenceweetman/) (twitter: [@hairyagile](https://www.twitter.com/hairyagile))
- [Thom Sutcliffe](https://github.com/sutty17)