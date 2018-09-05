pipeline {
    agent any
    stages {
        stage('clean') {
            steps {
            bat 'mvn clean'
            }
        }
        stage('Install') {
            steps {
             bat 'mvn install'
            }
        }
        stage('Test') {
            steps {
            bat 'mvn test'
            }
        }
    }
}