plugins {
    buildsrc.conventions.base
    id("org.jetbrains.kotlinx.kover")
}

group = "net.thauvin.erik.urlencoder"
version = "1.4.0-SNAPSHOT"

dependencies {
    kover(projects.urlencoderLib)
    kover(projects.urlencoderApp)
}
