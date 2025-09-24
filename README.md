# Notes from Workbook 1D - Intro to Java

---

## 📖 Section 1-1: Thinking About Programming
**Programming →** the process of telling a computer what to do, step by step, in a language the computer understands.

---

## 🖥️ Module 2: Introducing Java
- **Java →** an object-oriented programming language.
- Strength: **Platform Independent**
    - Once translated into Java bytecode, it can run on many different types of computers.
- **WORA →** *Write Once, Run Anywhere!*
- Java is a **compiled language**.

---

## ✍️ Module 3: Basic Java Syntax
- Java is **case-sensitive**.
- Uses **semicolons (;)** as command terminators.
- **Comments in Java:**
    - Single line: `// This is a comment`
    - Multi-line: `/* This is a comment */`
- **Source code files**:
    - Contained in one or more `.java` files.
    - File must start with an uppercase letter and match the name of the class it contains.

---

## 📊 Data Types in Java
There are two main categories of data types:

1. **Primitive Data Types** (pre-defined by Java, represent simple values)
    - `boolean` → true/false, 1 bit
    - `char` → single Unicode character, 16 bits
    - Numeric types: `byte`, `short`, `int`, `long`, `float`, `double`

2. **Non-Primitive Data Types**
    - Arrays
    - Classes
    - Interfaces

---

### 🔢 Primitive Number Types
- **byte** → 8-bit number
    - Range: –128 to 127
- **short** → 16-bit number
    - Range: –32,768 to 32,767
- **int** → 32-bit number
    - Range: –2,147,483,648 to 2,147,483,647
- **long** → 64-bit number
    - Range: –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

- **float** → 32-bit floating point (approx. 6–7 digits of precision)
    - Range: ±3.40282347E+38F
- **double** → 64-bit floating point (approx. 15 digits of precision)
    - Range: ±1.79769313486231570E+308

---

### 🔡 Primitive Character Type
- **char** → 16 bits
    - Holds a single Unicode character (e.g., `'X'`)
    - Can also be used as an unsigned 16-bit number (0 to 65,535).

---

## 📦 Variables in Java
- Java is **statically-typed** → every variable **must** be assigned a data type.
- You can declare multiple variables of the same type on one line:
  ```java
  int x = 5, y, z = 50;
# 📌 Types of Variables in Java

In Java, variables are classified into **three main types**:

1. **Local Variables**
    - Declared **inside a method, constructor, or block**.
    - Exist **only while the method runs**, then destroyed.
    - **No default values** (must be initialized).
    - Example: method parameters are also local variables.

2. **Instance Variables**
    - Declared **inside a class but outside methods**.
    - Each **object** gets its own copy.
    - Have **default values** (e.g., `0`, `false`, or `null`).

3. **Static Variables (Class Variables)**
    - Declared with the keyword `static` inside a class.
    - Shared by **all objects** of the class (only one copy exists).
    - Have **default values**.

---

## 📝 Example: Local Variables
```java
public class Main {
    public static void main(String[] args) {

        // Example of local variables:
        // Local variables are declared inside a method
        // They exist only while the method runs

        int number1 = 10;  // local variable
        int number2 = 20;  // local variable

        int sum = number1 + number2; // local variable

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Sum: " + sum);
    }
}

```
# Common Data Types In Java

1. **int → Whole Numbers**
    - What it includes: Positive or negative whole numbers (no decimals)
    - Range: -2,147,483,648 to 2,147,483,647
    - Example:
      ```java
      int age = 25;
      int odometer = 45200;
      int zipCode = 98109; // not recommended if it starts with 0
      ```

2. **double → Decimal Numbers**
    - What it includes: Numbers with fractional values (decimals)
    - Range: Very large or very small values, up to ~15 digits of precision
    - Example:
      ```java
      double price = 19999.99;
      double gpa = 3.75;
      double pi = 3.14159;
      ```

3. **boolean → True/False**
    - What it includes: Only two possible values: `true` or `false`
    - Example:
      ```java
      boolean hasTowingPackage = true;
      boolean isStudent = false;
      boolean passedTest = true;
      ```

4. **char → Single Character**
    - What it includes: Exactly one character (letter, digit, or symbol)
    - Must use single quotes `' '`
    - Example:
      ```java
      char grade = 'A';
      char section = '3';
      char symbol = '#';
      ```

5. **String → Text**
    - What it includes: A sequence of characters (words, sentences, text data)
    - Must use double quotes `" "`
    - Example:
      ```java
      String name = "Ermi";
      String makeModel = "Ford Explorer";
      String phoneNumber = "206-555-1234";
      ```
### Section 3-2
### Operators and Expressions

## String Concatenation
- In Java, the `+` operator can join (concatenate) strings.
- You can also mix variables and string literals.
- Parameters and variables inside the concatenation are automatically converted to strings.

### Example 1: Using `+`
```java
public class BuildAStringApp {
    public static void main(String[] args) {
        String word1 = "Hello";
        String word2 = "World";
        String greeting;

        greeting = word1 + " " + word2 + "!";
        System.out.println(greeting);
    }
}
```

### Example 2: Using concat()
```java
public class ConcatExample {
    public static void main(String[] args) {
        String word1 = "Hello";
        String word2 = "World";

        String greeting = word1.concat(" ").concat(word2).concat("!");
        System.out.println(greeting);
    }
}

```
# Mathematical Operators and Expressions
- Addition, substraction, Multiplication, Division (+,-,* & /) 
- Remainder(Modulo) operator - (%)
```java
public class BasicIntegerMathApp {
 public static void main(String[] args){
 int a = 10;
 int b = 3;
 int result;
 result = a + b;
 System.out.println(result); // displays 13
 result = a - b;
 System.out.println(result); // displays 7
 result = a * b;
 System.out.println(result); // displays 30
 result = a / b;
 System.out.println(result); // displays 3
 result = a % b;
 System.out.println(result); // displays 1
 }
} 
```










External Resources link -
codemonkey.com

https://www.youtube.com/watch?v=cDA3_5982h8

https://www.youtube.com/watch?v=-kWDMVcglGY

https://www.youtube.com/watch?v=OLFlhvMmAK0&t=149s

https://www.youtube.com/watch?v=K-7gg6DeJQI

https://www.w3schools.com/java/java_ref_math.asp

https://docs.oracle.com/javase/tutorial/java/concepts/index.html

https://www.geeksforgeeks.org/java/object-oriented-programming-oops-concept-in-java/

https://www.tutorialspoint.com/java/java_oops_concepts.htm
