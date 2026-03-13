# Exception Handling in Java

In this module, I studied how Java handles runtime errors using exceptions and how to build programs that can deal with unexpected situations safely.

The focus was on understanding how exceptions propagate through the method call stack and how to properly handle them using Java's exception handling mechanisms.

## Topics Covered
- What an exception is
- Exception hierarchy in Java
- Checked vs unchecked exceptions
- `try` / `catch` structure
- Method call stack
- Stack trace
- `finally` block
- `throw` and `throws`
- Creating custom exceptions
- Delegating validation logic to domain classes

## Key Concepts
- Exceptions represent unexpected conditions during program execution.
- Checked exceptions must be handled or declared, while runtime exceptions do not require mandatory handling.
- When an exception occurs, it propagates through the call stack until it is handled.
- The stack trace provides detailed information about where the error happened.
- The `finally` block executes regardless of whether an exception occurred.
- Custom exceptions improve code organization and make error handling clearer.
- Proper exception handling leads to more robust and maintainable applications.

## Exercises
The exercises were focused on applying exception handling in practical scenarios.

One of the main exercises involved a hotel reservation system implemented in three different ways:

- Very poor solution: validation logic inside the main program
- Poor solution: validation delegated but returning error messages as strings
- Good solution: using custom exceptions to handle invalid operations properly

Another exercise involved a bank account system with withdrawal rules, where exceptions are thrown when the amount exceeds the limit or when there is insufficient balance.

These exercises helped reinforce how exception handling improves code quality and design.

---

## 🇧🇷 Resumo em português

Neste módulo estudei como o Java trata erros durante a execução utilizando exceções e como escrever programas mais robustos e seguros.

Aprendi sobre a hierarquia de exceções, a diferença entre exceções verificadas e não verificadas, o uso de try/catch, pilha de chamadas de métodos, stack trace, bloco finally, além de throw e throws.

Também pratiquei a criação de exceções personalizadas e a importância de delegar validações para as classes responsáveis.

Os exercícios mostraram na prática diferentes abordagens para resolver o mesmo problema, destacando como o uso de exceções torna o código mais limpo, organizado e alinhado com boas práticas de programação orientada a objetos.
