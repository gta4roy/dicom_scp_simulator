plugins {
    id("java")
}

group = "com.dicom.service"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://mvnrepository.com/artifact")
    }
    maven{
        url = uri("https://maven.dcm4che.org/")
    }
}

dependencies {
    // https://mvnrepository.com/artifact/dcm4che/dcm4che-core
    implementation("dcm4che:dcm4che-core:2.0.29")
    // https://mvnrepository.com/artifact/dcm4che/dcm4che-net
    implementation("dcm4che:dcm4che-net:2.0.29")
    // https://mvnrepository.com/artifact/dcm4che/dcm4che-image
    implementation("dcm4che:dcm4che-image:2.0.29")
    // https://mvnrepository.com/artifact/dcm4che/dcm4che-iod
    implementation("dcm4che:dcm4che-iod:2.0.29")

    // https://mvnrepository.com/artifact/dcm4che/dcm4che
    implementation("dcm4che:dcm4che:2.0.29")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}