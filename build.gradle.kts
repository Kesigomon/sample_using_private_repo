plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "com.kesigomon"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.kesigomon:sample_private_repo:1.0-SNAPSHOT") {
        version {
            branch = "master"
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}