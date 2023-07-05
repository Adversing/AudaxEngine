plugins {
    id("java-library")
}

group = "me.adversing"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.projectlombok:lombok:1.18.20")
    annotationProcessor("org.projectlombok:lombok:1.18.20")
    implementation("org.apache.commons:commons-lang3:3.12.0")

}

tasks.test {
    useJUnitPlatform()
}