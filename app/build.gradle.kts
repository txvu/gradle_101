/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("gradle_101.java-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("gradle_101.app.App")
}