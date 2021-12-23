# basic branch

##### this branch basicly is a new android studio project with common dependencies required to develop an app.

##### we will use this simple project with no organization mechanism to understand the basic steps required to use Kotlin dsl for our gradle instead of Groovy programming language.

##### you will find TODO for every step required to migrate our project from Groovy to KotlinDsl and all of those steps is about the syntax.

## Step 1 (single quotation to double quotation )

##### this step to replace single quotation mark with double quotation mark in any .gradle file and that's because in Groovy we can use single quotation or double quotation for String value, but in Kotlin syntax we use double qutation and we can use the power of Android studio here by simply choose Edit/Find/Replace (ctrl+r) and repeat this step for every .gradle file.

## Step 2 ( Using function call for property assignment )

##### In Groovy,we call a function by it's name whitout parentheses for example
    id 'com.android.application'
##### if we go to the declaration of id, we will find that it's a function inside PluginDependencySpec interface.
##### so when we use Kotlin, it is required to call the function by using the parentheses so it will be the following for example
    id("com.android.application")
## Step 3 ( register gradle tasks )

##### 

## Step 4 (using the = operator for property assignment )

##### In groovy language we can assign a value to a proprty without using the = operator because it's optional in the syantx of the language for example
    minSdk 21
    targetSdk 31

##### on the other hand it's mandatory in Kotlin syntax so, we have to use the = operator to assign the 21 Integer value for the property minSdk and so on for any property
    minSdk = 21
    targetSdk = 31