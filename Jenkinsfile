@Library("shared-library") _ //ESTE PIPELINE ES SOLO DE REFERENCIA Y PRUEBA.
def qualityGateValidation(qg) {
  if (qg.status != 'OK') {
    // emailext body: "WARNING SANTI: Code coverage is lower than 80% in Pipeline ${BUILD_NUMBER}", subject: 'Error Sonar Scan,   Quality Gate', to: "${EMAIL_ADDRESS}"
    return true
  }
  // emailext body: "CONGRATS SANTI: Code coverage is higher than 80%  in Pipeline ${BUILD_NUMBER} - SUCCESS", subject: 'Info - Correct Pipeline', to: "${EMAIL_ADDRESS}"
  return false
}
pipeline{
    agent any

    tools{
        nodejs 'nodejs'
    }

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
              echo "${PROJECT_ROOT} Instalar dependencias"
            }
        }
         stage('Unit test'){
            steps{
                //unitTest(project_root: PROJECT_ROOT)// poner la ruta en variable
                echo "${PROJECT_ROOT} Pruebas unitarias"
            }
        }
         stage('Generate coverage report'){
            steps{
                //coverageProject(project_root: PROJECT_ROOT)
                echo "${PROJECT_ROOT} Run coverage"
            }
        }

         stage('Scan'){
             environment {//variable de entorno
                scannerHome = tool 'sonar-scanner' //sonar-scanner es el nombre que se puso cuando se configuró el plugin en jenkins
            }
            steps{
                withSonarQubeEnv('sonarqube') {
                    escaner(scannerHome:"${scannerHome}",buildNumber:"${BUILD_NUMBER}",project_root: "${PROJECT_ROOT}" )
                }
                timeout(time: 3, unit: 'MINUTES') {
             
                    waitForQualityGate abortPipeline: qualityGateValidation(waitForQualityGate())
                }
                 //echo "${scannerHome}-- ${BUILD_NUMBER}--- ${PROJECT_ROOT} Scaneo"
            }
        }

        stage('Build Docker-image'){
            steps{
               // buildProject(project_root:"${PROJECT_ROOT}",registry:"${REGISTRY}",build_number:"${BUILD_NUMBER}")
               echo "${PROJECT_ROOT}-- ${REGISTRY}-- ${BUILD_NUMBER} Build Docker IMAGE"
            }
        }
        stage('Deploy Docker-image'){
            steps{
                //deployProject(project_root:"${PROJECT_ROOT}",build_number:"${BUILD_NUMBER}")
                echo "${PROJECT_ROOT}-- ${REGISTRY}-- ${BUILD_NUMBER} DEPLOY IMAGE DOCKER"
            }
        }        
    }
}

/*
docker run -it -d -p 3001:3000 --name prueba-corregida ID-IMAGEN
*/