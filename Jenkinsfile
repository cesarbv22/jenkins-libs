@Library("shared-library") _
pipeline{
    agent any
    stages{ // stage 1 de ejemplo
        stage('example'){
            steps {
              //  sh 'echo hello world'
              helloworld(day:"martes",name:"Marshall")
            }
        }

         stage('Hello'){
            steps {
              //  sh 'echo hello world'
              hello()
            }
        }

        stage('Checkout'){// este no estoy tan seguro de como adaptarlo
            steps{
              //   checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/cesarbv22/docker-pirate']]])
              //checkProject(class:"GitSCM",name:"*/main",url_repo:"https://github.com/cesarbv22/docker-pirate")
               checkoutProject()
            }
        }
    }
}