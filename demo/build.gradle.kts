plugins {
    `java-library`
    id("org.example.greeting") version "1.0.0"
}

greeting {
    message = "Hey, greeting extn ..."
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    // Use JUnit test framework.
    testImplementation(libs.junit)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
