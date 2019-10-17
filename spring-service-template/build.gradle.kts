/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 */

plugins {
    val kotlinVersion = "1.3.50"

    id("java")
    id("idea")

    // Code coverage
    id("jacoco")

    // Apply the Kotlin JVM plugin to add support for Kotlin.

    id("org.springframework.boot") version "2.2.0.RELEASE"
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.jpa") version kotlinVersion
    id("io.spring.dependency-management") version "1.0.8.RELEASE"

    // Apply the application plugin to add support for building a CLI application.
    application
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    // Spring Boot
    implementation("org.springframework.boot:spring-boot-starter-actuator:2.1.9.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-web:2.1.9.RELEASE")

    // Apache Commons IO
    implementation("commons-io:commons-io:2.6")
    implementation("org.apache.commons:commons-collections4:4.4")
    implementation("org.apache.commons:commons-lang3:3.9")

    // JSON Serialization / Deserialization
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.10.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.10.0")

    // Env variable resolution
    implementation("io.github.cdimascio:java-dotenv:5.1.0")
}

application {
    // Define the main class for the application
    mainClassName = "net.kiberion.starter.App"
}

group = "net.kiberion"
version = "1.0.0-SNAPSHOT"