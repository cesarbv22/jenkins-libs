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

        // stage('Install Dependencies'){
        //     steps{
        //         installDependencies(project_root: "express-mysql/app")// aqui iria la variable de enntorno
        //     }
        // }
        //  stage('Unit test'){
        //     steps{
        //         unitTest(project_root: "express-mysql/app")// poner la ruta en variable
        //     }
        // }
        //  stage('Generate coverage report'){
        //     steps{
        //         coverageProject()
        //     }
        // }
        //  stage('Scan'){
        //      environment {//variable de entorno
        //         scannerHome = tool 'sonar-scanner' //sonar-scanner es el nombre que se puso cuando se configuró el plugin en jenkins
        //     }
        //     steps{
        //         withSonarQubeEnv('sonarqube') {
        //             scanningProject(scannerHome:"mandar el scaner de tools",buildNumber:"BUILD_NUMBER",project_root:)
        //         }
        //         timeout(time: 3, unit: 'MINUTES') {
        //       // In case of SonarQube failure or direct timeout exceed, stop Pipeline
        //             waitForQualityGate abortPipeline: qualityGateValidation(waitForQualityGate())
        //         }
        //     }
        // }

        // stage('Build Docker-image'){
        //     steps{
        //         buildProject(project_root:"ruta del proyecto",registry:"registro",build_number:"build number")
        //     }
        // }
        // stage('Deploy Docker-image'){
        //     steps{
        //         //deployProject()
        //     }
        // }        
    }
}