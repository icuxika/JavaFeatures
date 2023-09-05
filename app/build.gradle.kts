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

val ENABLE_PREVIEW = "--enable-preview"

tasks.withType<JavaCompile> {
    val compilerArgs = options.compilerArgs
    compilerArgs.add(ENABLE_PREVIEW)
    // idea 对于使用到需要手动export的内部类依然会报错，但是 gradle 任务已经可以正确运行，
    // 如果想要 idea 不报错，根据它的提示点击一下 会在 Settings|Build,Execution,Deployment|Compiler|Java Compiler 的
    // Override compiler parameters per-module: 添加一个编译选项 --add-exports java.base/jdk.internal.vm=JavaFeatures
    // 请注意写在 gradle 配置文件中 --add-exports 后面跟着等号，如果不加等号，就会告诉你无法识别
    // 此处配置的会在编译时生效，下面JavaExec任务配置的会在运行时检查
    compilerArgs.add("--add-exports=java.base/jdk.internal.vm=JavaFeatures")
}

tasks.withType<Test> {
    jvmArgs = listOf(ENABLE_PREVIEW)
}

for (version in 17..20) {
    val parentPackage = when (version) {
        17 -> "seventeen"
        18 -> "eighteen"
        19 -> "nineteen"
        20 -> "twenty"
        else -> ""
    }
    task<JavaExec>("runApp$version") {
        classpath = sourceSets.main.get().runtimeClasspath
        mainModule.set("JavaFeatures")
        mainClass.set("com.icuxika.$parentPackage.App$version")
        jvmArgs =
            listOf(
                "-Dsun.stdout.encoding=UTF-8",
                "-XX:+PrintCommandLineFlags",
                ENABLE_PREVIEW,
                "--add-exports=java.base/jdk.internal.vm=JavaFeatures",
                "--enable-native-access=JavaFeatures",
                "-Djava.library.path=C:\\CommandLineTools\\ffmpeg-6.0-full_build-shared\\bin"
            )
    }
}

