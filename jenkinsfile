pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                echo 'Getting from Get .....'
                echo 'Cloning .....'
            }
        }
           stage('Build') {
            steps {
                echo 'Building .....'
            }
        }
           stage('Test') {
            steps {
               sh 'date'
            }
        }
           stage('Deploy') {
            steps {
                echo 'Deploying .....'
            }
        }
    }
}
