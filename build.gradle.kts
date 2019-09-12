import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.run.BootRun

java.sourceCompatibility = JavaVersion.VERSION_11

plugins {
    kotlin("jvm") version "1.3.41"
    kotlin("plugin.spring") version "1.3.41"
    id("com.gradle.build-scan") version "2.0.2"
    id("org.springframework.boot") version "2.1.7.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = file(".java-version").readText().trim()
    }
}

tasks.getByName<BootRun>("bootRun") {
    main = "com.matiasnicoletti.javadockerrun.JavaDockerRunApplicationKt"
}

repositories {
    mavenCentral()
}
