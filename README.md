# Fibonacci Java Library

A Java 21 library for easy and efficient Fibonacci number calculations.

## Features

### Core Features
- **Basic Fibonacci Calculation**
  - `getNthFibonacci(int n)`: Get the nth Fibonacci number.
  - `generateFibonacciSeries(int n)`: Generate the first n Fibonacci numbers.
  - `generateFibonacciUpTo(int maxValue)`: Generate Fibonacci numbers up to a specified value.

### Efficiency Improvements
- **Iterative and Recursive Approaches**
  - `getNthFibonacciIterative(int n)`: Get the nth Fibonacci number using an iterative approach.
  - `getNthFibonacciRecursive(int n)`: Get the nth Fibonacci number using a recursive approach.
  - `getNthFibonacciMemoized(int n)`: Get the nth Fibonacci number using a memoized recursive approach.
  - `getNthFibonacciMatrix(int n)`: Get the nth Fibonacci number using matrix exponentiation.

### Additional Features
- **Mathematical Properties**
  - `isFibonacciNumber(int num)`: Check if a number is a Fibonacci number.
  - `findFibonacciPosition(int num)`: Find the position of a given Fibonacci number (if it exists).
  - `calculateGoldenRatioApproximation(int n)`: Calculate the golden ratio approximation using Fibonacci numbers.

- **Customization and Configuration**
  - `generateCustomFibonacciSeries(int first, int second, int n)`: Generate a Fibonacci series with custom starting values.
  
- **Utility Functions**
  - `sumFibonacciRange(int start, int end)`: Sum Fibonacci numbers in a given range.
  - `sumFirstNFibonacci(int n)`: Calculate the sum of the first n Fibonacci numbers.

### Documentation and Examples
- Comprehensive documentation with examples for each feature.
- Tutorials and use-cases to demonstrate library usage.
- Javadoc comments for all public methods and classes.

### Advanced Features
- **Multithreading Support**
  - Multithreaded Fibonacci calculation for large values.
  - Ensure thread safety in all methods.

### Error Handling and Validation
- **Robust Error Handling**
  - Input validation to ensure method arguments are within acceptable ranges.
  - Comprehensive error handling for invalid inputs.

### Testing and Quality Assurance
- **Unit Testing**
  - Comprehensive unit tests using JUnit.
  - Continuous integration setup to ensure code quality and reliability.

## Getting Started

### Prerequisites
- Java 21

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/AfonsoFaria20s/fibonacci-java-library.git
   ```
2. Navigate to the project directory:
   ```sh
   cd fibonacci-java-library
   ```
3. Build the project using Maven or Gradle:
   ```sh
   mvn clean install
   ```
   or
   ```sh
   gradle build
   ```

### Usage
Here's a quick example to get you started:

```java
import org.faria.fibonacci.Fibonacci;

public class Main {
    public static void main(String[] args) {
        int n = 8;
        int fibNumber = Fibonacci.getNthFibonacci(n);
        System.out.println("The 8th Fibonacci number is: " + fibNumber);

        List<Integer> series = Fibonacci.generateFibonacciSeries(10);
        System.out.println("First 10 Fibonacci numbers: " + series);
    }
}
```

### Documentation
- Detailed documentation is available in the `docs` folder.
- Javadocs can be generated using:
  ```sh
  mvn javadoc:javadoc
  ```

## Contributing
We welcome contributions! Please see `CONTRIBUTING.md` for details.

## License
This project is licensed under the MIT License - see the `LICENSE` file for details.

## Acknowledgements
Special thanks to the open-source community for the support and contributions.
```

This `README.md` should provide a comprehensive and clear overview of your Fibonacci Java library.