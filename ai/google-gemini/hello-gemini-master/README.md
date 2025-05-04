# Hello Gemini 2.0 Flash: A Spring Boot Starter for Vertex AI Gemini

## Introduction

This Spring Boot application demonstrates how to use Spring AI and Vertex AI Gemini to build LLM-powered applications. Spring AI provides a simple abstraction for building applications powered by foundation models.

## Project Requirements

* Java 23
* Maven
* Google Cloud Project

## Dependencies

This project uses the following dependencies:

* `spring-ai-vertex-ai-gemini-spring-boot-starter`
* `spring-boot-starter-web`

## Getting Started

To get started, you'll need to create a Google Cloud Project and enable the Vertex AI API. Once you've done that, you can create a Gemini model and deploy it to an endpoint.

## How to Run the Application

1. Clone the repository:

   ```bash
   git clone https://github.com/danvega/hello-gemini.git
   ```

2. Navigate to the project directory:

   ```bash
   cd hello-gemini
   ```

3. Build the application:

   ```bash
   mvn clean install
   ```

4. Run the application:

   ```bash
   mvn spring-boot:run
   ```

## Relevant Code Examples

The following code example shows how to use the `ChatClient` to send a prompt to a Gemini model and receive a response:

```java
ChatResponse response = chat.prompt("Tell me an interesting fact about Google")
      .call()
      .chatResponse();

System.out.println(response);
```

## Conclusion

This project provides a starting point for building LLM-powered applications with Spring AI and Vertex AI Gemini. With Spring AI, you can easily integrate Gemini models into your Spring Boot applications.

If you have any questions or feedback, please feel free to open an issue or submit a pull request.