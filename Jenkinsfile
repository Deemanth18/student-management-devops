pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code from GitHub'
                checkout scm
            }
        }

        stage('Automated Tests') {
            steps {
                echo 'Running JUnit tests'
                bat 'mvnw.cmd -B test'
            }
        }

        stage('Build') {
            steps {
                echo 'Building Student Management Application'
                bat 'mvnw.cmd -B package -DskipTests'
            }
        }

    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }

        success {
            archiveArtifacts artifacts: 'target/*.jar',
                             fingerprint: true

            echo 'Build completed successfully!'
        }

        failure {
            echo 'Build failed. Please check the console output.'
        }
    }
}