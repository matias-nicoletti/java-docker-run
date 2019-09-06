import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	java
	id ("com.gradle.build-scan") version "2.0.2"
	id("org.springframework.boot") version "2.1.7.RELEASE"
	id("io.spring.dependency-management") version "1.0.8.RELEASE"
	kotlin("jvm") version "1.2.71"
	kotlin("plugin.spring") version "1.2.71"
}

group = "com.matiasnicoletti"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	gradlePluginPortal()
	jcenter()
	mavenCentral()
	maven { setUrl("https://plugins.gradle.org/m2/") }
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
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

tasks.bootJar {
	archiveName = "app.jar"
	mainClassName = "com.matiasnicoletti.javadockerrun.JavaDockerRunApplicationKt"
}
