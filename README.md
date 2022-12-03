# Selenium_Tuttorial
<a href="https://selenium.dev"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="180" alt="Selenium"/></a>
    

# About The Project
This project contains plenty of examples and tutorials for friends who want to study selenium.(Bu proje, selenium çalışmak isteyen arkadaşlar için birçok örnek ve öğretici içerik içermektedir.)
## Video



https://user-images.githubusercontent.com/57863133/205454213-6c8f135f-bed9-40f7-91fa-509467a30606.mp4


# How the Project Works
 To run the project, java must be installed on your computer. In addition, one of the ide like Eclipse or Intellij Idea must be installed.
 Then you can install and run the project on your computer by typing "git clone https://github.com/AbdurrahmanPulat/Selenium_Tuttorial.git" in the terminal.
 (Projeyi çalıştırmak için bilgisayarınızda java kurulu olmalıdır. Ayrıca Eclipse veya Intellij Idea gibi ide'lerden birinin kurulu olması gerekir.
 Ardından terminale "git clone https://github.com/AbdurrahmanPulat/Selenium_Tuttorial.git" yazarak projeyi bilgisayarınıza kurabilir ve çalıştırabilirsiniz.)
  * [About The Project](#About-The-Project)
  * [Video](#Video)
  * [How the Project Works](#How-The-Project-Works)
  * [Pom Xml](#Pom-Xml)
  

  

## Project Details
- I explained how the driver works with examples.(Driver'ın nasıl çalıştığını örnekler ile açıkladım)
- I explained how WebElements are found with examples.(WebElementlerin nasıl bulunduğu örnekler ile açıkladım.)

- I explained how to write unit tests with examples.(Birim testlerinin nasıl yazıldığını örnekler ile açıkladım)

- I explained the Junit tool with examples.(Junit aracını örnekler ile açıkladım.)

- I explained the TestNg tool with examples(TestNg aracını örnekler ile açıkladım)

## Pom Xml

```java
?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>Selenium_Tuttorial</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>18</maven.compiler.source>
        <maven.compiler.target>18</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>

        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.1.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.1.3</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.5</version>
            <scope>test</scope>
        </dependency>



    </dependencies>

</project>

```
