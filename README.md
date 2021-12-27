# organized-groovy-dsl branch

##### This branch will level us up to mange our Versions, Dependencies and even android default configuration we can put those values in ext extension as described [here](https://docs.gradle.org/current/dsl/org.gradle.api.plugins.ExtraPropertiesExtension.html)
    Extra properties extensions allow new properties to be added to existing domain objects. They act like maps, allowing the storage of arbitrary key/value pairs. All ExtensionAware Gradle domain objects intrinsically have an extension named “ext” of this type.
##### So we use this "ext" extension to hold that values.
![ext.versions](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-groovy-dsl/ScreenShots/02.png?raw=true)
![ext.config](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-groovy-dsl/ScreenShots/03.png?raw=true)
![ext.depends](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-groovy-dsl/ScreenShots/04.png?raw=true)
![ext.testDepends](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-groovy-dsl/ScreenShots/05.png?raw=true)
### Before we use it our module gradle was this
![defaultConfig](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-groovy-dsl/ScreenShots/08.png?raw=true)
![dependencies](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-groovy-dsl/ScreenShots/09.png?raw=true)
### After we use it our module gradle become more concise as you can see here

![defaultConfig](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-groovy-dsl/ScreenShots/06.png?raw=true)
![dependencies](https://github.com/Bassem-Kamal/GroovyToKtolinkDsl/blob/2-organized-groovy-dsl/ScreenShots/07.png?raw=true)