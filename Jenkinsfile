@Library("shared-library") _
pipeline{
    agent any

    // tools{
    //     nodejs 'nodejs'
    // }

    environment {//
      PROJECT_ROOT = 'express-mysql/app'
      REGISTRY = 'cesarbv/docker-pirate-express'
      /*
      ESTRUCTURA DE LAS IMAGENES EN SU NOMBRE 
        RegistryName/folderName/NFolderName/imageName:tag
      */
    }

    stages{ // stage 1 de ejemplo
        stage('example'){
            steps {
              helloworld(day:"martes",name:"Marshall")
            }
        }

         stage('Hello'){
            steps {
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
               // installDependencies(project_root: PROJECT_ROOT)// aqui iria la variable de enntorno
               echo "${PROJECT_ROOT} PRUEBA"
            }
        }
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