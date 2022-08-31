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
              checkProject()
            }
        }

        stage('Install Dependencies'){
            steps{
                installDependencies(project_root: "express-mysql/app")// aqui iria la variable de enntorno
            }
        }
        //  stage('Unit test'){
        //     steps{
        //         //unitTest()
        //     }
        // }
        //  stage('Coverage'){
        //     steps{
        //         //coverage()
        //     }
        // }
        //  stage('Scan'){
        //     steps{
        //         //scanningProject()
        //     }
        // }
        // stage('Build Docker-image'){
        //     steps{
        //         //buildProject()
        //     }
        // }
        // stage('Deploy Docker-image'){
        //     steps{
        //         //deployProject()
        //     }
        // }        
    }
}