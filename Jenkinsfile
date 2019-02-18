#!/usr/bin/env groovy
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {

        stage ('Artifactory configuration') {
            steps {

                rtMavenDeployer (
                        id: "MAVEN_DEPLOYER",
                        serverId: "Artifactory@mconnect.aero",
                        releaseRepo: "libs-release-local",
                        snapshotRepo: "libs-snapshot-local"
                )

                rtMavenResolver (
                        id: "MAVEN_RESOLVER",
                        serverId: "Artifactory@mconnect.aero",
                        releaseRepo: "libs-release",
                        snapshotRepo: "libs-snapshot"
                )
            }
        }

        stage ('Maven Build'){
            steps {
                rtMavenRun (
                        pom: "pom.xml",
                        goals: "clean install",
                        resolverId: "MAVEN_RESOLVER"
                )
            }
        }
    }
    post {
        always {
            deleteDir() /* clean up our workspace */
        }
        success {
            echo 'I succeeeded!'
        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
            echo 'I failed :('
        }
        changed {
            echo 'Things were different before...'
        }
    }
}