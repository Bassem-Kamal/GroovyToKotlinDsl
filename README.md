# organized-kotlin-dsl branch
### This branch will use the power of kotlin to organize Versions, Dependencies and even android default configuration as we did in [organized-groovy-dsl branch](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/tree/2-organized-groovy-dsl).
### So our module gradle was like this
![defaultConfig](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-kotlin-dsl/ScreenShots/02.png?raw=true)
![dependencies](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-kotlin-dsl/ScreenShots/03.png?raw=true)
### We added Config,Versions,Depends,TestDepends objects in the same file as that's ok for kotlin
![Config](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-kotlin-dsl/ScreenShots/04.png?raw=true)
![Versions](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-kotlin-dsl/ScreenShots/05.png?raw=true)
![Depends](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-kotlin-dsl/ScreenShots/06.png?raw=true)
![TestDepends](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-kotlin-dsl/ScreenShots/07.png?raw=true)
### now we will use those objects we just created inside our module gradle like this
![defaultConfig](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-kotlin-dsl/ScreenShots/08.png?raw=true)
![dependencies](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-kotlin-dsl/ScreenShots/09.png?raw=true)
### at this point you can see the powerful of using kotlin Dsl rather than groovy Dsl for gradle as we see our IDE options do better for syntax highlighted and code navigation for kotlin !, and we sill see more in coming branches
