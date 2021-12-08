grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
        mavenRepo 'https://maven.scijava.org/content/repositories/public/'
    }

    dependencies {
        compile 'com.github.kenglxn.qrgen:javase:2.1.0'
    }

    plugins {
        build ':release:2.2.1', ':rest-client-builder:1.0.3', {
            export = false
        }
    }
}
