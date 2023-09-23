pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
include(":core:feature-api")
include(":core:dependencyprovider")
include(":feature:home-api")
include(":feature:settings-api")
include(":feature:onboarding-api")
include(":feature:home-impl")
include(":feature:onboarding-impl")
include(":feature:settings-impl")
