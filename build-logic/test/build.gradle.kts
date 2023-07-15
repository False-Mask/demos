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

dependencies {

    implementation("com.android.tools.build:gradle:7.2.0")

    // implementation("com.android.tools.build:gradle-api:7.2.0")
}

