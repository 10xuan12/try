plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

// No buildscript block necessary

allprojects {
    // No repositories configuration necessary here
    // Ensure individual module build.gradle files do not declare repositories
}

// Optional: Common configurations for all sub-projects/modules can be placed here
subprojects {
    // Example: Define common configurations or tasks for all subprojects if needed
    tasks.register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}
