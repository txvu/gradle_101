plugins {
    id("application")
}

application {
    mainClass.set("dev.3amlab.Calculator")
}

dependencies {
    implementation(project(":projectB"))
//    runtimeOnly(project(":projectB"))
}
