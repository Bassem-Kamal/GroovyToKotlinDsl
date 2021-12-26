dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "GroovyToKtolinkDsl"
//TODO Step 2 :Using function calls instead of property assignment used by Groovy [include(":app")]
include ":app"
