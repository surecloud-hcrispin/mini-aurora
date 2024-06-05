import org.jooq.meta.jaxb.Logging
import org.jooq.meta.jaxb.Property
import org.jooq.meta.jaxb.ForcedType

plugins {
	java
	id("org.springframework.boot") version "3.3.0"
	id("io.spring.dependency-management") version "1.1.5"
	id("io.freefair.lombok") version "8.6"
	id("nu.studer.jooq") version "9.0"
}

group = "main"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

sourceSets {
	main {
		java.srcDir("src/main/java")
	}

	test {
		java.srcDir("src/test/java")
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-graphql")
	implementation("com.graphql-java:graphql-java")
	implementation("org.springframework.boot:spring-boot-starter-jooq")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")

	implementation("org.springframework.boot:spring-boot-starter-web")

	implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity6")
	implementation("org.jooq:jooq")
	implementation("org.postgresql:postgresql")
	implementation ("org.springframework.boot:spring-boot-starter-data-jpa")


	runtimeOnly("org.postgresql:postgresql")

	jooqGenerator("org.postgresql:postgresql")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.boot:spring-boot-testcontainers")
	testImplementation("org.springframework:spring-webflux")
	testImplementation("org.springframework.graphql:spring-graphql-test")
	testImplementation("org.springframework.security:spring-security-test")
	testImplementation("org.testcontainers:junit-jupiter")
	testImplementation("org.testcontainers:postgresql")
	testImplementation("org.junit.jupiter:junit-jupiter-api")


	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

//jooq {
//	version.set("3.19.1")  // default (can be omitted)
//	edition.set(nu.studer.gradle.jooq.JooqEdition.OSS)  // default (can be omitted)
//
//	configurations {
//		create("main") {  // name of the jOOQ configuration
//			generateSchemaSourceOnCompilation.set(true)  // default (can be omitted)
//
//			jooqConfiguration.apply {
//				logging = Logging.WARN
//				jdbc.apply {
//					driver = "org.postgresql.Driver"
//					url = "jdbc:postgresql://localhost:5432/aurora-mini-db"
//					user = "postgres"
//					password = "postgres"
//					properties.add(Property().apply {
//						key = "ssl"
//						value = "false"
//					})
//				}
//				generator.apply {
//					name = "org.jooq.codegen.DefaultGenerator"
//					database.apply {
//						name = "org.jooq.meta.postgres.PostgresDatabase"
//						inputSchema = "public"
////                        forcedTypes.addAll(listOf(
////                            ForcedType().apply {
////                                name = "varchar"
////                                includeExpression = ".*"
////                                includeTypes = "JSONB?"
////                            },
////                            ForcedType().apply {
////                                name = "varchar"
////                                includeExpression = ".*"
////                                includeTypes = "INET"
////                            }
////                        ))
//					}
//					generate.apply {
//						isDeprecated = false
//						isRecords = true
//						isImmutablePojos = true
//						isFluentSetters = true
//					}
//					target.apply {
//						packageName = "nu.studer.sample"
//						directory = "build/generated-src/jooq/main"  // default (can be omitted)
//					}
//					strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"
//				}
//			}
//		}
//	}
//}


tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<JavaCompile> {
	options.compilerArgs.add("-parameters")
}