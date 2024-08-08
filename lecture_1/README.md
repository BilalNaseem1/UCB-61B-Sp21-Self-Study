# Introduction to Java
1. In Java, all code must live inside a class.
2. We delimit beginning and end segments of code using `{` and `}`
3. statement end with `;`
```java
// declaring a class
public class HelloWorld {

}
```
- but this will throw an error

```java
// declaring a class
public class HelloWorld {
    public static void main (String[] args) {

    }
}

// now compiler is happy - wont throw an error
```