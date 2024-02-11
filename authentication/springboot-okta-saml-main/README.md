# springboot-okta-saml (Authentication and Authorization)

springboot saml and okta (Authentication and Authorization)


## Getting started

okay java | springboot saml and okta (Authentication and Authorization)

Get Started with Spring Boot, SAML, and Okta (Authentication and Authorization)

Step-1 Sign Up for an Okta Developer Account https://developer.okta.com.

Step-2 Create a SAML Application on Okta

           Single sign on URL: https://localhost:8443/saml/SSO

           Audience URI: https://localhost:8443/saml/metadata

           Copy meta data url

Step-3 Create a Spring Boot Application with SAML Support

            select Security, Web, Thymeleaf, and DevTools as dependencies

            Add the spring-security-saml-dsl dependency to your pom.xml

            Add Spring Milestone repository

Step-4 Add application.properties

Server.port = 8443

server.ssl.enabled = true

server.ssl.key-alias = spring

server.ssl.key-store = classpath:saml/keystore.jks

server.ssl.key-store-password = secret

security.saml2.metadata-url = your metadata url



Step-5 Generate keystore (Make sure you have java path environment variable setup)

keytool -genkey -v -keystore keystore.jks -alias spring -keyalg RSA -keysize 2048 -validity 10000


Step-6 Run the App and Login with Okta

            https://localhost:8443

