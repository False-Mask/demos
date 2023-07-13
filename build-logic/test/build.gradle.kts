plugins {
    `kotlin-dsl`
}

group = "org.example.transform"
version = "1.0.0"

gradlePlugin {

    plugins {
       val testPlugin by creating {
           this.id = "org.example.transform"
           implementationClass = "com.example.test.TransformEntryPoint"
       }
    }

}


java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}