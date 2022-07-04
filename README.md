## Probability Equality APP

Compares two probabilities

## System Requirements

1. JDK 15 or later
2. Gradle 7.4 or later

## Usage

1. To run all tests
    ```shell
    ./gradlew test
    ```
2. To build jar (App snapshot will be generated in `build/libs/<App>.jar` path)
   ```shell
   ./gradlew clean build
   ```


3. To start the application
   ```shell
    java -jar build/libs/probability-1.0-SNAPSHOT.jar
   ```

## Input and Output format

Input:

```
ProbabilityValue
ProbabilityValue
``` 

Output format:

```
String indicates equal or not
```

### Example input and output

Input:

```text
0.1
0.1
```

Output:

```text
both probabilities are equal
```

