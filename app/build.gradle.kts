plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
}

testing {
    suites {
        // Configure the built-in test suite
        val test by getting(JvmTestSuite::class) {
            // Use JUnit Jupiter test framework
            useJUnitJupiter("5.7.2")
        }
    }
}

application {
    mainModule.set("JavaFeatures")
    mainClass.set("com.icuxika.App")
}

for (version in 17..19) {
    val parentPackage = when (version) {
        17 -> "seventeen"
        18 -> "eighteen"
        19 -> "nineteen"
        else -> ""
    }
    task<JavaExec>("runApp$version") {
        classpath = sourceSets.main.get().runtimeClasspath
        mainModule.set("JavaFeatures")
        mainClass.set("com.icuxika.$parentPackage.App$version")
        jvmArgs = listOf("-XX:+PrintCommandLineFlags")
    }
}