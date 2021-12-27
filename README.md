# basic branch

##### this branch basically is a new android studio project with common dependencies required to develop an app.

##### we will use this simple project with no organization mechanism to understand the basic steps required to use Kotlin dsl for our gradle instead of Groovy programming language.

##### you will find TODO for every step required to migrate our project from Groovy to KotlinDsl and all of those steps is about the syntax.

## Renaming gradle files

#### since we will use kotlin Dsl as our programming language for gradle, so we need to rename our gradle files to support kotlin language syntax by renaming the file to have the .kts extension (kts Stands for Kotlin Script) for example
    settings.gradle
#### to be
    settings.gradle.kts

## Step 1 (single quotation to double quotation )

##### this step to replace single quotation mark with double quotation mark in any .gradle file and that's because in Groovy we can use single quotation or double quotation for String value, but in Kotlin syntax we use double quotation and we can use the power of Android studio here by simply choose Edit/Find/Replace (ctrl+r) and repeat this step for every .gradle file.

## Step 2 and 6 ( Using function call for property assignment )

##### In Groovy,we call a function by it's name without parentheses for example
    id 'com.android.application'
##### if we go to the declaration of id, we will find that it's a function inside PluginDependencySpec interface.
##### so when we use Kotlin, it is required to call the function by using the parentheses so it will be the following for example
    id("com.android.application")
## Step 3 ( register gradle tasks )

##### A Task represents a single atomic piece of work for a build, such as compiling classes or generating javadoc.
##### In groovy we used task function in Project interface which is basically a project extension and call clean Task action and call delete function which take the target object (path) to delete
    task clean(type: Delete) {
    delete rootProject.buildDir
    }
##### In kotlin we use ProjectDelegate abstract class which is basically (Facilitates the implementation of the [Project] interface by delegation via subclassing) so we call getTasks() from delegate abstract property which return TaskContainer then we call an extension function for TaskContainer which take the name of that task and the responsible class for the task to use it's function inside the tasks block.
    tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
    }

## Step 4 (using the = operator for property assignment )

##### In groovy language we can assign a value to a property without using the = operator because it's optional in the syntax of the language for example
    minSdk 21
    targetSdk 31

##### on the other hand it's mandatory in Kotlin syntax so, we have to use the = operator to assign the 21 Integer value for the property minSdk and so on for any property
    minSdk = 21
    targetSdk = 31

## Step 5 ( renaming boolean variables to use "is" )
##### we can see here in groovy for example
    minifyEnabled false
##### minifyEnabled is a boolean variable, so it's a good practice to use "is" as a prefix for boolean variables in all programming languages and kotlin use that naming convention also, so it will be
    isMinifyEnabled = true

## Finally sync your project to apply the changes we made and you should see
    BUILD SUCCESSFUL in 17s

# Congratulation !! :clap: :clap: :clap:
